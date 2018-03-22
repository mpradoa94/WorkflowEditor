/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor.cuestionario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author MPA
 */
public class EvaluadorFunciones {

    private String texto;

    public EvaluadorFunciones(String texto) {
        this.texto = texto;
    }

    public boolean evaluar() {
        List<Token> tokensFunc;
        List<Token> tokens = tokenize(texto);
        Funciones precond = Funciones.getInstancia();
        List<Precondicion> funciones = precond.getFunciones();
        List<String> listaNombres;
        listaNombres = funciones.stream().map(Precondicion::getNombre).collect(Collectors.toList());

        if (tokens.get(0).tipo == TipoToken.PRECOND_NOMBRE) {
            String nombre = tokens.get(0).valor;
            if (listaNombres.contains(nombre)) {
                tokensFunc = tokenize(funciones.get(listaNombres.indexOf(nombre)).getFuncion());
                return compararListaTokens(tokens, tokensFunc);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public List<Token> tokenize(String texto) {
        List<Token> tokens = new ArrayList<Token>();

        String token = "";
        Boolean esPalabra = false;
        char c_pasado = '\0';
        EstadoToken estado = EstadoToken.DEFAULT;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            switch (estado) {
                case DEFAULT:
                    if (c == '|') {
                        tokens.add(new Token(Character.toString(c), TipoToken.OR));
                    } else if (c == ',') {
                        tokens.add(new Token(Character.toString(c), TipoToken.COMA));
                    } else if (c == '(') {
                        tokens.add(new Token(Character.toString(c), TipoToken.IZQ_PAREN));
                    } else if (c == ')') {
                        tokens.add(new Token(Character.toString(c), TipoToken.DER_PAREN));
                    } else if (c == '…') {
                        token += c;
                        estado = EstadoToken.CONT;
                    } else if (c_pasado == '.' && c == '.') {
                        token += "..";
                        estado = EstadoToken.CONT;        
                    }else if (c_pasado == '@' && c == '@') {
                        estado = EstadoToken.PRECOND;
                    } else if (c_pasado == '@' && Character.isLetterOrDigit(c)) {
                        token += c;
                        estado = EstadoToken.VARIABLE;
                    } else if (Character.isLetter(c)) {
                        token += c;
                        estado = EstadoToken.PALABRA;
                    }
                    break;
                case PRECOND:
                    if (Character.isLetter(c)) {
                        token += c;
                    } else {
                        tokens.add(new Token(token, TipoToken.PRECOND_NOMBRE));
                        token = "";
                        estado = EstadoToken.DEFAULT;
                        i--;
                    }
                    break;
                case VARIABLE:
                    if (Character.isLetterOrDigit(c)) {
                        token += c;
                    } else {
                        tokens.add(new Token(token, TipoToken.VARIABLE));
                        token = "";
                        estado = EstadoToken.DEFAULT;
                        i--;
                    }
                    break;
                case PALABRA:
                    if (Character.isLetterOrDigit(c)) {
                        token += c;
                    } else {
                        tokens.add(new Token(token, TipoToken.NOMBRE));
                        token = "";
                        estado = EstadoToken.DEFAULT;
                        i--;
                    }
                    break;
                case CONT:
                    if (!Character.isLetterOrDigit(c) && c != ' ' && c != '.') {
                        tokens.add(new Token(token, TipoToken.CONTINUA));
                        token = "";
                        estado = EstadoToken.DEFAULT;
                        i--;
                    } else {
                        token += c;
                    }
                    break;

            }
            c_pasado = c;
        }

        if (!"".equals(token)) {
            if (estado == EstadoToken.PRECOND) {
                tokens.add(new Token(token, TipoToken.PRECOND_NOMBRE));
            } else if (estado == EstadoToken.VARIABLE) {
                tokens.add(new Token(token, TipoToken.VARIABLE));
            } else if (estado == EstadoToken.PALABRA) {
                tokens.add(new Token(token, TipoToken.NOMBRE));
            }
        }

        return tokens;
    }

    private boolean compararListaTokens(List<Token> lista1, List<Token> lista2) {
        boolean res = true;
        boolean cont = false;
        for (int i = 1; i < lista1.size(); i++) {
            
            if (cont){
                if (!lista1.get(i).tipo.equals(TipoToken.NOMBRE))
                    res = false;
            } else if (!lista1.get(i).tipo.equals(lista2.get(i).tipo)) {
                res = false;
            }
            
            //otros tipos
            if (i + 1 < lista2.size()) {
                if (lista2.get(i + 1).tipo == TipoToken.OR) {
                    if (res == false) {
                        res = true;
                        i++;
                    } else {
                        i += 2;
                    }
                }
                else if (lista2.get(i).tipo == TipoToken.CONTINUA){
                    i++;
                    cont = true;
                }
            }
        }
        return res;
    }

}
