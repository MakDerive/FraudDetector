package main.java;

public class FraudDetector {

    boolean isFraud(Transaction transaction) {
    	if (transaction.getTrader().getFullName().equals("Pokemon")) {
			return true;
		}
        return false;
    }

}
