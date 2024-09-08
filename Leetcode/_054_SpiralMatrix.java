package Leetcode;
import java.util.*;
public class _054_SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            if (matrix == null || matrix.length == 0) {
                return list;
            }
    
            int rowBegin = 0;
            int colBegin = 0;
            int rowEnd = matrix.length - 1;
            int colEnd = matrix[0].length - 1;
    
            while (rowBegin <= rowEnd && colBegin <= colEnd) {
                // Traverse from left to right along the top row
                for (int j = colBegin; j <= colEnd; j++) {
                    list.add(matrix[rowBegin][j]);
                }
                rowBegin++; // Move the top boundary down
    
                // Traverse from top to bottom along the right column
                for (int i = rowBegin; i <= rowEnd; i++) {
                    list.add(matrix[i][colEnd]);
                }
                colEnd--; // Move the right boundary left
    
                // Ensure that we are still within valid bounds
                if (rowBegin <= rowEnd) {
                    // Traverse from right to left along the bottom row
                    for (int j = colEnd; j >= colBegin; j--) {
                        list.add(matrix[rowEnd][j]);
                    }
                    rowEnd--; // Move the bottom boundary up
                }
    
                // Ensure that we are still within valid bounds
                if (colBegin <= colEnd) {
                    // Traverse from bottom to top along the left column
                    for (int i = rowEnd; i >= rowBegin; i--) {
                        list.add(matrix[i][colBegin]);
                    }
                    colBegin++; // Move the left boundary right
                }
            }
    
            return list;
        }
    
        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            _054_SpiralMatrix sol = new _054_SpiralMatrix();
            List<Integer> result = sol.spiralOrder(matrix);
            System.out.println(result);
        }
    }
    
