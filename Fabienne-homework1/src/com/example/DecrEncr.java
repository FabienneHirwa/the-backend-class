package com.example;

public class DecrEncr {
        public static char alphabet[]
                = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        public static char decryptionKey[]
                = { '!',')', '"', '(', '£', '*', '%', '&', '>','<', '@','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o' };
        public static String encryption(String a)
        {
            String encrypted = "";
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (a.charAt(i) == alphabet[j])
                    {
                        encrypted += decryptionKey[j];
                        break;
                    }

                }
            }
            return encrypted;
        }
        public static String decryption(String a)
        {
            String decrypted = "";
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (a.charAt(i) == decryptionKey[j]) {
                        decrypted += alphabet[j];
                        break;
                    }

                }
            }
            return decrypted;
        }
        public static void main(String args[])
        {
            String str = "fabienne";
            System.out.println("Message: " + str);
            String encryptedString = encryption(str.toLowerCase());
            System.out.println("Encrypted message: "
                    + encryptedString);
            System.out.println("Decrypted message: "
                    + decryption(encryptedString));

        }
    }

