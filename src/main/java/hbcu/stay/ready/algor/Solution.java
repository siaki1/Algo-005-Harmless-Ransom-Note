package hbcu.stay.ready.algor;
import java.util.*;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText) {

        Map<Character, Integer> word1 = new HashMap<>();
        for (char word2 : magazineText.toCharArray()) {
            if (word1.containsKey(word2)) {
                word1.put(word2, word1.get(word2) + 1);
            } else {
                word1.put(word2, 1);
            }

        }
        return true;

        
    }
    }

