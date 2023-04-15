package ch.zhaw.iwi.devops.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TDDTest {

    @Test
    public void numberConverter1() {
        TDD numberConverter = new TDD();
        
        assertThat("X").isEqualTo(numberConverter.convert(10));
                
    }

}
