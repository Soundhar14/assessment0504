public class Floyldcycle {

    static class Node {
        int root;
        Node next;
        Node(int root) {
            this.root = root;
            this.next = null;
        }
    }

    public static boolean spottedCycle(Node head) {
        if (head == null) return false;
        
        Node slow = head;
        Node fast = head.next;
        
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

 
    public static Node listofCycle(int[] arr, int position) {
        if (arr == null || arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node present = head;
        Node round= null;
        
        if (position == 0) {
            round = head;
        }
        
        for (int i = 1; i < arr.length; i++) {
            present.next = new Node(arr[i]);
            present = present.next;
            if (i == position)
            {
                round = present;
            }
        }
        
        if (position >= 0) present.next = round;
        return head;
    }

    public static void main(String[] args) {

        Node list1 = listofCycle(new int[]{1, 2, 3, 4}, -1);
        System.out.println("Test 1 (No cycle): " + spottedCycle(list1));
    }
}