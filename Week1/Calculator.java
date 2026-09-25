package Week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.err.println("Input 1:");
        int input1  = sc.nextInt();
        System.err.println("Operator:");
        String operator = sc.next();
        System.err.println("Input 2:");
        int input2 = sc.nextInt();

        System.err.println("Output: ");
        if(operator.equals("+")){
            System.err.println(input1+input2);
        }
        else if(operator.equals("-")){
            System.err.println(input1-input2);
        }
        else if(operator.equals("*")){
            System.err.println(input1*input2);
        }
        else if(operator.equals("/")){
            if(input2 == 0) System.err.println("Cannot divide by 0");
            else System.err.println(input1/input2);
        }
        else{
            System.err.println("Use a valid operator.");
        }
    }
    }
}
