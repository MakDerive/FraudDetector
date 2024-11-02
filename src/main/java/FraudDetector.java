package main.java;

public class FraudDetector {

    public boolean isFraud(Transaction transaction) {
    	if (transaction.getTrader().getFullName().equals("Pokemon")) {
			return true;
		}
        return false;
    }

}
