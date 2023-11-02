package chap01.self;

import java.util.Scanner;

public class SumSection {
    static int sumSection(int a, int b){
        int sum = 0;
        for(int i = a; i<b+1; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        sum1 = (a + b) * (b-a+1) / 2;
        sum2 = sumSection(a, b);

        System.out.println("sum1은 " + sum1);
        System.out.println("sum2은 " + sum2);
    }
}
