package utils;
public class Help {

    public static void help(){

        System.out.println("""
                Usage : java pokesay [Pokemon Name/Index]  [-optional commands] [message]

                The following single-character options are accepted:
                    With arguments: -c [ANSI colors]
                    Boolean (without arguments): -h -b -d -i -u

                Single arguments supported (as of now)

                Limitations: 
                    (1.0) Supports only the first 120 pokemons from the pokedex.
                    (1.1) Format - name -> First letter capital OR index -> three digit number [001...]
                    (2) colors - white(default),black,red,green,yellow,blue,magneta,cyan 
                    (3) -b : bold, -i: italic, -u : underline, -st: strikethrough
                
                DISCLAIMER: 
                (1)If the terminal does not support certain text styles, It will not render. Most terminals support the ANSI colors but not text styles.[You may see undesired outputs in this case!]
                (2) If specifying a color not available in the ANSI codes, will result in a default color printed.
                
                @credits to Maija Haavisto and cowsay.

                @pokesay2025[Version - 1.0.1]
                """);
                System.exit(1);
    }
}