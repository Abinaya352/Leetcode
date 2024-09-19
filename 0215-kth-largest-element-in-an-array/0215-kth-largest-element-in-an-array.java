class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        System.out.print(pq);

        return 0;


        
        
    }
}