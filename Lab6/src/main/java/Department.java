import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Department {

    private List<Tool> tools = new LinkedList<Tool>();

    public Department() {

    }

    public final List<Tool> findByGroup(final Work work, final Instrument instrument) {
        List<Tool> resultTools = new LinkedList<Tool>();

        for (Tool tool : tools) {
            if ((tool.getWork() == work) || (tool.getInstrumentType() == instrument)) {
                resultTools.add(tool);
            }
        }
        return resultTools;
    }

    public final void sortByInstrument(final List<Tool> resultTools) {
        resultTools.sort(Comparator.comparing(Tool::getInstrumentType));
    }

    public final List<Tool> getTools() {
        return tools;
    }

//    public final void setTools(final List<Tool> tools) {
//        this.tools = tools;
//    }

    public final void addTool(final Tool tool) {
        this.tools.add(tool);
    }

}
