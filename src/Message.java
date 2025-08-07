import utils.*;

public class Message {

    protected static void printMessage(String message) {

        System.out.println("-".repeat(message.length()));
        System.out.print(TextWrapper.wordWrap(message));
        System.out.println("-".repeat(message.length()));
        System.out.print("""
                    -0-
                        -0-
                            -0-
                """);
    }
}
