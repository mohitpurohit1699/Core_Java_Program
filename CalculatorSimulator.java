package ajp_java;

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        // Test Case 1
        try {
            double tax = taxCalculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }

        // Test Case 2
        try {
            double tax = taxCalculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }

        // Test Case 3
        try {
            double tax = taxCalculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }

        // Test Case 4
        try {
            double tax = taxCalculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            e.printStackTrace();
        }
    }
}

