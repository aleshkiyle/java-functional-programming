package functionalInterfaces.consumer;

import entity.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Consumer<T> interface represents an operation that accepts a single argument and returns no result
public class _Consumer {

    public static void main(String[] args) {
        System.out.println("Normal java function: ");
        Customer marina = new Customer("Marina", "999999");
        greetCustomers(marina);
        System.out.println("//////////////////////");


        System.out.println("Consumer functional interface: ");
        greetCustomerConsumer.accept(marina);
        System.out.println("-------------------------------");

        System.out.println("BiConsumer functional interface: ");
        greetCustomerVersionShowNumberPhone.accept(marina, false);

    }

    // Consumer takes 1 argument and produce void function
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello, " + customer.customerName() +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber());

    private  static BiConsumer<Customer, Boolean> greetCustomerVersionShowNumberPhone =
            (customer, showPhoneNumber) -> System.out.println("Hello, " + customer.customerName() +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber() : "*********"));

    private static void greetCustomers(Customer customer) {
        System.out.println("Hello, " + customer.customerName() +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber());
    }
}
