package diagrameditor;

public class NodoFactory {

    public static Nodo getNodo(String tipoNodo) {
        if (tipoNodo == null) {
            return null;
        }
        switch (tipoNodo) {
            case "NodoCondicion":
                return new NodoCondicion("Condición", TipoNodo.Fin);
            case "NodoFlujo":
                return new NodoFlujo("Flujo");
            case "NodoInicio":
                return new NodoProceso("Inicio", TipoNodo.Inicio);
            case "NodoFin":
                return new NodoProceso("Fin", TipoNodo.Fin);
            case "NodoProceso":
                return new NodoProceso("Proceso", TipoNodo.Proceso);
            case "NodoRol":
                return new NodoRol("Rol");
        }
        return null;
    }
}
