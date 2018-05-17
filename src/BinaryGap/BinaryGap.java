package BinaryGap;

public class BinaryGap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1376796946));
    }
}


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    int solution(int N) {
        StringBuilder binaryReprezentationOfN = new StringBuilder();
        int counter = 0;
        int counterMain = 0;
        while (N != 0) {
            if (N % 2 == 0) {
                binaryReprezentationOfN.append("0");
            } else {
                binaryReprezentationOfN.append("1");
            }
            N = N / 2;
        }
        binaryReprezentationOfN.reverse();
        System.out.println(binaryReprezentationOfN.toString().toCharArray());
        for (char b : binaryReprezentationOfN.toString().toCharArray()) {
            if (b =='0') {
                counter++;
            } else {
                if (counter > counterMain) {
                    counterMain = counter;
                }
                counter = 0;
            }
        }
        return counterMain;
    }
}