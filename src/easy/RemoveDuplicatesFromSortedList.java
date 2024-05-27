package easy;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cr = head;
        while (cr != null) {
            while (cr.next != null && cr.val == cr.next.val) {
                cr.next = cr.next.next;
            }
            cr = cr.next;

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(1);
        listNode1.next.next = new ListNode(1);
        listNode1.next.next.next = new ListNode(2);
        listNode1.next.next.next.next = new ListNode(2);
        listNode1.next.next.next.next.next = new ListNode(3);
        listNode1.next.next.next.next.next.next = new ListNode(4);
        listNode1.next.next.next.next.next.next.next = new ListNode(4);

        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList =
                new RemoveDuplicatesFromSortedList();

        ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(listNode1);

        System.out.println(result);
    }
}
