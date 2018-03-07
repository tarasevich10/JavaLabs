import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    private Tool tool1;
    private Tool tool2;
    private Tool tool3;

    private Department dep;

    @BeforeEach
    void setUp() {
        tool1 = new Secateur(Work.CUT_BRANCHES);
        tool2 = new Shovel(Work.DIG_AROUND);
        tool3 = new Rake(Work.TAKE_LEAVES);
        dep = new Department();
        dep.addTool(tool1);
        dep.addTool(tool2);
        dep.addTool(tool3);
    }


    @Test
    void sortByInstrument() {
        dep.sortByInstrument(dep.getTools());

        assertEquals(tool3, dep.getTools().get(0));
        assertEquals(tool2, dep.getTools().get(1));
        assertEquals(tool1, dep.getTools().get(2));
    }


    @Test
    void findByGroup() {
        List<Tool> foundList = dep.findByGroup(Work.CUT_BRANCHES, Instrument.SECATEUR);
        assertEquals(tool1, foundList.get(0));
    }
}