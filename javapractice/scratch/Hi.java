package javapractice.scratch;

class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(nums1[i] % (nums2[j] * k)==0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}