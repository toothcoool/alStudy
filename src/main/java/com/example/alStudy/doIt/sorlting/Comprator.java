package com.example.alStudy.doIt.sorlting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Comprator {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {

            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("남궁혜영", 165, 2.0),
                new PhyscData("김동로", 185, 1.5),
                new PhyscData("이수목", 167, 1.7),
                new PhyscData("이시원", 192, 2.5),
                new PhyscData("김용승", 183, 1.0),
                new PhyscData("백지은", 166, 1.2),
        };

        System.out.println("키가 몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                                            x,
                                            new PhyscData("", height, 0.0),
                                            PhyscData.HEIGHT_ORDER
                                    );
        if(idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
            System.out.println("찾은 데이터 : " + idx);
        }

    }
}
