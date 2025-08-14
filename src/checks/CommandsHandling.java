package checks;

import utils.Help;
import styles.*;

public class CommandsHandling {

    public static boolean manageCommands(String str) {
        if (str.length() == 2) {
            if (str.equals("-h") || str.equals("-c") || str.equals("-b") || str.equals("-i") || str.equals("-u")
                    || str.equals("-st") || str.equals("-d") || str.equals("-bl"))
                return true;
        }
        return false;
    }

    public static String MapCommands(String cmd, String args[]) {

        String result = "";
        int stindex = 2;

        if (cmd.equals("-c"))
            stindex = 3;
        for (int i = stindex; i < args.length; i++) {
            result += args[i] + " ";
        }

        if (cmd.equals("-h"))
            Help.help();
        if (cmd.equals("-c"))
            result = Colors.coloredMsg(args[2], result);
        else
            result = textModifications.textStyling(cmd, result);

        return result;
    }
}