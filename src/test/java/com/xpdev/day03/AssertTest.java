package com.xpdev.day03;

import com.xpdev.common.Template;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author xh.d
 * @date 2018/1/24 11:17
 */
public class AssertTest {

    @Test
    public void testAssert(){
        Template template = new Template("Hello,{name}");
        template.set("name","kotlin");
        assertEquals("Hello,kotlin",template.evluate());
    }
}
