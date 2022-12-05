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

public class RemoveNthNodeFromLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head, temp2 = head;
        ListNode resultList = temp2;
        int length = 0, tempLength = 0;

        while (temp2 != null) {
            if (temp != null) {
                length++;
                temp = temp.next;
                continue;
            }

            int traverseDistance = length - n;

            if (length == 1 || traverseDistance == 0) {
                return temp2.next;
            }

            if (tempLength == (traverseDistance - 1)) {
                temp2.next = temp2.next.next;
                return resultList;
            }
            tempLength++;
            temp2 = temp2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromLL test = new RemoveNthNodeFromLL();
        ListNode listNode = new ListNode(1, new ListNode(2));
        listNode.next.next = new ListNode(3, new ListNode(4));
        listNode.next.next.next.next = new ListNode(5);
        ListNode result = test.removeNthFromEnd(listNode, 2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
