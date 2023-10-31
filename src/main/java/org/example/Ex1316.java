package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex1316 {
    public int distinctEchoSubstrings(String text) {
        String sub1;
        String sub2;
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= text.length(); i++) {
            for(int j = 1; j <= text.length() / 2; j++) {
                if(i + 2*j <= text.length()) {
                    sub1 = text.substring(i, i + j);
                    sub2 = text.substring(i + j, i + 2 * j);
                    if(sub1.equals(sub2)) set.add(sub1 + sub2);
                }
            }
        }
        return set.size();
    }
}
