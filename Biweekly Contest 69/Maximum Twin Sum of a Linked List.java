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
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int len=arr.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=len/2-1;i++){
            int max1=(int)arr.get(i)+(int)arr.get(len-i-1);
            if(max1>max)
                max=max1;
        }
        return max;
    }
}
