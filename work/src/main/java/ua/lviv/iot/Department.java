package ua.lviv.iot;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Department {

    public List<Tool> tools = new LinkedList<>();

    public Department() {

    }

    public List<Tool> findByGroup(Work work, Instrument instrument) {
        List<Tool> resultTools = new LinkedList<Tool>();

        for (Tool tool : tools) {
            if ((tool.getWork() == work) || (tool.getInstrumentType() == instrument)) {
                resultTools.add(tool);
            }
        }
        return resultTools;
    }

    public void sortByInstrument(List<Tool> resultTools) {
        resultTools.sort(Comparator.comparing(Tool::getInstrumentType));
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
