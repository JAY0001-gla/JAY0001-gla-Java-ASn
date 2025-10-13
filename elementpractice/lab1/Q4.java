package lab1;

public class Q4 {
    public static void main(String args[]){
        int cp = 129;
        int sp = 191;
        int profit = sp - cp;
        double profitPercent = (profit * 100.0) / cp;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}