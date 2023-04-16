package ch.zhaw.iwi.devops.demo;

public class RomanNumeralConverterTest {
    
    @Test
    public void testConvert_1_ReturnsI() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(1);
        Assertions.assertEquals("I", result);
    }
}