package msgCommands;

import utils.TextWrapper;

public class Styling {

    public static String textStyling(String cmd, String msg) {

        if (cmd.equals("-b"))
            return "\u001B[1m" + TextWrapper.wordWrap(msg) + "\u001B[0m";
        if (cmd.equals("-i"))
            return "\u001B[1m" + TextWrapper.wordWrap(msg) + "\u001B[0m";
        if (cmd.equals("-u"))
            return "\u001B[1m" + TextWrapper.wordWrap(msg) + "\u001B[0m";
        if (cmd.equals("-st"))
            return "\u001B[1m" + TextWrapper.wordWrap(msg) + "\u001B[0m";

        return msg;
    }
}
