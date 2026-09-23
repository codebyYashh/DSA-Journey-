package Day02;

public class Buy_Sell {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] arr){
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int i = 1 ; i< arr.length ; i++){
            if(arr[i] < minPrice) {
                minPrice = arr[i];
            }
            int profit = arr[i] - minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
