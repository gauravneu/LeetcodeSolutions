package src.leetcode;

import java.util.HashMap;

public class minimumRoundsToCompleteAllTasks2244 {
    /*
    MEDIUM

    You are given a 0-indexed integer array tasks, where tasks[i]
    represents the difficulty level of a task. In each round,
    you can complete either 2 or 3 tasks of the same difficulty level.
Return the minimum rounds required to complete all the tasks,
or -1 if it is not possible to complete all the tasks.
Example 1:
Input: tasks = [2,2,3,3,2,4,4,4,4,4]
Output: 4
Explanation: To complete all the tasks, a possible plan is:
- In the first round, you complete 3 tasks of difficulty level 2.
- In the second round, you complete 2 tasks of difficulty level 3.
- In the third round, you complete 3 tasks of difficulty level 4.
- In the fourth round, you complete 2 tasks of difficulty level 4.
It can be shown that all the tasks cannot be completed in
fewer than 4 rounds, so the answer is 4.

Example 2:
Input: tasks = [2,3,3]
Output: -1
Explanation: There is only 1 task of difficulty level 2,
but in each round, you can only complete either 2 or 3
tasks of the same difficulty level. Hence, you cannot
complete all the tasks, and the answer is -1.
Constraints:
1 <= tasks.length <= 105
1 <= tasks[i] <= 109
     */


    public int minimumRounds(int[] tasks) {
        int minWays = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : tasks) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        int m = 0;
        for (int i : hm.keySet()) {
            int val = hm.get(i);
            if (val < 2) return -1;
            if (val == 4) {
                m = 2;
            } else {
                m = calcMin(hm.get(i));
                if (m == Integer.MAX_VALUE) return -1;
            }
            minWays += m;
        }
        return minWays;
    }

    public int calcMin(int i) {
        int min = Integer.MAX_VALUE;
        if ((i - 4) % 3 == 0) {
            min = Math.min(min, ((i - 4) / 3) + 2);
        } else if ((i - 2) % 3 == 0) {
            min = Math.min(min, ((i - 2) / 3) + 1);
        } else if (i % 3 == 0) {
            min = Math.min(min, i / 3);
        } else if (i % 2 == 0) {
            min = Math.min(min, (i / 2));
        }


        return min;
    }
}
