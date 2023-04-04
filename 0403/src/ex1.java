public class ex1 {
    public static void main(String[] args) {
        //국어 92점, 영어 80점, 수학 96점의 평균 값을 실수형과 정수형으로 출력하라

        int kor=92;
        int eng=80;
        int math=96;
        int sum=kor+eng+math;

        System.out.println("평균점수(실수형) = "+(double)sum/3);
        System.out.println("평균점수(정수형) = "+sum/3);
    }
}
