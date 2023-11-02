package chap01.self;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i<n){
            sum += i;
            i++;
        }
        System.out.println("n까지의 합은 "+ sum);
    }
}
