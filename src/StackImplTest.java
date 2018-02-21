import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jordi on 21/02/2018.
 */
public class StackImplTest {
    @Before
    StackImpl<Integer> pilaLimit = new StackImpl(5);
    public void setUp() throws Exception
    {
        pilaLimit.push(1);
        pilaLimit.push(2);
    }
    @Test
    public void testPlena() throws Exception
    {
        pilaLimit.push(3);
        pilaLimit.push(4);
        pilaLimit.push(5);
        pilaLimit.push(3);
        assertEquals(5, pilaLimit.size());
    }
    @Test
    public void testBuida() throws Exception
    {
        pilaLimit.pop();
        pilaLimit.pop();
        pilaLimit.pop();
        assertEquals(0, pilaLimit.size());
    }
    public void testType() throws Exception
    {
        pilaLimit.push("hola");
        assertEquals(2, pilaLimit.size());
    }

    @After
    public void setDown() throws Exception
    {

    }
}
