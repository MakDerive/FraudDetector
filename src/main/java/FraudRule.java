package main.java;

public interface FraudRule {
	boolean isFraud(Transaction transaction);
	String getRuleName();
}
