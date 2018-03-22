/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor.cuestionario;

/**
 *
 * @author MPA
 */
public class Token {
    
    public final String valor;
    public final TipoToken tipo;
    
    public Token(String valor, TipoToken tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "Token("+valor+","+tipo+")";
    }    
}
