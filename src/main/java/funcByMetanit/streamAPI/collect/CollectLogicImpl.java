package funcByMetanit.streamAPI.collect;

import funcByMetanit.streamAPI.collect.data.Phone;

import java.util.List;
import java.util.stream.Stream;

public interface CollectLogicImpl {

    void implementMethodCollectToList(List<String> phones);

    void implementMethodCollectToSet(List<String> phones);

    void implementMethodCollectToMap(Stream<Phone> phoneStream);

    void implementMethodCollectCreateHashSet(Stream<String> phones);

    void implementSecondFormMethodCollect(Stream<String> phones);
}
