import java.util.List;

public class FinancialForecasting {
    public static double calculateFutureValueRecursive(double initialValue, List<Double> growthRates, int currentIndex) {
        // Base case: If we have processed all growth rates, return the initial value
        if (currentIndex >= growthRates.size()) {
            return initialValue;
        }

        // Apply the current growth rate
        double newValue = initialValue * (1 + growthRates.get(currentIndex));
        
        // Recursive case: Process the next growth rate
        return calculateFutureValueRecursive(newValue, growthRates, currentIndex + 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial amount in dollars
        List<Double> growthRates = List.of(0.05, 0.03, 0.07, 0.04, 0.06); // Growth rates for each year
        double futureValue = calculateFutureValueRecursive(initialInvestment, growthRates, 0);
        System.out.printf("Future value after applying growth rates: $%.2f%n", futureValue);
    }
}
