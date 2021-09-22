package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome("ABAABA");
        if(palindrome){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }

        boolean anagram = areAnagrams("ABBA", "BABC");
        if(anagram){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    private static boolean isPalindrome(String str){

        if(str == null || str.length() <= 1){
            return true;
        }
        int start = 0;
        int end = str.length() -1;

        while (start < end){
            if( str.charAt(start) != str.charAt(end) ){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    private static boolean areAnagrams(String str1, String str2){

        if(str1 == null || str2 == null || str1.isBlank() || str2.isBlank() || str1.isEmpty() || str2.isEmpty()){
            return  false;
        }

        if(str1.length() != str2.length()){
            return  false;
        }

        int[] arr = new int[128];

        for(int i = 0 ; i < str1.length(); i ++){
            arr[str1.charAt(i)] ++;
            arr[str2.charAt(i)] --;
        }

        for(int i = 0 ; i < 128; i ++){
            if(arr[i] != 0){
                return false;
            }
        }
        return  true;

    }


}
