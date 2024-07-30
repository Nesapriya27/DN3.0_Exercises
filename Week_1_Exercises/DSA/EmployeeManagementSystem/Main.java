public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(5);
        Employee emp1 = new Employee("E001", "John Doe", "Software Engineer", 75000);
        Employee emp2 = new Employee("E002", "Jane Smith", "Product Manager", 85000);
        Employee emp3 = new Employee("E003", "Alice Johnson", "UX Designer", 70000);
        Employee emp4 = new Employee("E004", "Bob Brown", "Quality Analyst", 68000);
        Employee emp5 = new Employee("E005", "Charlie Davis", "Developer", 72000);

        // Add employees to the management system
        management.addEmployee(emp1);
        management.addEmployee(emp2);
        management.addEmployee(emp3);
        management.addEmployee(emp4);
        management.addEmployee(emp5);

        // Print all employees
        System.out.println("All Employees:");
        management.traverseEmployees();

        // Search for an employee by ID
        String searchId = "E003";
        Employee foundEmployee = management.searchEmployee(searchId);
        if (foundEmployee != null) {
            System.out.println("\nEmployee found with ID " + searchId + ":");
            System.out.println(foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Delete an employee by ID
        String deleteId = "E002";
        boolean deleted = management.deleteEmployee(deleteId);
        if (deleted) {
            System.out.println("\nEmployee with ID " + deleteId + " deleted successfully.");
        } else {
            System.out.println("\nEmployee with ID " + deleteId + " not found.");
        }

        // Print all employees after deletion
        System.out.println("\nAll Employees After Deletion:");
        management.traverseEmployees();
    }
}
