package com.example.alStudy.alProgramers.fourWeeks;

public class 개미군단 {

    public static void main(String[] args) {

        System.out.println(solution(999));
    }

    public static int solution(int hp) {

        /*
            장군개미는 5, 병사개미는 3, 일개미는 1의 전투력을 가지고 있고,
            필요한 개미의 수를 구해야하기 때문에 가장 먼저 hp를 5로 나눈 후 그 몫을 담았다.
            그리고 나머지를 3으로 나눠 몫을 담고,
            3으로 나눈 나머지를 1로 나누면 그저 3의 나머지일 뿐이기 때문에 그대로 담았다.
            연산의 결과를 담은 변수를 더해 반환했다.
            (만약 연산 결과가 0일 경우에는 0이 더해지므로 결과값에 영향이 가지 않는다.)
         */

        int fir = hp / 5;
        int se = (hp % 5) / 3;
        int thi = (hp % 5) % 3;

        return fir + se + thi;
    }
}
