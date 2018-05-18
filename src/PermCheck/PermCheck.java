package PermCheck;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3};
        System.out.println(solution.solution(a));
    }
}

class Solution {
    public int solution(int[] A) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
        }
        int counter = 1;
        while(true){
            if (a.contains(counter)) {
                if(A.length == counter) return 1;
                counter++;
                continue;
            }
            return 0;
        }
    }
}
