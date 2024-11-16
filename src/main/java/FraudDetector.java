package main.java;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
	
	private List<FraudRule> fraudRules = new ArrayList<FraudRule>(List.of(
			new FraudRule1(),
			new FraudRule2(),
			new FraudRule3()
			));

    public FraudDetectionResult isFraud(Transaction transaction) {
    	return fraudRules.stream()
    					 .filter(rule->rule.isFraud(transaction))
    					 .findFirst()
    					 .map(this::buildFraudResult)
    					 .orElse(buildNotFraudResult());
    }
    
    private FraudDetectionResult buildFraudResult(FraudRule rule) {
    	return new FraudDetectionResult(rule.getRuleName(),true);
    }
    
    private FraudDetectionResult buildNotFraudResult() {
    	return new FraudDetectionResult(null, false);
    }

}
