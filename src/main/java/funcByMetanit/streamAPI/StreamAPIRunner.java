package funcByMetanit.streamAPI;

import funcByMetanit.streamAPI.util.Phone;

import java.util.List;
import java.util.logging.Logger;

public class StreamAPIRunner {

    private static final Logger logger = Logger.getLogger(StreamAPIRunner.class.getName());

    public static void main(String[] args) {
        List<String> cities = List.of("Paris", "London", "Madrid", "Brussel", "Ryazan");
        List<Phone> phones = List.of(new Phone("Iphone 8 plus",  45000),
                new Phone("Iphone 12 pro", 65000),
                new Phone("Samsung Galaxy s6", 35000));
        StreamAPILogic streamAPILogic = new StreamAPILogic();

        System.out.println("Create and outputting a stream of Integers:");
        streamAPILogic.createAndPrintIntStream();
        System.out.println("------------------------");

        System.out.println("Create and outputting a stream of Doubles:");
        streamAPILogic.createAndPrintDoubleStream();
        System.out.println("------------------------");

        System.out.println("Implement method forEach(Consumer):");
        streamAPILogic.implementMethodForEach();
        System.out.println("------------------------");

        System.out.println("Implement method filter(Predicate):");
        streamAPILogic.implementFilterByCities(cities);
        System.out.println("------------------------");

        System.out.println("Implement filter phone by price");
        streamAPILogic.implementFilterPhonesByPrice(phones);
        System.out.println("-----------------------------");

        System.out.println("Implement map method where output only phone numbers:");
        streamAPILogic.implementMapMethodOnlyNamePhones(phones);
        System.out.println("-----------------------------");

        System.out.println("Implement map method where output name phones and price:");
        streamAPILogic.implementMapMethodOutputNamePhonesAndPrices(phones);
        System.out.println("-----------------------------");

        System.out.println("Implement method flatMap where discount price:");
        streamAPILogic.implementFlatMapMethodByDiscountPrice(phones);
        System.out.println("-----------");
    }
}
