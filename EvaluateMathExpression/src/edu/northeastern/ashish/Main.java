package edu.northeastern.ashish;

import java.util.Stack;
//https://leetcode.com/problems/basic-calculator-ii/
public class Main {

    public static void main(String[] args) {

        String str = " 3+5 / 2 ";
        System.out.println(evaluateExpression(str) );

    }

    // Evaluate the values
    private static int evaluateExpression(String str){
        // Take 2 stacks one for number another for operator
        Stack<Integer> numbers  = new Stack<>();
        Stack<Character> operators  = new Stack<>();

        // Replace all the white space
        str = str.replaceAll("\\s+","");

        int start = 0;
        int end = 0;

        //while we have not reached end
        while(start < str.length()){

            // Move till end reaches an operator
            while( end < str.length() && Character.isDigit(str.charAt(end)) ) {
                end ++;
            }
            // Get the number and push it in stack
            int num = Integer.parseInt(str.substring(start, end).strip());
            numbers.push(num);

            // If we have consumed entire string break out of loop
            if(end >= str.length()){
                break;
            }

            // Get the operator
            Character operator = str.charAt(end);
            // If there is no other operator push the current operator
            if(operators.isEmpty()){
                operators.push(operator);
                start = end+1;
                end ++;
                continue;
            }
            // If the operator has precedence over last operator push the current one on the stack
            if(hasPrecedence(operator, operators.peek())){
                operators.push(operator);
                start = end+1;
                end ++;
                continue;
            }
            // Get 2 numbers , perform operation and push result in numbers stack and operator in operators stack
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            int result = performOperation(num1, num2, operators.pop());
            numbers.push(result);
            operators.push(operator);
        }

        // whatever is in the stack perform the math operations
        while(!operators.isEmpty()){
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            int result = performOperation(num1, num2, operators.pop());
            numbers.push(result);
        }
        // return the only number in the stack.
        return numbers.pop();

    }

    // This functions returns precedence of operators BODMAS we have not accounted for Order i.e. 2^3
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
                return Integer.MAX_VALUE;
        }
    }

    // This function checks if op1 has higher precedence than op2
    private static boolean hasPrecedence(char op1, char op2){
        int precedence1 = returnPrecedence(op1);
        int precedence2 = returnPrecedence(op2);

        if(precedence1 < precedence2){
            return true;
        }
        return false;

    }
    // Perform math operations only operations are +,-,*, /
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
