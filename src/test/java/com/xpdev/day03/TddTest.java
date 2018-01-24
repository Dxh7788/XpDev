package com.xpdev.day03;

import com.xpdev.common.Template;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author xh.d
 * @date 2018/1/24 11:17
 */
public class TddTest {
    Template template1;
    @Before
    public void init(){
        template1 =mock(Template.class);
    }

    @Test
    public void testAssert(){
        Template template = new Template("Hello,{name}");
        template.set("name","kotlin");
        assertEquals("Hello,kotlin",template.evluate());

        Template template1 = new Template("Hello,{name}");
        template1.set("name","someone else");
        assertEquals("Hello,someone else",template1.evluate());
    }

    /**
     * 广度测试
     * 先测上层功能,然后实现
     * */
    @Test
    public void widthTddTest(){
        Template template = new Template("Hello,{name}");
        template.set("name","mock");
        /**
         * Template 的evluate1暂时还没有具体实现
         * */
        when(template1.evluate1()).thenReturn("Hello,mock");
        assertEquals(template1.evluate1(),template.evluate());
    }

    @Test
    public void failTddTest(){
        try {
            Template template = new Template("Hello,{name}");
            template.set("name", "mock");
            /**
             * Template 的evluate1暂时还没有具体实现
             * */
            when(template1.evluate1()).thenReturn("Hello,mock");
//            fail("测试fail消息");
            assertEquals(template1.evluate1(), template.evluate());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
