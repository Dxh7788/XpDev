package com.xpdev.day01;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author xh.d
 * @date 2018/1/4 14:16
 */
public class TestTemplate {
    @Test
    public void oneVariable(){
        Template template = new Template("Hello","world");

        /**
         * equals assert
         * */
        assertEquals("Hello,world",template.evluate());

        /**
         * boolean assert
         * */
        assertTrue(StringUtils.equals("Hello,world",template.evluate()));
        /*assertFalse(StringUtils.equals("Hello,world",template.evluate()));*/

        /**
         * null assert
         * */
        assertNotNull(template.evluate());
        /*assertNull(template.evluate());*/

        /**
         * same assert
         * */
        assertNotSame("Hello,world",template.evluate());
        /*assertSame("Hello,world",template.evluate());*/
    }
}
