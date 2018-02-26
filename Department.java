import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Department {

    public List<Tool> tools = new LinkedList<>();

    public Department() {

    }
//*******************METHOD HOW TO FIND BY GROUP************************

    public List<Tool> findByGroup(Work work, Instrument instrument) {
        List<Tool> resultTools = new LinkedList<Tool>();

        for (Tool tool : tools) {
            if ((tool.getWork() == work) || (tool.getInstrumentType() == instrument)) {
                resultTools.add(tool);
            }
        }
        return resultTools;
    }


//*******************FINAL LISTS**********************


    public List<Tool> findByTool(String str) {
        List<Tool> finalTools = new LinkedList<>();
        return finalTools;
    }

    public List<Tool> findByWork(Work work) {
        List<Tool> FinalList = new LinkedList<Tool>();
        return FinalList;
    }

    public void sortByInstrument(List<Tool> resultTools) {
        resultTools.sort(new Comparator<Tool>() {
            public int compare(Tool t1, Tool t2) {
                return t1.getInstrumentType().compareTo(t2.getInstrumentType());
            }
        });

    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public void addTool(Tool tool) {
        this.tools.add(tool);

    }

}
