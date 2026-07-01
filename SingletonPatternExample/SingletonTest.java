public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Loading Files");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application Closed");

        System.out.println();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
        System.out.println(logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Only One Logger Instance Exists");
        } else {
            System.out.println("Multiple Instances Created");
        }
    }
}