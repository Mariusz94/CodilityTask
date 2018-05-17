package RoatingArray;

public class RoatingArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 2, 3, 4, 5, 6 , 7};
        int[]b = solution.solution(a, 9);
        for (int i : b) {
            System.out.print(i+ " ");
        }
    }
}


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (K == A.length || A.length ==0) {
            return A;
        }

        int[] B = A.clone();
        int move = K % A.length;
        for (int i = 0; i < A.length; i++) {
            A[(i+ move) % A.length] = B[i];
        }
        return A;
    }
}