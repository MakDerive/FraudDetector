package main.java;

public class FraudDetector {

    public boolean isFraud(Transaction transaction) {
    	Trader trader = transaction.getTrader();
    	
    	if (transaction.getAmount() > 1000000) {
    		return true;
    	}
    	
    	if (trader.getFullName().equals("Pokemon")) {
			return true;
		}
    	
    	if (trader.getCity().equals("Sydney")) {
			return true;
		}
    	
    	if (trader.getCountry().equals("Jamaica")) {
			return true;
		}
    	
    	if (trader.getCountry().equals("Germany") &&  transaction.getAmount() > 1000) {
			return true;
		}
        return false;
    }

}
