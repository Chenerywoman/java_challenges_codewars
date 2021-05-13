package org.chenerywoman.roman_numerals;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

public class RomanNumeralsTest extends TestCase {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void test1ReturnsI(){
        assertEquals("convert(1) not equal to 'I' ", "I", romanNumerals.convert(1));
    }

    @Test
    public void test5ReturnsV(){
        assertEquals("convert(5) not equal to 'V'", "V", romanNumerals.convert(5));
    }

    @Test
    public void test10ReturnsX(){
        assertEquals("convert(10) not equal to 'X'", "X", romanNumerals.convert(10));
    }

    @Test
    public void test50ReturnsL(){
        assertEquals("convert(50) not equal to 'L'", "L", romanNumerals.convert(50));
    }

    @Test
    public void test100ReturnsC(){
        assertEquals("convert(100) not equal to 'C'", "C", romanNumerals.convert(100));
    }

    @Test
    public void test500ReturnsD(){
        assertEquals("convert(500) not equal to 'D", "D", romanNumerals.convert(500));
    }

    @Test
    public void test1000ReturnsM(){
        assertEquals("convert(1000) not equal to 'M'", "M", romanNumerals.convert(1000));
    }




}