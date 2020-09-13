class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ret = new int[k]; 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            ret[i] = pq.poll();
        }
        return ret;
    }
}