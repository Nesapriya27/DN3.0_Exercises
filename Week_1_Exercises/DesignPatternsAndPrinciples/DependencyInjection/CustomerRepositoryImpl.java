public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Simulate fetching a customer from a data source
        // For demo purposes, returning a dummy customer
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
