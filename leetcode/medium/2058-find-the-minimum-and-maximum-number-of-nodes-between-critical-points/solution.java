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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return new int[]{-1,-1};
        ListNode prev=head,curr=head.next;
        List<Integer> list=new ArrayList<>();
        int pos=2;
        while(curr.next!=null) {
            ListNode next=curr.next;
            if((curr.val>prev.val && curr.val>next.val) || (curr.val<prev.val && curr.val<next.val))
                list.add(pos);
            prev=curr;
            curr=next;
            pos++;
        }
        if(list.size()<2) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++) min=Math.min(min,list.get(i)-list.get(i-1));
        int max=list.get(list.size()-1)-list.get(0);
        return new int[]{min,max};
    }
}