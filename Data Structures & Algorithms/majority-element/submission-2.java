// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }

class Solution{
    public int majorityElement(int[] nums){
        int cand = nums[0];
        int count = 0;
        for(int num : nums){
            if(count == 0) cand = num;
            count += (cand == num) ? 1 : -1;
        }
        return cand;
    }
}