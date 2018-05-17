package OddOccurrencesInArray;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution.solution(A));
    }
}


class Solution {
    public int solution(int[] A) {
        int a = 0;
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!numbers.containsKey(A[i])) {
                numbers.put(A[i], 1);
                continue;
            }

            a = numbers.get(A[i]);
            numbers.replace(A[i], ++a);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : numbers.entrySet()) {
            if (integerIntegerEntry.getValue() % 2 != 0) {
                a = integerIntegerEntry.getKey();
                break;
            }
            a = 0;
        }
        return a;
    }
}