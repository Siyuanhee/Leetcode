public class twoSumII {

    public static void main(String[] args) {

    }

//    Input: numbers = [2,7,11,15], target = 9
//    Output: [1,2]
//    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

    public static int[] twoSum(int[] numbers, int target) {

        int j = numbers.length - 1;
        int i = 0;
        while (numbers[j] +numbers[i]  > target){
            j--;
        }
        while (j > i){
            if (numbers[j] + numbers[i] == target){
                return new int[]{i,j};
            }
            if (numbers[j] + numbers[i] < target){
                i++;
            }
            if (numbers[j] + numbers[i] > target){
                j--;
            }
        }

        return new int[]{0,0};

    }

}
