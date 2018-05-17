package TapeEquilibrium;

public class TapeEquilibrium {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int a []={3,1,2,4,3};
        System.out.println(solution.solution(a));
    }
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sumAll = sumArray(A);
        int sumFirst = 0;
        int sumlast;
        int diference;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length-1; i++) {
            sumFirst=sumFirst+A[i];
            sumlast = sumAll-sumFirst;
            diference=Math.abs(sumFirst-sumlast);
            if (diference < min){
                min=diference;
            }
        }
        return min;
    }


    private int sumArray(int[] A) {
        int sum =0;
        for (int i = 0; i < A.length; i++) {
            sum= sum+A[i];
        }
        return sum;
    }
}