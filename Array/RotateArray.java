package Array;

public class RotateArray {

    public void rotate(int[] nums, int k){
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;

        }
        
    }
    public void print(int[] nums){
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray obj = new RotateArray();

        obj.rotate(nums, k);
        obj.print(nums);
        
    } 
    
}
