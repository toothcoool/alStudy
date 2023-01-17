package com.example.alStudy.alProgramers.fourWeeks;

import java.util.Arrays;

public class 칠의개수 {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 17;
        arr[2] = 77;

        System.out.println(solution(arr));
    }

    public static int solution(int[] array) {
        int answer = 0;

        for(int a : array){

            String[] arr = String.valueOf(a).split("");

            for(int i = 0; i < arr.length; i++){

               if(arr[i].equals("7")) answer++;
            }

        }

        return answer;
    }
}
