package ch.zhaw.iwi.devops.demo;
    
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
//import org.assertj.core.api.Assert.assertTrue;

public class TDDTest {    
//class TDDTest {
    
    @Test
    public void numberConverter1() {
        NumberConverter numberConverter = new NumberConverter();
            
        assertThat("X").isEqualTo(numberConverter.convert(10));
                    
    }
    
}
