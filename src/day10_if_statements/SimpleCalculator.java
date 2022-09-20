package day10_if_statements;

public class SimpleCalculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 2;
        double result = 0;


        char operator = '%';

        if(operator == '+'){
            result = num1+num2;
        }else if(operator == '-'){
            result = num1 - num2;
        }else if( operator == '*' || operator == 'x'){
            result = num1 * num2;
        }else if(operator == '/'){
            result = num1 / num2 ;
        } else if(operator == '%'){
            result = num1 % num2 ;
        }else {
            System.out.println("Invalid operator");
        }

        System.out.println(""+ num1 + " " +operator +" "+ num2 +" = "+result);
    }
}
