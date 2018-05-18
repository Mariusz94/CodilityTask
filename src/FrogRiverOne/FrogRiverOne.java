package FrogRiverOne;

import java.util.*;

public class FrogRiverOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3};
        System.out.println(solution.solution(5, a));
    }
}

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        if(A.length<X) return -1;
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < X; i++) {
            a.add(A[i]);
        }

        int counter = 1;
        int nextNumber = 0;
        while (counter <= X) {

            if (a.contains(counter)) {
                counter++;
                continue;
            }

            if (A.length == (X+nextNumber)) return -1;

            a.add(A[X + nextNumber]);
            nextNumber++;
        }
        return X + --nextNumber;
    }
}