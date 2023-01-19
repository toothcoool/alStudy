package com.example.alStudy.alProgramers.fourWeeks;

import java.util.HashMap;

public class 모스부호1 {
    public static void main(String[] args) {

        System.out.println(solution(".... . .-.. .-.. ---"));
    }

    public static String solution(String letter) {
        String answer = "";

        HashMap<String,String> morse = new HashMap<>();
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---","j");
        morse.put("-.-","k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.","n");
        morse.put("---","o");
        morse.put(".--.","p");
        morse.put("--.-","q");
        morse.put(".-.","r");
        morse.put("...","s");
        morse.put("-","t");
        morse.put("..-","u");
        morse.put("...-","v");
        morse.put(".--","w");
        morse.put("-..-","x");
        morse.put("-.--","y");
        morse.put("--..","z");

        String[] l = letter.split(" ");

        for(int i=0; i<l.length; i++){
            System.out.println(l[i]);
            answer += morse.get(l[i]);
        }

        return answer;
    }
}
