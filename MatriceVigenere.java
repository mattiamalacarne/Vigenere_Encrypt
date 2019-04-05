public class MatriceVigenere 
{

	private int dim = 26;
	public char matrix[][] = new char[dim][dim]; 
	public char alphabet[] = new char[dim];
	
	// Costruttore
	public MatriceVigenere()
	{
		initAlphabet();
		initMatrix();
		//printMatrix();
		//printArray();
	}
	
	// Inizializzo l'alfabeto usato nella matrice partendo dal codice ASCII della lettera
	public void initAlphabet()
	{
		int aBase = 65;
		
		for (int i = 0; i < this.alphabet.length; i++)
		{
			this.alphabet[i] = (char)aBase;
			aBase++;
		}
		
	}
	
	private void initMatrix()
	{
		int pos = 0;
		// Colonne
		for (int i = 0; i < 26; i++)
		{
			pos = 0;
			pos+= i;
			// Righe
			for (int j = 0; j < dim; j++)
			{
				if (pos == 26) pos = 0;
				this.matrix[i][j] = this.alphabet[pos];
				
				pos++;
			}
			
		}
	}
	
	private void printMatrix()
	{
		for (int i = 0; i < 26; i++)
		{
			// Righe
			for (int j = 0; j < dim; j++)
			{
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
	private void printArray()
	{
		for (int i = 0; i < this.alphabet.length; i++)
		{
			System.out.println(this.alphabet[i]);
		}
	}
	
	public char[][] getMatrix()
	{
		return this.matrix;
	}
}
