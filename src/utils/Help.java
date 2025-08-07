package utils;
public class Help {

    public static void help(){

        System.out.println("""
                Usage : java pokesay [Pokemon Name/Index]  [-optional commands] [message]

                The following single-character options are accepted:
                    With arguments: -c
                    Boolean (without arguments): -h -b -i -st

                -h stops processing of options.

                Limitations: 
                    (1.0) Supports only the first 120 pokemons from first gen pokedex.
                    (1.1) Format - name -> First letter capital / index -> three digit number [001...]
                    (2) colors - white,black,red,green,yellow,blue,magneta,cyan
                    (3) -b : bold, -i: italic, -u : underline, -st: strikethrough
                
                @credits to Maija Haavisto and cowsay.

                @pokesay2025[Version - 1.0.1]
                """);
                System.exit(1);
    }
}