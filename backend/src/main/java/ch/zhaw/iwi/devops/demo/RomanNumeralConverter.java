package ch.zhaw.iwi.devops.demo;

public class RomanNumeralConverter {
    
    public String convert(int number) {
        if (number == 1) {
            return "I";
        }
        if (number == 2) {
            return "II";
        }
        return "";
    }
}