package CountDiv;

public class CountDiv {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(0, 2000000000, 1));

    }
}

class Solution {
    public int solution(int A, int B, int K) {
        int dividersA=0;
        int dividersB;
        int dividers = 0;
        if (A <= 0) dividers++;
        if(A!=0) dividersA = (A-1) / K;
        dividersB = B / K;
        dividers = dividers + dividersB - dividersA;
        return dividers;
    }

    //dzielniki liczb
    public int dividers(int number) {
        int counter = 2;//licba przez którąsię dzieli
        int bank = 1;//liczba powturzeń
        int sum = 1;//suma dzielników
        while (number != 1) {

            if (number % counter == 0) {
                number /= counter;
                bank++;
                continue;
            }
            sum *= bank;
            bank = 1;
            counter++;
        }
        sum *= bank;
        return sum;
    }
}