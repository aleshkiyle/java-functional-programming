package funcByMetanit.streamAPI.launchStream;

public class LaunchStreamRunner {

    public static void main(String[] args) {

        LaunchStreamLogic launchStreamLogic = new LaunchStreamLogic();
        System.out.println("Create and outputting a stream of Integers:");
        launchStreamLogic.createAndPrintIntStream();
        System.out.println("------------------------");

        System.out.println("Create and outputting a stream of Doubles:");
        launchStreamLogic.createAndPrintDoubleStream();
        System.out.println("------------------------");

        System.out.println("Implement method forEach(Consumer):");
        launchStreamLogic.implementMethodForEach();
        System.out.println("------------------------");
    }
}
