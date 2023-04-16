package ch.zhaw.iwi.devops.demo;
    
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TDDTest {    
//class TDDTest {
    
    @Test
    public void numberConverter1() {
        NumberConverter Converter = new NumberConverter();
        Assertions.assertEquals("Y", Converter.convert(10));
        
    }
    
}
