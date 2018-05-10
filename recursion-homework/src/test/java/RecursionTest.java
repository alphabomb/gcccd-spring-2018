import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class RecursionTest {

    private int k = 0;
    private int[] ia = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] ia2 = new int[0];
    private String str = "Hellloo";

    @Test
    public void printEveryOther() {

        assertEquals("95731", Recursion.printEveryOther(ia, k));
        assertEquals("?", Recursion.printEveryOther(ia2, k));
        System.out.println(ia2[0]);

    }

    @Test
    public void printStars() {

        assertEquals("Hel*l*lo*o", Recursion.printStars(str));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                assertEquals(i, Recursion.printStars(str).length());
            }
        }
    }

    /*
     * we know the sum of the 1st k positive numbers is n(n+1)2
     */
    @Test
    public void sum() {
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(100);
            assertEquals(k * (k + 1) / 2, Recursion.sum(k));
        }
        // corner cases
        assertEquals(0, Recursion.sum(-1));
        assertEquals(0, Recursion.sum(0));
        try {
            int x = Recursion.sum(Integer.MAX_VALUE); // stackoverflow
            fail();
        } catch (StackOverflowError error) {
            assertTrue(true);
        }
    }
}