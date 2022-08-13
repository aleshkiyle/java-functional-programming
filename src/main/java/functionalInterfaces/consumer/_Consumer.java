package functionalInterfaces.consumer;

import entity.Customer;

// Consumer<T> interface represents an operation that accepts a single argument and returns no result
public class _Consumer {

    public static void main(String[] args) {

        ConsumerLogic consumerLogic = new ConsumerLogic();
        System.out.println("Normal java function: ");
        Customer marina = new Customer("Marina", "999999");
        consumerLogic.greetCustomers(marina);
        System.out.println("//////////////////////");


        System.out.println("Consumer functional interface: ");
        consumerLogic.greetCustomerConsumer.accept(marina);
        System.out.println("-------------------------------");

        System.out.println("BiConsumer functional interface: ");
        consumerLogic.greetCustomerVersionShowNumberPhone.accept(marina, false);
    }
}
