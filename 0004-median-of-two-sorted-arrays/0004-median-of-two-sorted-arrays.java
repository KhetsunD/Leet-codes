class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]= new int[nums1.length+nums2.length];
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[i+j]=nums1[i++];
            }else{
                arr[i+j]=nums2[j++];
            }
        }
        while(i<nums1.length){
            arr[i+j]=nums1[i++];
        }
        while(j<nums2.length){
            arr[i+j]=nums2[j++];
        }
        if (arr.length%2==0){
            return (double) (arr[(arr.length/2)-1]+arr[arr.length/2])/2;
        }
        return arr[arr.length/2];
    }
}