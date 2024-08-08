

public class Main {

        public static void main(String[] args) {

            System.out.println("hello");
            
        }
        public int[] twoSum(int[] nums, int target) {
            int[] arr = {0,0}; 

            for( int i=0; i<nums.length-1;i++){
                if((nums[i]+nums[i+1])==target){
                    arr[0]= i;
                    arr[1]= i+1;
                    break;
                }
            }
            return arr;
        }

  
    
}