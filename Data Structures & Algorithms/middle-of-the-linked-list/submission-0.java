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
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodeList=new ArrayList<>();
        ListNode curr=head;
        while(curr !=null)
        {
            nodeList.add(curr);
            curr=curr.next;
        }
        return nodeList.get(nodeList.size()/2);
    }
}