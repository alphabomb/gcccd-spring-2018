package edu.gcccd.csis;

import org.junit.Test;
import java.math.BigInteger;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class MyProject2Test {

    @Test
    public void additionTest() {
        MyProject2 mp = new MyProject2();

        final NodeList<Integer> n1 = Project2.generateNumber(30);
        final NodeList<Integer> n2 = Project2.generateNumber(30);

        final BigInteger N1 = genBigInteger(n1);
        final BigInteger N2 = genBigInteger(n2);

        final NodeList<Integer> n3 = new MyProject2().addition(n1, n2);
        final BigInteger N3 = N1.add(N2);

        assertEquals(N3, genBigInteger(n3));

        final BigInteger N1_times_2 = N1.add(N1);
        final NodeList<Integer> nl_times_2 = new MyProject2().addition(n1, n1);

        assertEquals(N1_times_2, genBigInteger(nl_times_2));

        assertNotNull(mp.addition(Project2.generateNumber(30),
                Project2.generateNumber(30)));
        assertNotEquals(0, mp.addition(Project2.generateNumber(30),
                Project2.generateNumber(30)));

    }

    @Test
    public void saveTest() {
        MyProject2 mp = new MyProject2();

        final NodeList<Integer> n1 = Project2.generateNumber(30);
        mp.save(n1,"basicList.java");

    }

    @Test
    public void loadTest() {
        MyProject2 mp = new MyProject2();
        assertEquals("basicList.java", mp.load("basicList.java"));

    }


}