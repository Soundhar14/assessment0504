//14.04.2025
//stack 
//150 Evaluate Reverse Polish Notation

class Notation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stak = new ArrayDeque<>();
        for(String temp : tokens) {
            if(temp.length() > 1 || Character.isDigit(temp.charAt(0))) {
                stak.push(Integer.parseInt(temp));
            }
            else {
                int y = stak.pop();
                int x = stak.pop();

                switch(temp) {
                    case "+":
                        stak.push(x + y);
                        break;
                    case "-":
                        stak.push(x - y);
                        break;
                    case "*":
                        stak.push(x * y);
                        break;
                    default:
                        stak.push(x / y);
                        break;
                }
            }
        }
        return stak.pop();
    }
}

//84 largest rectangle in histogram

class Histogram {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        int n = heights.length;

        Deque<Integer> stak = new ArrayDeque<>();
        
        int [] leftArray = new int[n];
        int [] rightArray = new int[n];
        Arrays.fill(rightArray , n);

        for (int i = 0 ; i  < n;i++){
            while(!stak.isEmpty() && heights[stak.peek()] >= heights[i]) {
                rightArray[stak.pop()] = i;
            }
            leftArray[i] = stak.isEmpty() ? -1 : stak.peek();
            stak.push(i);
        }

        for(int i = 0; i < n;++i){
            result = Math.max(result , heights[i] * (rightArray[i] - leftArray[i] - 1));
        }
        return result;
    }
}

//Linked List
//25 Reverse Nodes in K-group

class Reverse {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode firstGroup = dummy;

        while (length >= k) {
            ListNode groupStart = firstGroup.next;
            ListNode current = groupStart.next;

            for (int i = 1; i < k; i++) {
                groupStart.next = current.next;
                current.next = firstGroup.next;
                firstGroup.next = current;
                current = groupStart.next;
            }

            firstGroup = groupStart;
            length -= k;
        }

        return dummy.next;
    }
}

//
