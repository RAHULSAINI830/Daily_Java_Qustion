// nums[] = {5,7,7,8,8,10};
// target = 8;

class Solution {
    public int[] searchRange(int[] nums, int target) {
           int[] ans = {-1,-1};
           int Start = search(nums,target,true);
           int end = search(nums,target,false);
           ans[0] = Start;
           ans[1] = end;

           return ans;
        
    }
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int Start = 0;
        int end = nums.length - 1;

        while(Start <= end){
            int mid = Start + (end - Start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                Start = mid + 1;
            }else{
                // potential answer is found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    Start = mid +1;
                }
            }
            

        }
        return ans;
    }
}
