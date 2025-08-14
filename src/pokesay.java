import java.io.FileReader;
import java.util.Scanner;

import checks.CommandsHandling;
import checks.InputValidation;
import checks.PokemonList;
import utils.*;

public class pokesay {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        if (args[0].equals("-h"))
            Help.help();

        String message = "";
        if (InputValidation.validate(args)) {

            if (args[1].startsWith("-")) {
                if (CommandsHandling.manageCommands(args[1])) {
                    message = CommandsHandling.MapCommands(args[1], args);
                }
            } else {
                for (int i = 1; i < args.length; i++) {
                    message += args[i] + " ";
                }
                message = "\u001B[37m" + message + "\u001B[0m"; // default white
            }

            if (PokemonList.MappedNum.equals(""))
                PokemonList.MappedNum = args[0];
            String path = PokemonList.MappedNum + ".txt";
            try (FileReader file = new FileReader(("D:\\OneDrive\\Desktop\\pokesay\\ascii\\" + path))) {

                Message.printMessage(message);
                // pokemon ascii art
                int data = file.read();
                while (data != -1) {
                    data = file.read();
                    System.out.print((char) data);
                }
            } catch (Exception e) {
                System.err.println("Invalid format/parameter entered [exit]");
            }
        } else
            System.out.println("Check input protocols.\nType 'java pokesay -h' for Help menu [exit]");
    }
}