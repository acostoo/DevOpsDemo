package ch.zhaw.iwi.devops.demo;

import java.util.TreeMap;

public class RomanNumeralConverter {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        //map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public static String convert(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + convert(number - l);
    }
}
