package com.example.alStudy.doIt.sorlting;

public class Five {

    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 1;
        a[3] = 4;
        a[4] = 3;

        System.out.println(binSearch(a, 5, 1));
    }

    public static int binSearch(int[] a, int n, int key){

        int pl = 0;
        int pr = n - 1;

        do{

            int pc = pr / 2;

            if(a[pc] == key){
                // pc가 pl(0)보다 클 때까지만 반복하도록 하고, pc는 하나씩 작아지는 for문을 돌린다.
                for(; pc > pl; pc--)
                    // pc - 1(인덱스이기 때문에)가 key값과 같아지면 break하여 pc를 반환한다.
                    if(a[pc - 1] == key)
                        break;
                return pc;
            }
            else if(a[pc] < key)

                pl = pc + 1;
            else
                pr = pc - 1;

        }while (pl <= pr);

        return -1;
    }
}
