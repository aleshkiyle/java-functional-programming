package functionalInterfaces.consumer;

import entity.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerLogic {

    // Consumer takes 1 argument and produce void function
    public Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello, " + customer.customerName() +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber());

    public BiConsumer<Customer, Boolean> greetCustomerVersionShowNumberPhone =
            (customer, showPhoneNumber) -> System.out.println("Hello, " + customer.customerName() +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber() : "*********"));

    public void greetCustomers(Customer customer) {
        System.out.println("Hello, " + customer.customerName() +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber());
    }
}
