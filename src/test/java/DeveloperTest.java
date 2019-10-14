import org.junit.Test;
import staff.techStaff.Developer;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;
    private static final Double DELTA = 0.01;

    @Before
    public void before(){

        developer = new Developer("Tom", "1234", 12.45);
    }

    @Test
    public void getManagerName(){
        assertEquals("Tom", developer.getName());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(0.1245, developer.payBonus(),DELTA);
    }
}
