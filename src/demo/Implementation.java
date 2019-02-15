package demo;

import java.util.Scanner;

public class Implementation {

	public static void main(String[] args) {
		System.out.println("********************START**************************");
		System.out.println("Please provide your text to encrypt and decrypt....");
		Scanner scanner = new Scanner(System.in);
		String enteredText = scanner.nextLine();
		System.out.println("Provided Text: "+enteredText);
		String encryptedText = Encrypt.doEncrypt(enteredText);
		System.out.println("Encrypted Text: "+encryptedText);
		String decryptedText = Decrypt.doDecrypt(encryptedText);
		System.out.println("Decrypted Text: "+decryptedText);
		System.out.println("**********************END**************************");
	}

}
