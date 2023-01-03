package com.example.alStudy.doIt.sorlting;

import java.util.Arrays;
import java.util.Scanner;

public class naturalBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] x = {

                "abstract", "assert", "boolean", "break", "case", "catch"
                ,"default", "do", "double", "else", "continue", "extends", "if"
        };

        System.out.println("원하는 키워드를 입력하세요 : ");
        String ky = sc.next();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0)
            System.out.println("해당 키워드가 없습니다.");
        else
            System.out.println("해당 키워드는 [" + idx + "] 에 있습니다.");
    }
}
