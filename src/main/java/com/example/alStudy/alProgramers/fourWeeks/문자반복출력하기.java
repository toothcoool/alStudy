package com.example.alStudy.alProgramers.fourWeeks;

public class 문자반복출력하기 {

    public static void main(String[] args) {

        System.out.println(solution("hello_dd", 3));
    }

    public static String solution(String my_string, int n) {
        String answer = "";

        String[] myArr = my_string.split("");

        for(String m : myArr){
            for(int i = 0; i < n; i++){

                answer += m;
            }
        }

        return answer;
    }
}
