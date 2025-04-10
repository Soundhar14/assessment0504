// daily task 10.04.2025
// Missing Numbers(Leetcode question 268)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1)/2;
        int sum = 0;

        for(int num:nums){
            sum += num;
        }

        return total - sum;
    }
}

//Linked List Cycle(Leetcode question 141)

public class Solution {
    public boolean hasCycle(ListNode head) {

        
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow ==fast){
                return true;
            }
        }
        return false;
    }
}

//Longest Valid Parentheses (Leetcode question 32)

class Solution {
    public int longestValidParentheses(String s) {

        int n = s.length();
        int count = 0;
        
        Stack<Integer> stak = new Stack<>();
        stak.push(-1);

        for (int i = 0;i < n;i++){
           char c = s.charAt(i);

           if (c == '('){
                stak.push(i);
           }
            else{
                stak.pop();

                 if (stak.isEmpty()){
                     stak.push(i);
                 }
                 else {
                    count = Math.max(count, i - stak.peek());
                 }

            }
        }

        return count;
        
    }
}
