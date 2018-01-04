package com.xpdev.day01;

import com.xpdev.common.MathUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author xh.d
 * @date 2018/1/4 16:45
 */
@RunWith(Parameterized.class)
public class MathUtilsTest {

    private int numberA;
    private int numberB;
    private int expected;

    public MathUtilsTest() {
    }

    public MathUtilsTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    //Declares parameters here
    @Parameters
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 2 },
                { 2, 2, 4 },
                { 8, 2, 10 },
                { 4, 5, 9 }
        });
    }
    @Test
    public void test_add() {
        assertEquals(expected, MathUtils.add(numberA, numberB));
    }
}
