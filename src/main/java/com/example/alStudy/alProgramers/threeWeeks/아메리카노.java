package com.example.alStudy.alProgramers.threeWeeks;

public class 아메리카노 {

    public static void main(String[] args) {

        for(int m : solution(15000)){

            System.out.println(m);
        }
    }

    public static int[] solution(int money) {

        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}
