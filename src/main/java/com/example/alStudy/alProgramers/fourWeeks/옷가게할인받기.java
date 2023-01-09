package com.example.alStudy.alProgramers.fourWeeks;

public class 옷가게할인받기 {
    public static void main(String[] args) {

        System.out.println(solution(150000));
    }
    public static int solution(int price) {
        int answer = 0;

        if(price >= 500000){

            answer = (int) (price - (price * 0.2));

        } else if(price <= 499999 && price >= 300000){

            answer = (int) (price - (price * 0.1));

        } else if (price <= 299999 && price >= 100000) {

            answer = (int) (price - (price * 0.05));

        } else {

            answer = price;
        }

        return answer;

    }

}
