package edu.northeastern.ashish;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        int result = 0;
        try{

            File text = new File("NotExistingFile.txt");

            //Creating Scanner instance to read File in Java
            Scanner scanner = new Scanner(text);


            //Reading each line of the file using Scanner class
            int lineNumber = 1;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
            }


            Scanner scannerBirthYear = new Scanner(System.in);
            String birthYear = scannerBirthYear.next();



            int year = Integer.parseInt(birthYear);
            result = divideByZeroExample(10,0);
        }catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getLocalizedMessage());
        }
        catch (IOException ioException){
            System.out.println(ioException.getLocalizedMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        finally {
            System.out.println(result);
        }

    }


    // Example of function which throws

    private static int  divideByZeroExample(int a, int b) throws Exception{
        return a/b;
    }



}
