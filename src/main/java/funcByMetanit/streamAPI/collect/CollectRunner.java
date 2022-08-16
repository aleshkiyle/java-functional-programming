package funcByMetanit.streamAPI.collect;

import funcByMetanit.streamAPI.collect.data.Phone;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectRunner {

    private static final List<String> PHONES = List.of("Iphone 8", "HTC U12", "Huawei Nexus 6P",
            "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
            "Sony XPeria Z5", "Meizu Pro 6", "Lenovo S850", "Meizu Pro 6");

    private static final Stream<String> PHONES_STRING_STREAM = Stream.of(
            "Iphone 8", "HTC U12", "Huawei Nexus 6P",
            "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
            "Sony XPeria Z5", "Meizu Pro 6", "Lenovo S850", "Meizu Pro 6"
    );

    private static final Stream<Phone> PHONE_STREAM = Stream.of(
            new Phone("Iphone 8", 54000),
            new Phone("Nokia 9", 45000),
            new Phone("Samsung Galaxy S9", 40000),
            new Phone("LG G6", 32000)
    );

    public static void main(String[] args) {
        CollectLogic collectLogic = new CollectLogic();

        System.out.println("Implement method collect (toList):");
        Consumer<List<String>> consumerImplementCollectToList = collectLogic::implementMethodCollectToList;
        consumerImplementCollectToList.accept(PHONES);
        System.out.println("__________________________________");

        System.out.println("Implement method collect(Collectors.toSet()):");
        Consumer<List<String>> consumerImplementMethodToSet = collectLogic::implementMethodCollectToSet;
        consumerImplementMethodToSet.accept(PHONES);
        System.out.println("_______________________________________");


        System.out.println("Implement method collect(Collectors.toMap()):");
        Consumer<Stream<Phone>> consumerImplementMethodToMap = collectLogic::implementMethodCollectToMap;
        consumerImplementMethodToMap.accept(PHONE_STREAM);
        System.out.println("_______________________________________");


        System.out.println("Implement method collect(Collectors.toCollection()):");
        Consumer<Stream<String>> consumerImplementToArrayListAndToHashSetCollection
                = collectLogic::implementMethodCollectCreateHashSet;
        consumerImplementToArrayListAndToHashSetCollection.accept(PHONES_STRING_STREAM);
        System.out.println("___________________________________________");

        System.out.println("Implement second form method collect(supplier, biConsumer, combiner): ");
        Consumer<List<String>> consumerImplementSecondFormCollect
                = collectLogic::implementSecondFormMethodCollect;
        consumerImplementSecondFormCollect.accept(PHONES);
        System.out.println("_______________________________________________");

    }
}
