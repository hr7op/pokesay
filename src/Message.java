import utils.*;

public class Message {

    protected static void printMessage(String message) {

        if ((message.length() - 10) > 25)
            System.out.println("-".repeat(41));
        else
            System.out.println("-".repeat(Math.abs(message.length() - 8)));

        System.out.print(TextWrapper.wordWrap(message));

        if ((message.length() - 10) > 25)
            System.out.println("-".repeat(41));
        else
            System.out.println("-".repeat(Math.abs(message.length() - 8)));
        System.out.print("""
                    O
                        O
                            O
                """);
    }
}
