class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(nums,n-k,n-1);
        rev(nums,0,n-k-1);
        rev(nums,0,n-1);
}
public void rev(int[] nums, int s,int e) {
    while(s<e){
    int t=nums[s];
    nums[s]=nums[e];
    nums[e]=t;
    s++;
    e--;
}
}
}