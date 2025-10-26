public class PokesayLogo {
    
    public static void displayLogo() {
        String logo = 
        "\n" +
        "   ╔═══════════════════════════════════════════════════════════════╗\n" +
        "   ║                                                               ║\n" +
        "   ║   ██████╗  ██████╗ ██╗  ██╗███████╗███████╗ █████╗ ██╗   ██╗  ║\n" +
        "   ║   ██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝██╔════╝██╔══██╗╚██╗ ██╔╝  ║\n" +
        "   ║   ██████╔╝██║   ██║█████╔╝ █████╗  ███████╗███████║ ╚████╔╝   ║\n" +
        "   ║   ██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ╚════██║██╔══██║  ╚██╔╝    ║\n" +
        "   ║   ██║     ╚██████╔╝██║  ██╗███████╗███████║██║  ██║   ██║     ║\n" +
        "   ║   ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝   ╚═╝     ║\n" +
        "   ║                                                               ║\n" +
        "   ║                    CLI Version 1.0.0                          ║\n" +
        "   ║                                                          ___  ║\n" +
        "   ║   Gotta format 'em all!                              .-'   `- ║\n" +
        "   ║                                                     /   O O  \\║\n" +
        "   ║                                                    |    ___   ║\n" +
        "   ║                                                     \\  (___) /║\n" +
        "   ║                                                      `-._.-' ║\n" +
        "   ╚═══════════════════════════════════════════════════════════════╝\n";
        
        System.out.println("\u001B[33m" + logo + "\u001B[0m"); // Yellow color
    }
    
    public static void displayColoredLogo() {
        System.out.println("\n");
        System.out.println("   ╔═══════════════════════════════════════════════════════════════╗");
        System.out.println("   ║                                                               ║");
        System.out.println("\u001B[36m   ║   ██████╗  ██████╗ ██╗  ██╗███████╗███████╗ █████╗ ██╗   ██╗ ║");
        System.out.println("   ║   ██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝██╔════╝██╔══██╗╚██╗ ██╔╝ ║");
        System.out.println("   ║   ██████╔╝██║   ██║█████╔╝ █████╗  ███████╗███████║ ╚████╔╝  ║");
        System.out.println("   ║   ██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ╚════██║██╔══██║  ╚██╔╝   ║");
        System.out.println("   ║   ██║     ╚██████╔╝██║  ██╗███████╗███████║██║  ██║   ██║    ║");
        System.out.println("   ║   ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝   ╚═╝    ║\u001B[0m");
        System.out.println("   ║                                                               ║");
        System.out.println("\u001B[33m   ║                    CLI Version 1.0.0                         ║\u001B[0m");
        System.out.println("\u001B[31m   ║                                                          ___  ║");
        System.out.println("   ║   Gotta format 'em all!                              .-'   `-║");
        System.out.println("   ║                                                     /   O O  \\║");
        System.out.println("   ║                                                    |    ___   ║");
        System.out.println("   ║                                                     \\  (___) /║");
        System.out.println("   ║                                                      `-._.-' ║\u001B[0m");
        System.out.println("   ╚═══════════════════════════════════════════════════════════════╝\n");
    }
    
    // Main method to allow standalone execution
    public static void main(String[] args) {
        displayColoredLogo();
    }
}