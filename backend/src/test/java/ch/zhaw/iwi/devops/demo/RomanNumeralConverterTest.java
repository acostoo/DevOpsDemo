package ch.zhaw.iwi.devops.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    @Test
    public void testConvert_1() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(1);
        Assertions.assertEquals("I", result);
    }
    
    @Test
    public void testConvert_2() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(2);
        Assertions.assertEquals("II", result);
    }

    @Test
    public void testConvert_3() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(3);
        Assertions.assertEquals("III", result);
    }

    @Test
    public void testConvert_4() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(4);
        Assertions.assertEquals("IV", result);
    }

    @Test
    public void testConvert_5() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(5);
        Assertions.assertEquals("V", result);
    }

    @Test
    public void testConvert_9() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(9);
        Assertions.assertEquals("IX", result);
    }
    
    @Test
    public void testConvert_21() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(21);
        Assertions.assertEquals("XXI", result);
    }

    @Test
    public void testConvert_50() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(50);
        Assertions.assertEquals("L", result);
    }
    
    @Test
    public void testConvert_100() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(100);
        Assertions.assertEquals("C", result);
    }

    @Test
    public void testConvert_final() {
        Assertions.assertEquals("I", RomanNumeralConverter.convert(1));
        Assertions.assertEquals("II", RomanNumeralConverter.convert(2));
        Assertions.assertEquals("III", RomanNumeralConverter.convert(3));
        Assertions.assertEquals("IV", RomanNumeralConverter.convert(4));
        Assertions.assertEquals("V", RomanNumeralConverter.convert(5));
        Assertions.assertEquals("IX", RomanNumeralConverter.convert(9));
        Assertions.assertEquals("XXI", RomanNumeralConverter.convert(21));
        Assertions.assertEquals("L", RomanNumeralConverter.convert(50));
        Assertions.assertEquals("C", RomanNumeralConverter.convert(100));
        Assertions.assertEquals("D", RomanNumeralConverter.convert(500));
        Assertions.assertEquals("M", RomanNumeralConverter.convert(1000));
    }
}