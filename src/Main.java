public class Main {
    static String ogString = "programming is easy";  // Original string
    static String modString = "";  // Stores the string after it's been modified
    static String upperOrLower; // string for the first two lines, will decide if a letter is upper or lower case

    public static void main(String[] args) {
        for(int i = 0; i < ogString.length(); i++){
            if(!ogString.substring(i, i+1).equals(" ")){
                modString += ogString.substring(i, i + 1);
            }
        }

        reset();

        // Creates the first line, alternating case every letter and spacing between every letter
        for (int i = 1; i <= ogString.length(); i++) {
            upperOrLower = ogString.substring(i - 1, i);
            if (i % 2 == 0) {
                upperOrLower = upperOrLower.toUpperCase();
            } else {
                upperOrLower = upperOrLower.toLowerCase();
            }
            modString += upperOrLower + " ";
        }

        reset();
        print();

        // Removes spacing
        for (int j = 0; j < ogString.length(); j++) {
            if(!ogString.substring(j, j+1).equals(" ")){
                modString += ogString.substring(j, j + 1);
            }
        }

        reset();
        print();

        // Removes every other letter, then
        while (ogString.length() > 1) {
            for (int j = 0; j < ogString.length(); j+=2) {
                modString += ogString.substring(j, j + 1);
            }
            reset();
            print();
        }
    }

    // Resets the string values
    public static void reset(){
        ogString = modString;
        modString = "";
    }

    // Prints the new string value
    public static void print() {
        System.out.println(ogString);
    }
}

