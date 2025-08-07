import java.io.*;

public class PokemonList {

    protected static String MappedNum="";
    protected static boolean searchList(String name) {
        try (var br = new BufferedReader(new InputStreamReader(
                new FileInputStream("D:\\OneDrive\\Desktop\\Ben10\\alien\\ascii\\pokedex.txt")))) {
            String str;
            while (br.ready()) {
                str = br.readLine(); MappedNum=str.substring(1,str.indexOf(" "));
                str = str.substring(str.indexOf(" ") + 1);

                if (name.equals(str)) {
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}