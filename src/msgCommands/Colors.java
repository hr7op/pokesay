package msgCommands;

public class Colors {

    public static String coloredMsg(String color, String msg) {

        color = color.toLowerCase();

        if (color.equals("red"))
            return "\u001B[31m" + msg + "\u001B[0m";
        if (color.equals("green"))
            return "\u001B[32m" + msg + "\u001B[0m";
        if (color.equals("yellow"))
            return "\u001B[33m" + msg + "\u001B[0m";
        if (color.equals("blue"))
            return "\u001B[34m" + msg + "\u001B[0m";
        if (color.equals("magneta"))
            return "\u001B[35m" + msg + "\u001B[0m";
        if (color.equals("cyan"))
            return "\u001B[36m" + msg + "\u001B[0m";
        if (color.equals("black"))
            return "\u001B[30m" + msg + "\u001B[0m";

        return "\u001B[37m" + msg + "\u001B[0m";
    }
}
