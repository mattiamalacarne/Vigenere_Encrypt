import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args)
	{
		
		Vigenere main = new Vigenere();
		String stringa;
		String key;
		char[][] matrix;
		Scanner scanner = new Scanner(System.in);
		
		MatriceVigenere matrice = new MatriceVigenere();
		matrix = matrice.getMatrix();
		
		System.out.println("Inserisci la frase da cifrare senza spazi ");
		stringa = scanner.nextLine().toUpperCase();
		
		System.out.println("Inserisci la chiave senza spazi ");
		key = scanner.nextLine().toUpperCase();
		
		
		main.crypt(stringa, key, matrix);
	}
	
	public void crypt(String word, String chiave, char[][] matrix)
	{
		// Matrice -> [word][chiave]
		
		int keyPos = 0;
		for (int i = 0; i < word.length(); i++)
		{
			if (keyPos == chiave.length()) keyPos = 0;
			int lettera = word.charAt(i) - 65;
			int keyLetter = chiave.charAt(keyPos) - 65;
			keyPos++;
			//System.out.println(keyLetter);
			System.out.print(matrix[lettera][keyLetter]);
		}
	}
	
}