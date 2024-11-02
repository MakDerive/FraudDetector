package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.FraudDetector;
import main.java.Trader;
import main.java.Transaction;

public class FraudDetectorTest {
	Trader trader = new Trader("Pokemon2", "Moscow");
	Transaction transaction = new Transaction(trader, 10);
	@Test 
	void isFraud() {
		FraudDetector fraudDetector = new FraudDetector();
		boolean fraud = fraudDetector.isFraud(transaction);
		Assertions.assertFalse(fraud);

	}
}
