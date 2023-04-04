public class ex2 {
    public static void main(String[] args) {
        int num1 = 169;
        int num2 = 4;
        char op = '/';

        switch(op){
            case '+' :
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case '-' :
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case '*' :
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case '%' :
                System.out.println(num1+" % "+num2+" = "+(num1%num2));
                break;
            case '/' :
                System.out.println(num1+" 나누기 "+num2+" 는 "+((double)num1/num2));
                break;
        }
    }
}
