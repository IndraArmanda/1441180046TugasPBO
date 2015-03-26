import java.util.Scanner;
public class sepuluh{
	public static void main(String[] agrs)
	{
	System.out.println("*Menggambar sebuah persegi menggunakan karakter #*");
	System.out.print("SISI persegi: ");
	Scanner nilai = new Scanner(System.in);
	int sisi = nilai.nextInt();
	for(int i=1; i<=sisi; i++)
	{
		for(int j=1; j<=sisi; j++)
			{
				System.out.print("#");
			}
		System.out.println("");

	}
	}
}