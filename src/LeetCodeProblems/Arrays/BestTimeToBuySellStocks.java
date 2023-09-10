package LeetCodeProblems.Arrays;

public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        int[] prices={2,5,7,8,1};
        int profit=0,smallest=prices[0],index=0;
        for(int i=0;i<prices.length;i++){
            //Buy at lowest (Find the smallest number in array)
            if(smallest>prices[i]){
                smallest=prices[i];
                index=i;
            }
            //Sell at highest(Find the biggest number after index of smallest)
            if (i>index && prices[i]-smallest>profit) {
                profit=prices[i]-smallest;
            }
        }
        System.out.println(profit);
    }
}
