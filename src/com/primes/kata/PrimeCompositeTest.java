package com.primes.kata;

import org.junit.Test;

import java.io.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PrimeCompositeTest {

    @Test
    public void testRequestInput() throws IOException {
        PrimeComposite testExample = new PrimeComposite();

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));

        testExample.requestInput("first");

        bo.flush();
        String inputLines = new String(bo.toByteArray());

        assertTrue(inputLines.toString().contains("Enter first integer: "));
    }

    @Test
    public void testProcessInput() throws IOException {
        PrimeComposite testExample = new PrimeComposite();

        byte[] data = "23".getBytes();
        InputStream input = new ByteArrayInputStream(data);
        System.setIn(input);

        int testResult = testExample.processInput("first");

        assertEquals(23, testResult);
    }

    @Test
    public void testCallCheckPrimes() throws IOException {
        PrimeComposite testExample = new PrimeComposite();

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));

        testExample.callCheckPrimes(23,30);

        bo.flush();

        String inputLines = new String(bo.toByteArray());

        assertTrue(inputLines.contains("Checking for primes and composites between 23 and 30"));
        assertTrue(inputLines.contains("prime, 24, composite, 26, composite, 28, prime, 30"));
    }

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