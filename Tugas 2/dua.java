import java.util.Scanner;
class dua{
	public static void main(String[] args) {
		int pl;
	System.out.println("Program Mengecek Angka Genap");
	System.out.printf("Masukkan Angka : ");
	Scanner nilai = new Scanner(System.in);
	int angka = nilai.nextInt();
	pl= angka;
angka %=2;
if(angka==0){
	System.out.print(pl );
	System.out.println(" Adalah Bilangan GENAP");
			}
else{
	System.out.print(pl );
	System.out.println(" Adalah Bilangan Ganjil");
	}
	}
}