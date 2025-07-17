import java.util.*;

public class CreditCardFraudDetector {

    static class Transaction {
        String location;
        int amount;
        long timestamp;

        public Transaction(String location, int amount, long timestamp) {
            this.location = location;
            this.amount = amount;
            this.timestamp = timestamp;
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
            new Transaction("New York", 150, 1000),
            new Transaction("New York", 200, 1050),
            new Transaction("London", 3000, 1100),
            new Transaction("Tokyo", 5000, 1150),
            new Transaction("New York", 50, 2000)
        );

        List<String> suspicious = detectFraud(transactions);
        System.out.println("🚨 Suspicious Transactions:");
        suspicious.forEach(System.out::println);
    }

    public static List<String> detectFraud(List<Transaction> transactions) {
        List<String> alerts = new ArrayList<>();
        String lastLocation = null;
        long lastTime = 0;

        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);

            // Rule 1: Large amount
            if (t.amount > 1000) {
                alerts.add("High amount: $" + t.amount + " at " + t.location);
            }

            // Rule 2: Different city in short time
            if (lastLocation != null && !lastLocation.equals(t.location)) {
                if (t.timestamp - lastTime < 200) {
                    alerts.add("Unusual location switch: " + lastLocation + " → " + t.location + " in short time");
                }
            }

            // Rule 3: Too many transactions in short period
            if (i >= 2) {
                long delta = t.timestamp - transactions.get(i - 2).timestamp;
                if (delta < 150) {
                    alerts.add("Rapid 3 transactions within " + delta + " seconds");
                }
            }

            lastLocation = t.location;
            lastTime = t.timestamp;
        }

        return alerts;
    }
}