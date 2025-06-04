package abc;
import java.util.Scanner;
public class simplecalculator {
    String symbol;
    int a;
    int b;
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the sysmbol do you want to perform (+ - * /)");
        symbol = sc.nextLine();
        System.out.println("enter the first number=");
        a = sc.nextInt();
        System.out.println("enter the second number=");
        b = sc.nextInt(); 

    }
    void show(){
        switch (symbol) {
            case "+":
                
                    System.out.println("sum of the 2 numbers="+ (a+b));
                    break;
                
            case "-":
                
                    System.out.println("subtraction of the 2 numbers="+ (a-b));
                    break;
                
            case "*":
                
                    System.out.println("multiplication of the 2 numbers="+ (a*b));
                    break;
                
            case "/":
                
                    System.out.println("division of the 2 numbers="+ (a/b));
                    break;
                
                
                
            default:
                throw new AssertionError();
        }
        
        
    }

public static void main(String[] args) {
    simplecalculator s1 = new simplecalculator();
    s1.input();
    s1.show();
        
    }
}