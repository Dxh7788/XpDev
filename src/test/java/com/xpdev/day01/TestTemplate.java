package com.xpdev.day01;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author xh.d
 * @date 2018/1/4 14:16
 */
public class TestTemplate {
    @Test(expected = AssertionError.class)
    public void oneVariable(){
        Template template = new Template("Hello","world");
        Template template2 = new Template("Hello","world");
        Template template4 = new Template("Hello2","world");

        /**
         * equals assert
         * */
        assertEquals("Hello,world",template.evluate());
        assertEquals("两个数字不相等",10,9,1);
        assertNotSame(template,template2);

        /**
         * boolean assert
         * */
        assertTrue(StringUtils.equals("Hello,world",template.evluate()));
        assertFalse(StringUtils.equals("Hello,world",template.evluate()));

        /**
         * null assert
         * */
        assertNotNull(template.evluate());
        assertNull(template.evluate());

        /**
         * same assert
         * */
        assertNotSame("Hello,world",template.evluate());
        assertSame("Hello,world",template.evluate());
    }
}
