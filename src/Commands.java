import utils.Help;
import msgCommands.*;

public class Commands {

    protected static boolean manageCommands(String str) {
        if (str.length() == 2) {
            if (str.equals("-h") || str.equals("-c") || str.equals("-b") || str.equals("-i") || str.equals("st"))
                return true;
        }
        return false;
    }

    protected static String MapCommands(String cmd, String args[]) {

        String result = "";
        for (int i = 2; i < args.length; i++) {
            if (cmd.equals( "-c"))
                continue;
            result += args[i] + " ";
        }

        if (cmd.equals( "-h"))
            Help.help();
        if (cmd.equals( "-c"))
            result = Colors.coloredMsg(args[2], result);
        else
            result = Styling.textStyling(cmd, result);
        
        return result;
    }
}