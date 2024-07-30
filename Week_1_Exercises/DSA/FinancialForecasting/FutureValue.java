public class FinancialForecasting {
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if no years left, return the initial value
        if (years == 0) {
            return initialValue;
        }

        // Recursive case: calculate future value for the remaining years
        double futureValue = calculateFutureValue(initialValue, growthRate, years - 1);
        return futureValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; 
        double annualGrowthRate = 0.05; 
        int numberOfYears = 10; 

        // Calculate future value
        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, numberOfYears);
        System.out.printf("Future value after %d years: $%.2f%n", numberOfYears, futureValue);
    }
}
