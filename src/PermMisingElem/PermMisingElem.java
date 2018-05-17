package PermMisingElem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PermMisingElem {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2, 1, 3, 5};
        System.out.println(solution.solution(a));
    }

}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length==0) return 1;
        Arrays.sort(A);
        int first = 1;
        for (int i : A) {
            if (i != first) {
                return first;
            }
            first++;
        }
        return first;
    }
}