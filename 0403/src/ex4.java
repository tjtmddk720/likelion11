import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        //인물들의 신장을 입력받고 합계와 평균을 구하여라

        String[] name={"james","Cathy","Kenny","Martin","Crystal"};
        int[] result=new int[5];
        int sum=0;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print(name[i]+"의 신장을 입력하세요! ");
            result[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(name[i]+"의 키는 "+result[i]+"입니다");
        }
        for(int i=0;i<5;i++){
            sum+=result[i];
        }
        System.out.println("신장의 합계 : "+sum);
        System.out.println("평균 신장 : "+sum/5);

    }
}
