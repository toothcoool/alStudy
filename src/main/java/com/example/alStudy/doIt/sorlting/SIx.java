package com.example.alStudy.doIt.sorlting;

import java.util.Arrays;
import java.util.Scanner;

public class SIx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : " );
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차 순으로 입력하세요 : ");

        System.out.println("x[0] :" );
        x[0] = sc.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.println("x[" + i + "] : ");
                x[i] = sc.nextInt();

            }while (x[i] < x[i - 1]);
            // 바로 앞의 요소보다 작으면 다시 입력받기 위한 코드이다.
        }

        System.out.println("검색할 값 : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if(idx < 0){

            System.out.println("그 값의 요소가 없습니다.");
            System.out.println("값이 정렬되기 위해서는 인덱스 번호 " + (-idx - 1) + "에 삽입해야 합니다.");   // idx를 다음과 같이 가공하면 삽입포인트가 도출된다.
        }
        else
            System.out.println("그 값은 [" + idx + "]에 있습니다.");
    }
}
