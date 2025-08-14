package checks;
public class InputValidation {

    public static boolean validate(String[] arr) {
        
        if (!arr[0].startsWith("-")) {

            // print by name
            if (!arr[0].isEmpty() && Character.isUpperCase(arr[0].charAt(0))) {
                if (PokemonList.searchList(arr[0])) {
                    return true;
                }else return false;
            } else {
                // print by pokedex index
                try {
                    int index = Integer.parseInt(arr[0]);
                    if(!(index <=0 || index>120)) return true;
                } catch (NumberFormatException e) {
                    System.out.println("You entered invalid parameters");
                    System.out.println("For Help: java pokesay -h");
                }
            }
        }
        return false;
    }
}
