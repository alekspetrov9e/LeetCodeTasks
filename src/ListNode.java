public class ListNode {
      int val;
      ListNode next;

    public  ListNode(int val) { this.val = val; }
    public  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public String toString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }
        return sb.toString();
    }
  }
