package MissingInteger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3};
        System.out.println(solution.solution(a));
    }
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
        }
         int counter = 1;
        while(true){
            if (a.contains(counter)) {
                counter++;
                continue;
            }
            return counter;
        }
    }
}