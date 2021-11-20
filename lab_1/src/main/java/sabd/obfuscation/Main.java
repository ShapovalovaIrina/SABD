package sabd.obfuscation;

/*
Jackson XML parser articles
1) https://mincong.io/2019/03/19/jackson-xml-mapper/
2) https://stackabuse.com/serialize-and-deserialize-xml-in-java-with-jackson/
*/

import static sabd.obfuscation.Constants.DEOBFUSCATION;
import static sabd.obfuscation.Constants.OBFUSCATION;

public class Main {

    public static void main(String[] args) throws IllegalStateException {
        String mode = System.getenv("mode");
        switch (mode) {
            case OBFUSCATION:
                Obfuscation obfuscation = new Obfuscation();
                obfuscation.obfuscation();
                System.out.println(OBFUSCATION + "  finished :)");
                break;
            case DEOBFUSCATION:
                Deobfuscation deobfuscation = new Deobfuscation();
                deobfuscation.deobfuscation();
                System.out.println(DEOBFUSCATION + "  finished :)");
                break;
            default:
                throw new IllegalStateException(
                        "Expect mode to be: " + OBFUSCATION + " or " + DEOBFUSCATION + ". Have: " + mode
                );
        }
    }
}
