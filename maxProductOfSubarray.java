public class maxProductOfSubarray {
    // public static int maxProductOfSubarray(int nums[]){
    //     int n = nums.length;
    //     int max = nums[0];
    //     int min = nums[0];
    //     int result = nums[0];
    //     for(int i = 1; i < n; i++){
    //         int temp = max;
    //         max = Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
    //         min = Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);
    //         if(max > result){
    //             result = max;
    //         }
    //     }
    //     return result;  
    // }
        public static int maxProductOfSubarray(int nums[]){
            int n = nums.length;
            int max = nums[0];
            int min = nums[0];
            int result = nums[0];
            for(int i = 1;i<n;i++){
                int temp = max;
                max = Math.max(Math.max(max*nums[i] , min*nums[i]),nums[i]);
                min = Math.min(Math.min(max*nums[i] , min*nums[i]),nums[i]);
                if(max > result){
                    result = max;
                }
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product of Subarray: " +  maxProductOfSubarray(nums));
    }
}
