import java.io.FileReader;
import java.util.Scanner;
import utils.*;

public class pokesay {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        if (args[0].equals("-h"))
            Help.help();

        String message = "";
        if (InputValidation.validate(args)) {

            if (args[1].startsWith("-")) { // for loop for multi commands?
                if (Commands.manageCommands(args[1])) {
                    message = Commands.MapCommands(args[1], args);
                }
            } else {
                System.out.println("Entered");
                for (int i = 1; i < args.length; i++) {
                    message += args[i] + " ";
                }
            }

            if (PokemonList.MappedNum.equals(""))
                PokemonList.MappedNum = args[0];
            String path = PokemonList.MappedNum + ".txt";
            try (FileReader file = new FileReader(("D:\\OneDrive\\Desktop\\Ben10\\alien\\ascii\\" + path))) {

                Message.printMessage(message);
                // pokemon ascii art
                int data = file.read();
                while (data != -1) {
                    data = file.read();
                    System.out.print((char) data);
                }
            } catch (Exception e) {
                System.out.println("Invalid format/parameter entered");
            }
        } else
            System.out.println("Check your field [exit]");
    }
}

// ADD FEATURES. and commit common changes.