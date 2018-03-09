package diagrameditor.workfloweditor;

public class NodoFactory {

    public static NodoBase getNodo(String tipoNodo) {
        if (tipoNodo == null) {
            return null;
        }
        switch (tipoNodo) {
            case "NodoCondicion":
                return new NodoCondicion("Condición");
            case "NodoFlujo":
                return new NodoFlujo("Flujo");
            case "NodoInicio":
                return new Nodo("Inicio", TipoNodo.Inicio);
            case "NodoFin":
                return new Nodo("Fin", TipoNodo.Fin);
            case "NodoProceso":
                return new Nodo("Proceso", TipoNodo.Proceso);
            case "NodoRol":
                return new NodoRol("Rol");
        }
        return null;
    }
}
