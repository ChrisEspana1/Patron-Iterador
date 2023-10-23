import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuItemTest {
    private MenuItem mi;
    @Before
    public void Before() throws Exception {
        mi = new MenuItem();
    }
    @Test
    public void testDescription() {
        mi = new MenuItem("K&B Pancake Breakfast",
                "   pancake with      eggs and toast",
                false,
                2.99);
        String esperado = "pancake with eggs and toast";
        String obtenido= mi.getDescription().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}