import org.junit.Test;
import staff.management.Director;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;
    private static final Double DELTA = 0.01;

    @Before
    public void before(){

        director = new Director("Tom", "1234", 12.45, "S", 1000.01);
    }

    @Test
    public void getManagerName(){
        assertEquals("Tom", director.getName());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(0.1245, director.payBonus(),DELTA);
    }
}

