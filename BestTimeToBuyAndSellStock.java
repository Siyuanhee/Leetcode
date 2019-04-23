public class BestTimeToBuyAndSellStock {

    public static void main(String[] args){
        int[] test = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(test));
    }

//    Input: [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Not 7-1 = 6, as selling price needs to be larger than buying price.

    public static int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];
            for (int j = i; j < prices.length; j++) {
                int sellPrice = prices[j];
                if (sellPrice - buyPrice > profit) {
                    profit = sellPrice - buyPrice;
                }
            }
        }

        return profit;
    }
}
