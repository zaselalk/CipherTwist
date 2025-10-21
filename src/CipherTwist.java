public class CipherTwist {

    public static String encrypt(String text, int key) {
        StringBuilder shifted = new StringBuilder();

        // Step 1 & 2: Shift and XOR
        for (char c : text.toCharArray()) {
            char result = (char) ((c + key) ^ key);
            shifted.append(result);
        }

        // Step 3: Reverse the string
        shifted.reverse();

        // Step 4 & 5: Convert to binary and mirror bits
        StringBuilder binaryCipher = new StringBuilder();
        for (char c : shifted.toString().toCharArray()) {
            String bin = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            binaryCipher.append(new StringBuilder(bin).reverse()).append(" ");
        }

        return binaryCipher.toString().trim();
    }

    public static String decrypt(String cipher, int key) {
        // Step 5 & 4: Undo binary mirroring and conversion
        String[] binaries = cipher.split(" ");
        StringBuilder reversedText = new StringBuilder();
        for (String b : binaries) {
            String normal = new StringBuilder(b).reverse().toString();
            char c = (char) Integer.parseInt(normal, 2);
            reversedText.append(c);
        }

        // Step 3: Reverse string back
        reversedText.reverse();

        // Step 2 & 1: Undo XOR and Shift
        StringBuilder plain = new StringBuilder();
        for (char c : reversedText.toString().toCharArray()) {
            char original = (char) (((c ^ key) - key));
            plain.append(original);
        }

        return plain.toString();
    }


}
