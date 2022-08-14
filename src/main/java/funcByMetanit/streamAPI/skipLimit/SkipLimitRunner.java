package funcByMetanit.streamAPI.skipLimit;

import java.util.List;

public class SkipLimitRunner {

    public static void main(String[] args) {
        List<String> models = List.of(
                "Iphone 6s", "Lumia 950", "Samsung galaxy s6",
                "LG G 4", "Nexus 7", "Lumia 950",
                "Meizu Pro 5", "Lenovo s 850", "ASUS Zenfone 3",
                "Iphone 13", "Heroku test"
        );
        SkipLimitLogic skipLimitLogic = new SkipLimitLogic();

        System.out.println("Implement method skip streams:");
        skipLimitLogic.implementMethodSkip(models);
        System.out.println("----------------------------");

        skipLimitLogic.implementPostNavigationUsingSkipAndLimit(models);
    }
}
