import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int input=sc.nextInt();

        findEvenOdd(input);
    }
    static void findEvenOdd(int num){
        if(num%2==0) System.out.println(num+" is Even(짝수)");
        else System.out.println(num+" is Odd(홀수)");
    }
}
