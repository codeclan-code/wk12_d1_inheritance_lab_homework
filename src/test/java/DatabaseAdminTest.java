import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;
    private static final Double DELTA = 0.01;

    @Before
    public void before(){

        databaseadmin = new DatabaseAdmin("Tom", "1234", 12.45);
    }

    @Test
    public void getManagerName(){
        assertEquals("Tom", databaseadmin.getName());
    }

    @Test
    public void hasPayBonus(){
        assertEquals(0.1245, databaseadmin.payBonus(),DELTA);
    }
}
