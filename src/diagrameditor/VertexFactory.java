package diagrameditor;

public class VertexFactory {
    public CustomVertex getVertex(String vertexType){
        if(vertexType == null){
            return null;
        }
        if(vertexType.equalsIgnoreCase("ConditionVertex")){
            return new ConditionVertex();
        }else if(vertexType.equalsIgnoreCase("FlowVertex")){
            return new FlowVertex();
        }else if(vertexType.equalsIgnoreCase("NodeVertex")){
            return new NodeVertex();
        }else if(vertexType.equalsIgnoreCase("RoleVertex")){
            return new RoleVertex();
        }
        return null;
    }
}
