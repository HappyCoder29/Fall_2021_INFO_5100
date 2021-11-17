package edu.northeastern.ashish;

import java.util.Stack;
//https://leetcode.com/problems/basic-calculator-ii/
public class Main {

    public static void main(String[] args) {
        String str = " 3+5 / 2 ";
        System.out.println(evaluateExpression(str) );

    }

    private static boolean hasPrecedence(char op1, char op2){
        int precedence1 = returnPrecedence(op1);
        int precedence2 = returnPrecedence(op2);

        if(precedence1 < precedence2){
            return true;
        }
        return false;

    }

    private static int returnPrecedence(char ch){
        switch (ch) {
            case '(':
            case ')':
                return 0;
            case '/':
                return 1;
            case '*':
                return 2;
            case '+':
                return 3;
            case '-':
                return 4;
            default:
                return -1;
        }
    }

    private static int evaluateExpression(String str){
        Stack<Integer> numbers  = new Stack<>();
        Stack<Character> operators  = new Stack<>();

        for ( Character ch : str.toCharArray() ) {
            if(Character.isWhitespace(ch) || Character.isSpaceChar(ch)){
                continue;
            }
            if(Character.isDigit(ch)){
                numbers.push(Character.getNumericValue(ch));
                continue;
            }
            if(operators.isEmpty()){
                operators.push(ch);
                continue;
            }
            if(hasPrecedence(ch, operators.peek())){
                operators.push(ch);
                continue;
            }
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            int result = performOperation(num1, num2, ch);
            numbers.push(result);
        }

        while(!operators.isEmpty()){
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            int result = performOperation(num1, num2, operators.pop());
            numbers.push(result);
        }
        return numbers.pop();

    }

    private static int performOperation(int num1, int num2, char operator){
        if(operator == '-' ){
            return num1 - num2;
        }else if (operator == '+' ){
            return num1+num2;
        }else if(operator == '*' ){
            return num1 * num2;
        }else if (operator == '/' ){
            return num1/num2;
        }
        return Integer.MIN_VALUE;
    }
}
