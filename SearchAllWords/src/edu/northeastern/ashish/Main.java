package edu.northeastern.ashish;

import java.util.ArrayList;
//https://leetcode.com/problems/word-search-ii/
public class Main {

    public static void main(String[] args) {
        String[][] matrix = {   {"o","a","a","n"},
                                {"e","t","a","e"},
                                {"i","h","k","r"},
                                {"i","f","l","v"}
                            };
        String[]  arr = {"oath","pea","eat","rain"};

        ArrayList<String> list = searchAllWords(matrix, arr);

        System.out.println(list.toArray().toString());

    }

    private static ArrayList<String> searchAllWords(String[][] matrix, String[] arr){
        ArrayList<String> list = new ArrayList<>();
        int rows = matrix.length;
        int col = matrix[0].length;

        for(int i = 0 ; i < rows; i ++){
            for(int j = 0 ; j < col; j ++){
                for (String str : arr) {
                    boolean[][] visited = new boolean[rows][col];
                    String val = String.valueOf(str.charAt(0));
                    if(matrix[i][j].compareToIgnoreCase(val) == 0){
                        visitNeighbours(matrix, visited, i, j, str, 0, list);
                    }
                }
            }
        }

        return list;
    }

    static void visitNeighbours(String[][] matrix, boolean[][] visited , int row, int col, String str, int index, ArrayList<String> list) {
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        if (row < 0 || col < 0 || row >= maxRow || col >= maxCol || visited[row][col] == true) {
            return;
        }
        String val = String.valueOf(str.charAt(index));
        if(matrix[row][col].compareToIgnoreCase(val) != 0  ){
            return;
        }

        if(index == str.length() -1){
            list.add(str);
            return;
        }
        visited[row][col] = true;
        visitNeighbours(matrix, visited, - 1, col, str, index +1 , list);
        visitNeighbours(matrix, visited, row + 1, col , str, index +1, list);
        visitNeighbours(matrix, visited, row, col - 1,  str, index +1, list);
        visitNeighbours(matrix, visited, row,col + 1,  str, index +1, list);
    }
}
