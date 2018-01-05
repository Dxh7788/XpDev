package com.xpdev.day02;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author xh.d
 * @date 2018/1/5 10:32
 */
public class MockItoTest {

    /**
     * 使用when测试
     * */
    @Test
    public void mockItoTest(){
        List<String> ls = mock(List.class);
        /**
         * stubbing.
         * expected value when invoke ls.get(0)
         * */
        when(ls.get(0)).thenReturn("hello,mockito");

        String result = ls.get(0);
        /**
         * verify get() is invoked or not.
         * */
        System.out.println(verify(ls).get(0));
        System.out.println(result);
        /**
         * JUnit Assert
         * */
        Assert.assertEquals("hello,mockito",result);
    }

    /**
     * 使用given测试
     * */
    @Test
    public void mockItoTest2(){
        List<String> ls = mock(List.class);
        /**
         * stubbing
         * */
        given(ls.get(0)).willReturn("hello,mockito");
        String value = ls.get(0);
        System.out.println(value);
    }
}
