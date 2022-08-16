package funcByMetanit.streamAPI.grouping;

import funcByMetanit.streamAPI.grouping.data.Phone;

import java.util.List;
import java.util.stream.Stream;

public interface GroupingLogicImpl {

    void implementGroupingByMethod(Stream<Phone> phoneStream);

    void implementPartitioningByMethodByAppleCompany(List<Phone> phones);

    void implementMethodCollectorsCounting(List<Phone> phones);

    void implementMethodCollectorsSumming(List<Phone> phones);

    void implementMethodsMaxByAndMinBy(List<Phone> phones);

    void implementMethodSummarizing(List<Phone> phones);

    void implementMethodMapping(List<Phone> phones);
}
