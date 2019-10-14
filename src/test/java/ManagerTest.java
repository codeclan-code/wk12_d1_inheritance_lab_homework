import org.junit.Test;
import staff.management.Manager;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    private static final Double DELTA = 0.01;

    @Before
    public void before(){

        manager = new Manager("Tom", "1234", 12.45, "S");
    }

    @Test
    public void getManagerName(){
        assertEquals("Tom", manager.getName());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(0.1245, manager.payBonus(),DELTA);
    }
}
