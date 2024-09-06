class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;

    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;

        // Traverse the linked list
        while (head != null) {
            // Left shift the current value of decimalValue by 1 (multiply by 2) and add the node's value
            decimalValue = (decimalValue << 1) | head.val;
            head = head.next;  // Move to the next node
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        // Test case: linked list representing the binary number 101
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);

        Solution solution = new Solution();
        int result = solution.getDecimalValue(head);

        // Expected output: 5 (since binary 101 is equal to decimal 5)
        System.out.println("Decimal value: " + result);
    }
}