import java.util.Scanner;

public class Calculator {
    public static void main (String[]args){
       try (Scanner iiScanner = new Scanner(System.in)) {
        System.out.println("enter two numbers");
        int a=iiScanner.nextInt();
        int b=iiScanner.nextInt();
        System.out.println("enter an operation you want to calculate(+,-,*,/)");
        char op=iiScanner.next().charAt(0);
        switch(op){
            case'+' : System.out.println(a+b);
            break;
            case'-':System.out.println(a-b);
            break;
            case'*' : System.out.println(a*b);
            break;
            case'/': System.out.println(a/b);
            break;
            default : System.out.println("invalid input");    

      
       
           
        }
    }
    }
}    