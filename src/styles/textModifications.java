package styles;

public class textModifications {

    public static String textStyling(String cmd, String msg) {

        if (cmd.equals("-b"))
            return "\u001B[1m" + msg + "\u001B[0m";
        if (cmd.equals("-d"))
            return "\u001B[2m" + msg + "\u001B[0m";
        if (cmd.equals("-i"))
            return "\u001B[3m" + msg + "\u001B[0m";
        if (cmd.equals("-u"))
            return "\u001B[4m" + msg + "\u001B[0m";

        return "\u001B[37m" + msg + "\u001B[0m";
    }
}
