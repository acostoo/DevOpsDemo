package ch.zhaw.iwi.devops.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TDD {
    
    String character = "Y";

    public String getCharacter() {
        return character;
    }

    HashMap<String, Integer> characters = new LinkedHashMap<>();

    public HashMap<String, Integer> getCharacterMap(){
        return characters;
    }

    public void put(){
        characters.put("M", 1000);
        characters.put("D", 500);
        characters.put("C", 100);
        characters.put("XC", 90);
        characters.put("LXXX", 80);
        characters.put("LX", 60);
        characters.put("L", 50);
        characters.put("XX", 20);
        characters.put("X", 10);
        characters.put("IX", 9);
        characters.put("IV", 6);
        characters.put("V", 5);
        characters.put("I", 1);
    }
    
    public String convert(int i) {
    
        StringBuilder sb = new StringBuilder();

        for(HashMap.Entry<String, Integer> entry : characters.entrySet()) {
            
            while(i >= entry.getValue()) {
                i = i - entry.getValue();
                sb.append(entry.getKey());
            }
            
        }
        return sb.toString();

    }
}
