

public class CaeserCode {
    
    public StringBuffer encryptCaesar(int shift,  String text){

        StringBuffer encryptText = new StringBuffer();

        for(int i = 0; i < text.length(); i++){

            char character = text.charAt(i);
            int charCode = (int) character;
            int encryptCharCode = charCode + shift;
            char encryptCharacter = (char) encryptCharCode;
            encryptText.append(encryptCharacter);
        }
        return encryptText;
    }

    public StringBuffer decryptCaesar (int shift,  String text){

        StringBuffer decryptText = new StringBuffer();

        for(int i = 0; i < text.length(); i++){

            char character = text.charAt(i);
            int charCode = (int) character;
            int decryptCharCode = charCode -shift;
            char decryptCharacter = (char) decryptCharCode;
            decryptText.append(decryptCharacter);
        }

        return decryptText;
    }
}
