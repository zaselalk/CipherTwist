# CipherTwist

A Java-based encryption and decryption application implementing a custom cipher algorithm that combines shift operations, XOR operations, string reversal, and binary mirroring for secure text encryption.

## Overview

CipherTwist is a unique cipher implementation that applies multiple transformation layers to encrypt text:
1. **Shift and XOR**: Each character is shifted by the key value and then XORed with the key
2. **Reverse**: The resulting string is reversed
3. **Binary Conversion**: Each character is converted to its 8-bit binary representation
4. **Mirror Bits**: The binary representation is mirrored (reversed)

The decryption process reverses these steps to recover the original plaintext.

## Features

- **Multi-layer Encryption**: Combines multiple cryptographic techniques for enhanced obfuscation
- **Integer Key Support**: Uses a simple integer key for encryption and decryption
- **Graphical User Interface**: User-friendly GUI built with Java Swing
- **Binary Output Format**: Encrypted text is represented as space-separated binary strings
- **Reversible**: Perfectly reversible decryption with the correct key

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE) 8 or higher

## Installation

1. Clone the repository:
```bash
git clone https://github.com/zaselalk/CipherTwist.git
cd CipherTwist
```

2. Compile the Java source files:
```bash
cd src
javac *.java
```

## Usage

### Running the GUI Application

Launch the graphical interface:
```bash
java Main
```

Or directly:
```bash
java EncripterGUI
```

The GUI provides:
- A text field to enter plaintext
- A key field for the encryption/decryption key (integer)
- An "Encrypt" button to encrypt the plaintext
- An "Decrypt" button to decrypt the encrypted text
- Display areas for encrypted and decrypted output

### Using the Cipher Programmatically

You can also use the `CipherTwist` class directly in your Java code:

```java
public class Example {
    public static void main(String[] args) {
        String plaintext = "Hello World";
        int key = 42;
        
        // Encrypt
        String encrypted = CipherTwist.encrypt(plaintext, key);
        System.out.println("Encrypted: " + encrypted);
        
        // Decrypt
        String decrypted = CipherTwist.decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}
```

### Example

**Input:**
- Plaintext: `Hello World`
- Key: `42`

**Encrypted Output:**
```
00100101 00111101 01101101 11001101 11010101 00000110 11001101 00111101 00111101 10100101 00011010
```

**Decrypted Output:**
```
Hello World
```

## Project Structure

```
CipherTwist/
├── src/
│   ├── CipherTwist.java      # Core encryption/decryption logic
│   ├── EncripterGUI.java     # GUI implementation
│   └── Main.java              # Application entry point
├── .gitignore
├── README.md
├── CONTRIBUTING.md
├── LICENSE
└── ShiftXOR Cipher.iml
```

## How It Works

### Encryption Process

1. **Shift and XOR**: For each character in the plaintext:
   - Add the key value to the character's ASCII value
   - XOR the result with the key
   
2. **Reverse**: Reverse the entire transformed string

3. **Binary Conversion**: Convert each character to its 8-bit binary representation

4. **Mirror Bits**: Reverse each binary string

### Decryption Process

The decryption process reverses each encryption step in reverse order:

1. **Un-mirror Bits**: Reverse each binary string back to normal
2. **Binary to Character**: Convert binary strings back to characters
3. **Un-reverse**: Reverse the string back to its pre-reversed state
4. **Un-XOR and Un-shift**: XOR with the key and subtract the key value

## Security Note

⚠️ **Important**: This cipher is designed for educational purposes and basic text obfuscation. It should **NOT** be used for securing sensitive data or communications. For production-grade security, use established cryptographic libraries and algorithms like AES, RSA, or other industry-standard encryption methods.

## Contributing

Contributions are welcome! Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Authors

- **zaselalk** - *Initial work* - [zaselalk](https://github.com/zaselalk)

## Acknowledgments

- Built with Java Swing for the GUI
- Inspired by classic cipher techniques and modern cryptographic concepts
- Educational project demonstrating multi-layered encryption approaches
