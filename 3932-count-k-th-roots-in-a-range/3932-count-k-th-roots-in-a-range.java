class Solution {
    public int countKthRoots(int l, int r, int k) {
        int i=0;
        int count=0;
        if(k==1){
            return(r-l+1);
        }
        while(Math.pow(i,k)<=r){
            if(Math.pow(i,k)>=l){
                count++;
            }
            i++;
        }
        return count;
    }
}