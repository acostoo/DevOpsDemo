package ch.zhaw.iwi.devops.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void testConvert() {
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