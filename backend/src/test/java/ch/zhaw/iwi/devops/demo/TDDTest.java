package ch.zhaw.iwi.devops.demo;
    
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assert.True;

//public class TDDTest {    
class ConvertTest1 {
    
    @Test
    public void numberConverter1() {
        NumberConverter numberConverter = new NumberConverter();
            
        assertThat("X").isEqualTo(numberConverter.convert(10));
                    
    }
    
}
