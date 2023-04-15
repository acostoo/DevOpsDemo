package ch.zhaw.iwi.devops.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TDDTest {

class ConvertTest1 {

    @Test
    public void numberConverter1() {
        NumberConverter numberConverter = new NumberConverter();
            
        assertThat("X").isEqualTo(numberConverter.convert(10));
                    
    }

}

    public String roman;

    @Test
    public void numberConverter2() {
        NumberConverter numberConverter = new NumberConverter();
        
        roman = numberConverter.getCharacter();

        assertThat(roman).isEqualTo(numberConverter.convert(10));

    }

}