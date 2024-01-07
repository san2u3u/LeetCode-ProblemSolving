/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode(-1); // null head
        ListNode temp = mergeList;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                // push smaller data to temp from node1 and node2
                // and go to next node
                temp.next = list1; // insert present list1 node to temp
                list1= list1.next; // go to next node in list1
            } else {
                temp.next = list2; // insert present list1 node to temp
                list2 = list2.next; // go to next node in list2
            }
            temp = temp.next; // go to next node in temp
        }

        // If list1 or list2 has more data, then strcat to temp
        // If both nodes are null, then result is also null
        if(list1 != null)
            temp.next = list1;
        else 
            temp.next = list2;

        // mergelist has no data, mergelist.next has real node data (started from here)
        return mergeList.next;
    }
}