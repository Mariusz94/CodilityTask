package FrogJmp;

public class FrogJmp {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10, 85, 30));
    }
}

class Solution {
    int solution(int X, int Y, int D) {
        if (Y<=X){
            return 0;
        }
        double a=((Y-X)/(double)D);

        int b = (int)a;
        if (a%Math.round(a) != 0){
            b=(int)a +1;
        }
        return b;
    }
}