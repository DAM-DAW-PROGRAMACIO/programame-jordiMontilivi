package Easy.Llista2;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class p526 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine().trim();

        while (line != null) {
            line = line.replace(" ", "");  // Eliminamos espacios
            System.out.println(esPot(line) ? "SI" : "NO");

            line = br.readLine();
        }
    }

    public static boolean esPot(String frase) {
        // Lista de los elementos químicos
        String[] elements = {
            "h", "li", "na", "k", "rb", "cs", "fr", "be", "mg", "ca", "sr", "ba", "ra", "sc", "y", "ti", "zr", "hf", "rf", "v", "nb", "ta", "db", "cr", "mo", "w", "sg",
            "mn", "tc", "re", "bh", "fe", "ru", "os", "hs", "co", "rh", "ir", "mt", "ni", "pd", "pt", "ds", "cu", "ag", "au", "rg", "zn", "cd", "hg", "cn", "b", "al", "ga", 
            "in", "tl", "nh", "c", "si", "ge", "sn", "pb", "fl", "n", "p", "as", "sb", "bi", "mc", "o", "s", "se", "te", "po", "lv", "f", "cl", "br", "i", "at", "ts", "he", 
            "ne", "ar", "kr", "xe", "rn", "og", "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd", "tb", "dy", "ho", "er", "tm", "yb", "lu", "ac", "th", "pa", "u", "np", "pu", 
            "am", "cm", "bk", "cf", "es", "fm", "md", "no", "lr"
        };

        if (frase.length() == 0) return true;

        // Iteramos sobre los elementos posibles
        for (String element : elements) {
            // Verificamos si el comienzo de la frase coincide con el elemento
            if (frase.startsWith(element)) {
                // Recursivamente verificamos el resto de la frase
                if (esPot(frase.substring(element.length())))
                    return true;
            }
        }
        return false;
    }
}

