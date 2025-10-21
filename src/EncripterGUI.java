import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncripterGUI extends JFrame {
    private JTextField plaintextField;
    private JTextField keyField;
    private JTextArea encryptedArea;
    private JTextArea decryptedArea;
    private JButton encryptButton;
    private JButton decryptButton;

    public EncripterGUI() {
        setTitle("ShiftXOR Cipher Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel plaintextLabel = new JLabel("Plaintext:");
        gbc.gridx = 0; gbc.gridy = 0;
        add(plaintextLabel, gbc);
        plaintextField = new JTextField(30);
        gbc.gridx = 1; gbc.gridy = 0;
        add(plaintextField, gbc);

        JLabel keyLabel = new JLabel("Key (integer):");
        gbc.gridx = 0; gbc.gridy = 1;
        add(keyLabel, gbc);
        keyField = new JTextField(10);
        gbc.gridx = 1; gbc.gridy = 1;
        add(keyField, gbc);

        encryptButton = new JButton("Encrypt");
        gbc.gridx = 0; gbc.gridy = 2;
        add(encryptButton, gbc);
        decryptButton = new JButton("Decrypt");
        gbc.gridx = 1; gbc.gridy = 2;
        add(decryptButton, gbc);

        JLabel encryptedLabel = new JLabel("Encrypted:");
        gbc.gridx = 0; gbc.gridy = 3;
        add(encryptedLabel, gbc);
        encryptedArea = new JTextArea(2, 30);
        encryptedArea.setLineWrap(true);
        encryptedArea.setWrapStyleWord(true);
        encryptedArea.setEditable(false);
        gbc.gridx = 1; gbc.gridy = 3;
        add(new JScrollPane(encryptedArea), gbc);

        JLabel decryptedLabel = new JLabel("Decrypted:");
        gbc.gridx = 0; gbc.gridy = 4;
        add(decryptedLabel, gbc);
        decryptedArea = new JTextArea(2, 30);
        decryptedArea.setLineWrap(true);
        decryptedArea.setWrapStyleWord(true);
        decryptedArea.setEditable(false);
        gbc.gridx = 1; gbc.gridy = 4;
        add(new JScrollPane(decryptedArea), gbc);

        encryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = plaintextField.getText();
                String keyText = keyField.getText();
                try {
                    int key = Integer.parseInt(keyText);
                    String encrypted = CipherTwist.encrypt(text, key);
                    encryptedArea.setText(encrypted);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Key must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String encrypted = encryptedArea.getText();
                String keyText = keyField.getText();
                try {
                    int key = Integer.parseInt(keyText);
                    String decrypted = CipherTwist.decrypt(encrypted, key);
                    decryptedArea.setText(decrypted);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Key must be an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EncripterGUI().setVisible(true);
        });
    }
}

