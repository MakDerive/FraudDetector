package main.java;

public class Transaction {
	private Trader trader;
    private int amount;
	public Transaction(Trader trader, int amount) {
		super();
		this.trader = trader;
		this.amount = amount;
	}
	
	public Trader getTrader() {
		return trader;
	}
	
	public int getAmount() {
		return amount;
	}
    
    
}
