package com.xpdev.day02;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author xh.d
 * @date 2018/1/5 10:32
 */
public class MockItoTest {

    @Test
    public void mockItoTest(){
        List<String> ls = mock(List.class);
        /**
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

    @Test
    public void mockItoTest2(){
        Meds meds = mock(Meds.class);
        meds.printo();
    }
}
