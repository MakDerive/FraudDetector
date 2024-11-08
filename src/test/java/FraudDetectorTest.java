package test.java;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import main.java.FraudDetector;
import main.java.Trader;
import main.java.Transaction;

public class FraudDetectorTest {
	private FraudDetector fraudDetector = new FraudDetector();
	@Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
        Trader trader = new Trader("Jon", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudTransactionWithAmountMoreThen1000000() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudIfTraderFromSydney() {
        Trader trader = new Trader("Zorro", "Sydney", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudIfTraderFromJamaica() {
        Trader trader = new Trader("Zorro", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudIfTraderFromGermanyAndAmountMoreThan1000() {
        Trader trader = new Trader("Zorro", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldBeValidTransaction() {
        Trader trader = new Trader("Zorro", "Rome", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudDetector.isFraud(transaction));
    }

}
