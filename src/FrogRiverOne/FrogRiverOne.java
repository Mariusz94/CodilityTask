package FrogRiverOne;

import java.util.*;

public class FrogRiverOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 3, 1, 4, 3, 5, 4, 2};
        System.out.println(solution.solution(4, a));
    }
}

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
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