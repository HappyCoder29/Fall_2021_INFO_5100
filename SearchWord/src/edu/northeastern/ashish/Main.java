package edu.northeastern.ashish;

public class Main {
//https://leetcode.com/problems/word-search/
    public static void main(String[] args) {
        String[][] matrix = {   {"A", "B", "C", "E"},
                                {"S", "F", "C", "S"},
                                {"A", "D", "E", "E"}
                            };
        String str = "SEE";

        System.out.println(searchWord(matrix, str) );

    }

    private static boolean searchWord(String[][] matrix, String str){
        int rows = matrix.length;
        int col = matrix[0].length;

        for(int i = 0 ; i < rows; i ++){
            for(int j = 0 ; j < col; j ++){
                BoxValue box = new BoxValue();
                box.found = false;
                boolean[][] visited = new boolean[rows][col];
                String val = String.valueOf(str.charAt(0));
                if(matrix[i][j].compareToIgnoreCase(val) == 0){
                    visitNeighbours(matrix, visited, i, j, str, 0, box);
                }
                if(box.found == true){
                    return true;
                }
            }
        }
        return false;
    }

    static void visitNeighbours(String[][] matrix, boolean[][] visited , int row, int col, String str, int index, BoxValue box) {
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
            System.out.println("Word is found");
            box.found = true;
            return;
        }
        visited[row][col] = true;
        visitNeighbours(matrix, visited, - 1, col, str, index +1 , box);
        visitNeighbours(matrix, visited, row + 1, col , str, index +1, box);
        visitNeighbours(matrix, visited, row, col - 1,  str, index +1, box);
        visitNeighbours(matrix, visited, row,col + 1,  str, index +1, box);
    }
}
