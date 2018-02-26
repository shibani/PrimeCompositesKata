package com.primes.kata;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.TestCase.assertEquals;

public class PrimeCompositeTest {

//    @Test
////    public void testGetInput() throws IOException {
////        PrimeComposite testExample = new PrimeComposite();
////
////        byte[] data = "0,1".getBytes();
////
////        InputStream input = new ByteArrayInputStream(data);
////
////        String output = testExample.getInput();
////        assertEquals("0,1", output);
////    }

    @Test
    public void testForCheckPrimes1() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 1);
        assertEquals("0, 1", result);
    }

    @Test
    public void testForCheckPrimes2() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 2);
        assertEquals("0, 1, prime", result);
    }

    @Test
    public void testForCheckPrimes3() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 3);
        assertEquals("0, 1, prime, prime", result);
    }

    @Test
    public void testForCheckPrimes4() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 4);
        assertEquals("0, 1, prime, prime, 4", result);
    }

    @Test
    public void testForCheckPrimes5() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 5);
        assertEquals("0, 1, prime, prime, 4, prime", result);
    }

    @Test
    public void testForCheckPrimes6() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 6);
        assertEquals("0, 1, prime, prime, 4, prime, 6", result);
    }

    @Test
    public void testForCheckPrimes7() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 7);
        assertEquals("0, 1, prime, prime, 4, prime, 6, prime", result);
    }

    @Test
    public void testForCheckPrimes10() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 10);
        assertEquals("0, 1, prime, prime, 4, prime, 6, prime, 8, composite, 10", result);
    }

    @Test
    public void testForCheckPrimes11() {
        PrimeComposite testExample = new PrimeComposite();
        String result = testExample.checkPrimes(0, 11);
        assertEquals("0, 1, prime, prime, 4, prime, 6, prime, 8, composite, 10, prime", result);
    }
}