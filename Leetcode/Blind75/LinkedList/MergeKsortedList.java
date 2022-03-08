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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr=new ArrayList<Integer>();
        for(ListNode ln :lists){
            while(ln != null){
                arr.add(ln.val);
                ln=ln.next;
            }
        }
        
        
        Collections.sort(arr);
        ListNode l=new ListNode(0);
        ListNode h=l;
        for(int i: arr){
            ListNode t=new ListNode(i);
            h.next=t;
            h=h.next;
        }
        
        h.next=null;
        return l.next;
        
        
    }
}