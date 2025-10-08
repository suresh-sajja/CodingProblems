/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 CodeRevisited.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the \"Software\"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.codeforces.round352;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

/**
 * Test class for SummerCamp
 * Tests are categorized as Easy, Medium, and Hard
 */
public class SummerCampTest {

    private String expectedString;

    @Before
    public void setUp() {
        // Build the expected string (same logic as in SummerCamp)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 400; i++) {
            sb.append(i);
        }
        expectedString = sb.toString();
    }

    // ===== EASY TESTS =====
    // These test basic functionality with simple inputs

    @Test
    public void testEasy_FirstPosition() throws IOException {
        // Test position 0 - should return '0' (first character of "0123...")
        String input = "0\n";
        String expectedOutput = "0\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testEasy_SecondPosition() throws IOException {
        // Test position 1 - should return '1' (second character)
        String input = "1\n";
        String expectedOutput = "1\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testEasy_SingleDigitBoundary() throws IOException {
        // Test position 9 - last single digit
        String input = "9\n";
        char expected = expectedString.charAt(9);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testEasy_TenthPosition() throws IOException {
        // Test position 10 - should be '1' (start of "10")
        String input = "10\n";
        char expected = expectedString.charAt(10);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testEasy_Position20() throws IOException {
        // Test position 20
        String input = "20\n";
        char expected = expectedString.charAt(20);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    // ===== MEDIUM TESTS =====
    // These test more complex scenarios and edge cases

    @Test
    public void testMedium_Position100() throws IOException {
        // Test position 100 - in the middle of two-digit numbers
        String input = "100\n";
        char expected = expectedString.charAt(100);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testMedium_ThreeDigitBoundary() throws IOException {
        // Test around transition from 99 to 100
        // Position where "99" ends and "100" begins
        String input = "200\n";
        char expected = expectedString.charAt(200);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testMedium_Position500() throws IOException {
        // Test position 500 - in three-digit numbers
        String input = "500\n";
        char expected = expectedString.charAt(500);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testMedium_MidRangePosition() throws IOException {
        // Test position 789 - arbitrary mid-range position
        String input = "789\n";
        char expected = expectedString.charAt(789);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testMedium_Position1000() throws IOException {
        // Test position 1000
        String input = "1000\n";
        char expected = expectedString.charAt(1000);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    // ===== HARD TESTS =====
    // These test boundary conditions and extreme cases

    @Test
    public void testHard_LastPosition() throws IOException {
        // Test the very last position in the string
        int lastPos = expectedString.length() - 1;
        String input = lastPos + "\n";
        char expected = expectedString.charAt(lastPos);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testHard_NearEndPosition() throws IOException {
        // Test position 1080 - near the end of the string
        String input = "1080\n";
        char expected = expectedString.charAt(1080);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testHard_HighValuePosition() throws IOException {
        // Test position 1050 - high value within bounds
        String input = "1050\n";
        char expected = expectedString.charAt(1050);
        String expectedOutput = expected + "\n";
        assertEquals(expectedOutput, runSummerCamp(input));
    }

    @Test
    public void testHard_StringLength() {
        // Verify the total length of the generated string
        // 0-9: 10 numbers × 1 digit = 10 chars
        // 10-99: 90 numbers × 2 digits = 180 chars
        // 100-399: 300 numbers × 3 digits = 900 chars
        // Total: 10 + 180 + 900 = 1090 chars
        assertEquals(1090, expectedString.length());
    }

    @Test
    public void testHard_VerifySequence() {
        // Verify the sequence starts correctly
        assertTrue(expectedString.startsWith("0123456789"));
        assertTrue(expectedString.contains("101112"));
        assertTrue(expectedString.contains("100101102"));
        assertTrue(expectedString.contains("397398399"));
    }

    // ===== HELPER METHOD =====

    /**
     * Helper method to run SummerCamp with given input and capture output
     */
    private String runSummerCamp(String input) throws IOException {
        // Set up input stream
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Set up output stream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Run the main method
        SummerCamp.main(new String[]{});

        // Get the output
        String output = outputStream.toString();

        // Reset System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        return output;
    }
}
