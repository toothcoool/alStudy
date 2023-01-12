package com.example.alStudy.alProgramers.fourWeeks;

public class 옹앓이1 {

    public static void main(String[] args) {

        String[] b = new String[4];
        b[0] = "aya";
        b[1] = "yee";
        b[2] = "u";
        b[3] = "yee";

        System.out.println(solution(b));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String temp = "aya,ye,woo,ma";
        String[] ba = temp.split(",");
        String match = "[^\uAC00-\uD7A30-9a-zA-Z\\s]";

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < ba.length; j++) {
                System.out.println("1 : " + babbling[i]);
                System.out.println("2 : " + ba[j]);
                babbling[i] = babbling[i].replace(ba[j], "#");


            }
            System.out.println("결과 : " + babbling[i]);
            if (babbling[i].replaceAll(match, "").equals("")) {
                answer += 1;
            }
        }

        return answer;
    }

}
