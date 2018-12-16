package com.edu.player;

import com.edu.player.common.log.LogUtil;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void packageName() {
        System.out.println(LogUtil.class.getPackage().getName());
    }

    @Test
    public void stackTrace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
//        for (StackTraceElement s:
//             stackTrace) {
//            System.out.println(s.getClassName());
//        }
        System.out.println(stackTrace[4].getClassName());
        System.out.println(stackTrace[4].getLineNumber());
        System.out.println(stackTrace[4].getMethodName());
        System.out.println(stackTrace[5].getClassName());
        System.out.println(stackTrace[5].getLineNumber());
        System.out.println(stackTrace[5].getMethodName());
    }
}