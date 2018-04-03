package solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int max = -2147483648;
    static int col = 0, row = 0;
    static int arr[][] = new int[6][6];
    static int glasses[] = new int[9999];
    static int higher = 0;
    static int x = 0;
    
    public static int calculate() {
        
            for (col = 0; col <= 3; col++) {
                for (row = 0; row <= 3; row++, x++){
                    glasses[x] = arr[col][row] + arr[col][row + 1] + arr[col][row + 2] + 
                            arr[col + 1][row + 1] + arr[col + 2][row] + arr[col + 2][row + 1] + arr[col + 2][row + 2];
                    if (glasses[x] > max) {
                        max = glasses[x];
                    }
                }
            }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(calculate());
    }
}