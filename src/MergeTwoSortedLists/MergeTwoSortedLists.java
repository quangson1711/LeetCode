package MergeTwoSortedLists;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode newNode = insertNode(list1,list2);
            sort(newNode);
            return newNode;
    }

    public static ListNode sort(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode current = node;
        ListNode index;

        while (current != null) {
            index = current.next;
            while (index != null){
                if(current.val >= index.val){
                    int temp = current.val;
                    current.val = index.val;
                    index.val = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
        return node;
    }

    public static ListNode insertNode(ListNode list1, ListNode list2) {
        ListNode newNode = null;
        if (list1 == null && list2 == null) {
            return newNode;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        newNode = list1;
        ListNode currentNewNode = newNode;
        while (currentNewNode.next != null) {
            currentNewNode = currentNewNode.next;
        }
        currentNewNode.next = list2;
        return newNode;

    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        ListNode newNode = insertNode(listNode1, listNode2);

        sort(newNode);

        System.out.println("Dsa");
    }
}
