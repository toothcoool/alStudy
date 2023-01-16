package com.example.alStudy.alProgramers.fourWeeks;

public class 배열원소의길이 {

    public static void main(String[] args) {

        String[] arr = new String[4];
        arr[0] = "We";
        arr[1] = "are";
        arr[2] = "the";
        arr[3] = "world";

        for(int s : solution(arr)){
            System.out.println(s);
        }

    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
