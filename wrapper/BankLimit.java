public class BankLimit {
    public static double remainingLimit(Double limit) {
        return limit == null ? 0.0 : limit;
    }

    public static void main(String[] args) {
        System.out.println("Limit = 5000.0 → " + remainingLimit(5000.0));
        System.out.println("Limit = null → " + remainingLimit(null));
    }
}
