package com.example.alStudy.doIt.sorlting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        /*
            binarySearch 메서드는 오름차순으로 정렬된 배열 a를 가정하고
            값이 key인 요소를 이진검색 한다.
            binarySearch메서드는 자료형과 관계없이 검색할 수 있도록
            자료형에 따라 9가지 방법으로 오버로딩 되어있다.
            byte, char, double, float, int long, short, object, <T>

            검색에 성공한 경우 : key와 일치하는 요소의 index를 반환한다.
            단, 일치하는 요소가 여러 개 있을 경우 어느 요소의 인덱스를 반환하는 지는 정해져 있지 않다.

            검색에 실패한 경우 : 배열 안에 key가 있어야 할 위치를 추정할 수 있는 값을 반환한다.
            만약 배열의 모든 요소가 key보다 작다면 배열의 길이를 삽입포인트로 정한다.
         */

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

        if(idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 [" + idx + "]에 있습니다.");

    }
    /*
        이러한 binarySearch는 리턴타입이 int일 때 자연정렬된 배열에서 요소의 대소관계를 판단하고 검색하기 때문에 정수배열, 문자열 배열에서 검색할 때 유용하다.

        하지만 리턴타입이 객체일 때는 자연정렬이 아닌 순서로 나열된 배열에서 검색할 때 알맞다.
     */
}
