import java.util.LinkedList;
import java.util.List;

public class Department {
    public List<Tool> tools = new LinkedList<>();
    public Department() {

    }



 /*   public Tool[] findByTool(String str) {
        Tool [] FinalTools=new Tool [];
 return FinalTools;
    }
    public List<Tool> findByWork(Work work){
List<Tool> FinalList= new List<Tool>;
return FinalList;
    }

*/

    public List<Tool> findByGroup(Work work , Instrument instrument){
    List<Tool>resultTools = new LinkedList<Tool>();

    for (Tool tool : tools) {
        if ((tool.getWork()== work) || (tool.getInstrument()== instrument)){
            resultTools.add(tool);
    }
    }
    return resultTools;
}

}

