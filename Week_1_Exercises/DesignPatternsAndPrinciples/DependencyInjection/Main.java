public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create an instance of the concrete repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Create an instance of the service with the repository injected
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomer(1);

        // Display customer details
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
    }
}
