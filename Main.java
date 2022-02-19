class Solution {
public int[] getConcatenation(int[] nums) {

    int[] ans=new int[nums.length+nums.length];
    int n=nums.length;
    for(int i=0;i<nums.length;i++)
    {
     ans[i]=nums[i];
        ans[i+n]=nums[i];
    }
    
    return ans;
}
}
