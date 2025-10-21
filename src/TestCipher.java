public class TestCipher {
    public static void main(String[] args) {
        String plaintext = "Hello World";
        int key = 42;
        
        System.out.println("Original Text: " + plaintext);
        System.out.println("Key: " + key);
        
        String encrypted = CipherTwist.encrypt(plaintext, key);
        System.out.println("\nEncrypted: " + encrypted);
        
        String decrypted = CipherTwist.decrypt(encrypted, key);
        System.out.println("\nDecrypted: " + decrypted);
        
        System.out.println("\nTest " + (plaintext.equals(decrypted) ? "PASSED" : "FAILED"));
    }
}
