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
}