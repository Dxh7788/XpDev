package com.xpdev.day04;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * @author xh.d
 * @date 2018/1/25 20:31
 */
public class RegexLearningSpiderTest {

    @Test
    public void testHowGroupCountWorks(){
        String haystack = "The needle shop sells needles";
        String regex = "(shop)";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);

        assertEquals(1,matcher.groupCount());
    }
}
