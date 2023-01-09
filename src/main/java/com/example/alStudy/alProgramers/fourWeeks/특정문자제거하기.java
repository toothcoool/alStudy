package com.example.alStudy.alProgramers.fourWeeks;

public class 특정문자제거하기 {

    public String solution(String my_string, String letter) {

        return my_string.replace(letter,"");
        
        /*
            정규식 확인 절차를 넘기기 위해 replaceAll이 아닌 replace를 이용
         */
    }
}
