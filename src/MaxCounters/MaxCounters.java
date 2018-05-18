package MaxCounters;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int[] counters = solution.solution(5, a);
        for (int counter : counters) {
            System.out.print(counter + " ");
        }
    }
}

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int lastMaxCounter = 0;
        for (int aA : A) {

            if (aA <= N) {
                int position = aA - 1;
                counters[position] += 1;
                if (counters[position] > maxCounter) maxCounter = counters[position];
                continue;
            }
            if (maxCounter == lastMaxCounter) continue;
            if (aA == N + 1) {

                for (int i1 = 0; i1 < counters.length; i1++) {

                    counters[i1] = maxCounter;
                }
                lastMaxCounter=maxCounter;
            }
        }
        return counters;
    }
}
//88%


/*
class Solution {
    public int[] solution(int N, int[] A) {

        final int condition = N + 1;
        int currentMax = 0;
        int lastUpdate = 0;
        int countersArray[] = new int[N];

        for (int iii = 0; iii < A.length; iii++) {
            int currentValue = A[iii];
            if (currentValue == condition) {
                lastUpdate = currentMax;
            } else {
                int position = currentValue - 1;
                if (countersArray[position] < lastUpdate)
                    countersArray[position] = lastUpdate + 1;
                else
                    countersArray[position]++;

                if (countersArray[position] > currentMax) {
                    currentMax = countersArray[position];
                }
            }

        }

        for (int iii = 0; iii < N; iii++)
            if (countersArray[iii] < lastUpdate)
                countersArray[iii] = lastUpdate;

        return countersArray;
    }
}

//100%*/
