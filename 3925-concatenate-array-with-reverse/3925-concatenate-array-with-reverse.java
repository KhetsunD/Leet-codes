class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[2*nums.length];
        for(int left=0,right=(nums.length)*2-1;left<right;left++,right--){
            arr[left]=arr[right]=nums[left];
        }
        return arr;
    }
}