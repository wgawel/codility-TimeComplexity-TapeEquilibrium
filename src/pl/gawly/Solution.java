package pl.gawly;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        long minDiff = Long.MAX_VALUE;
        long leftSum = 0;
//        long rightSum = Arrays.stream(A).sum(); // in codility env. run slower than for{} loop.
        long rightSum = 0;
        for (int i = 0; i < A.length; i++) {
            rightSum += A[i];
        }

        for (int i = 1; i < A.length; i++) {
            leftSum += A[i-1];
            rightSum -= A[i-1];
            long diff = Math.abs(leftSum - rightSum);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return (int) minDiff;
    }
}
