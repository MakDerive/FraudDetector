package main.java;

public class FraudDetectionResult {
	private String ruleName;
	private boolean fraud;
	
	public FraudDetectionResult(String ruleName,boolean fraud) {
		this.ruleName = ruleName;
		this.fraud = fraud;
	}
	
	public boolean isFraud() {
		return fraud;
	}
	
	public String result() {
		return ruleName;
	}
}
