/*
Given a matrix as an input print the matrix as a Snake Pattern.
Input:
3
1 2 3
4 5 6
7 8 9

Output:
1 2 3 
6 5 4 
7 8 9
*/

import java.util.*;
public class SnakePatternPrinting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the matrix: ");
        //Taking a matrix as an input
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //Logic for Snake Pattern
        System.out.println("The snake pattern matrix is: ");
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            if(i%2 == 1){
                for(int j=n-1; j>=0; j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
