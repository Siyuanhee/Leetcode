public class containerWithMostWater11 {

    public int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;

        while(i < j){

            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }

        }

        return maxArea;

    }

}
