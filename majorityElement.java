public class majorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            }else if (candidate == num) {
	            count++;
	        } else {
	             count--;
	        }
	    }
        int count2 = 0;
        for (int num : nums) {
            if (num == candidate) {
                count2++;
            }
        }
        if (count2 <= nums.length / 2) {
            return -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " +  majorityElement(nums));
    }
}
