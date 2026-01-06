package com.datastructure.stackandqueue;
import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] arr, int k) {

        if (arr == null || k <= 0)
            return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            // Add current index
            dq.offerLast(i);

            // Window ready → record max
            if (i >= k - 1)
                result[idx++] = arr[dq.peekFirst()];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(arr, k);
        System.out.println(Arrays.toString(res));
    }
}
