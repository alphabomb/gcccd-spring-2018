package edu.gcccd.csis;

import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class MyProject2Test {

    @Test
    public void additionTest() {
        MyProject2 mp = new MyProject2();
        assertNotNull(mp.addition(Project2.generateNumber(5),
                Project2.generateNumber(5)));
        assertNotEquals(0, mp.addition(Project2.generateNumber(5),
                Project2.generateNumber(5)));


    }

    @Test
    public void saveTest() {
        MyProject2 mp = new MyProject2();
        mp.save(Byte.valueOf(Project2.generateNumber(5)), "basicList.java");



    }

    @Test
    public void loadTest() {
        MyProject2 mp = new MyProject2();
        assertEquals("basicList.java", mp.load("basicList.java"));




    }


}