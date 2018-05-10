import org.junit.Test;
import static org.junit.Assert.*;

public class GenericQueueTest {

    @Test
    public void enqueueTest() {
        assertNotNull(queueValue);
        assertNotEquals(-1, queueValue);
    }

    @Test
    public void dequeueTest() {
        assertTrue(length() = elements.size()-1);
    }

    @Test
    public void lengthTest() {
        assertNotEquals(-1, elements.size());
    }
}
