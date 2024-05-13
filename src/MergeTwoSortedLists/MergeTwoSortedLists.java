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

    void printList(ListNode n)
    {
        while (n != null) {
            System.out.print(n.val);
            System.out.print("->");
            n = n.next;
        }
    }
}


public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = insertNode(list1, list2);
        sort(newNode);
        return newNode;
    }

    /**
     * Bubble Sort
     *
     * @param node
     * @return
     */
    public static ListNode sort(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode current = node;
        ListNode index;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.val >= index.val) {
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

    public static ListNode mergeTwoListsQuickSort(ListNode list1, ListNode list2) {
        ListNode newNode = insertNode(list1, list2);

        if (newNode == null){
            return null;
        }

        ListNode start = newNode;

        while (newNode.next != null) {
            newNode = newNode.next;
        }

        ListNode end = newNode;

        sort(start, end);
        return start;
    }

    public static ListNode partion(ListNode start, ListNode end) {
        if (start == end || start == null || end == null)

            return start;

        ListNode pivot_prev = start;
        ListNode curr = start;
        int pivot = end.val;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) {
            if (start.val < pivot) {
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.val;
                curr.val = start.val;
                start.val = temp;
                curr = curr.next;
            }

            start = start.next;
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.val;
        curr.val = pivot;
        end.val = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }

    /**
     * Quick sort
     *
     * @param start : Node start
     * @param end   : Node end
     * @return : node
     */
    public static void sort(ListNode start, ListNode end) {
        if (start == null || start == end
                || start == end.next)
            return;

        // split list and partition recurse
        ListNode pivot_prev = partion(start, end);

        sort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if (pivot_prev != null && pivot_prev == start)
            sort(pivot_prev.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        else if (pivot_prev != null
                && pivot_prev.next != null)
            sort(pivot_prev.next.next, end);
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);


/*        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);
        listNode.next.next.next = new ListNode(1);
        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next  = new ListNode(4);

        ListNode start = listNode;

        while (listNode.next != null)
            listNode = listNode.next;

        ListNode end = listNode;
        sort(start, end);*/

        ListNode newNode = mergeTwoListsQuickSort(listNode1, listNode2);

        System.out.println("Dsa");
    }
}
