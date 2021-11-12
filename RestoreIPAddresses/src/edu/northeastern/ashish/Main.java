package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        System.out.println(isValidIPAddress("255.255.11.13"));
        restoreIPAddresses("2552551135");
        System.out.println();



    }

    private static void restoreID(String str){
        int len = str.length();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i<4 && i<str.length()-2; i++){
            for(int j = i+1; j<i+4 && j<len-1; j++){
                for(int k = j+1; k<j+4 && k<len; k++){
                    String s1 = str.substring(0,i), s2 = str.substring(i,j), s3 = str.substring(j,k), s4 = str.substring(k,len);
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                        list.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }

        System.out.println(list.toString());
    }


    public static boolean isValid(String s){
        if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
            return false;
        return true;
    }


    private static void restoreIPAddresses(String str){
        restoreIPAddresses(str, 0);
    }

    private static void restoreIPAddresses(String str, int current){
        String[] arr = str.split("\\.");
        if(arr.length == 4){
            if(isValidIPAddress(str)){
                System.out.println(str);
            }
            return;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < 3; i ++){
            if(current+ i + 2 >= str.length()){
                continue;
            }
            sb.append(str.substring(0, current + i +1));
            sb.append(".");
            sb.append(str.substring(current+1, str.length()-1));
            restoreIPAddresses(sb.toString(), current+2);
            restoreIPAddresses(sb.toString(), current+3);
            restoreIPAddresses(sb.toString(), current+4);
        }
    }



    private static boolean isValidIPAddress(String str){
        String[] arr = str.split("\\.");
        if(arr.length != 4){
            return false;
        }
        for (String st : arr) {
           if(Integer.parseInt(st) > 255){
               return false;
           }
        }
        return true;
    }


}
