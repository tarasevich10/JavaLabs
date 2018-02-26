import java.util.List;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.addTool(new Shovel( Work.DIG_AROUND));
        department.addTool(new Rake( Work.TAKE_LEAVES));
        department.addTool(new Secateur( Work.CUT_BRANCHES));



        System.out.println("\nList of searched tools:\n");
        List<Tool> resultTools = department.findByGroup(Work.DIG_AROUND, Instrument.SHOVEL);
        printList(resultTools);

        System.out.println("\nSorted list:\n");
        department.sortByInstrument(resultTools);
        printList(department.getTools());
    }


    public static void printList(List<Tool> list) {
        for (Tool tool : list) {
            System.out.print(tool.getWork() + ", ");
            System.out.println(tool.getInstrumentType());
        }

    }
}