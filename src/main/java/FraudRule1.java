package main.java;

public class FraudRule1 implements FraudRule{

	@Override
	public boolean isFraud(Transaction transaction) {
		Trader trader = transaction.getTrader();
		return transaction.getAmount() > 1000000;
	}
	
}
