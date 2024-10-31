import java.util.HashMap;

public class Cipher {

    private int key;
//    int userShiftSymbol;

    public Cipher() {

    }


    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};


    public HashMap<Character, Character> createNewAlphabet(int userShiftSymbol) {

        HashMap<Character, Character> newAlphabet = new HashMap<>();
        int alphabetLength = ALPHABET.length;

        for (int i = 0; i < alphabetLength; i++) {

            int newIndex = (i + userShiftSymbol) % alphabetLength;
            if (newIndex < 0) {
                newIndex += alphabetLength;
            }
            newAlphabet.put(ALPHABET[i], ALPHABET[newIndex]);
        }

        return newAlphabet; // В
    }


    public String encryptString(String string, HashMap<Character, Character> modifiedAlphabet) {
        String encryptString = "";

        char[] inputCharacterArray = string.toCharArray();
        char[] outputCharacterArray = new char[inputCharacterArray.length];

        for (int i = 0; i < inputCharacterArray.length; i++) {


            outputCharacterArray[i] = modifiedAlphabet.get(Character.toLowerCase(inputCharacterArray[i]));


        }


        return outputCharacterArray.toString();

    }


}
