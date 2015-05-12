import java.util.Scanner;
class TestTabungan{
	
public static void main(String[] args) {

		Tabungan pertama = new Tabungan();
		Tabungan kedua = new Tabungan(4000000);
		
		
		Scanner uang = new Scanner(System.in);
		System.out.println("Pemilik Rekening Pertama	= "+ pertama.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+pertama.getSimpanan()+"");
		System.out.println("Nomor Rekening			= "+pertama.getNoRek());
		System.out.println("Bunga 				= "+pertama.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.print("Masukkan Pilihan = ");
		int p = uang.nextInt();
    	switch (p) 
    	{
    	case 1 :
			pertama.menabung();
			pertama.saldo();
        break;
        case 2 :
			pertama.mengambil();
			pertama.saldo();
		break;
		case 3 :
			pertama.menransfer();
			pertama.saldo();
		break;
		case 4 :
			pertama.menerima();
			pertama.saldo();
		break;
		default:
			System.out.println("Error");
			break;

		}
		System.out.println();
		System.out.println("Pemilik Rekening Kedua		= "+ kedua.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+kedua.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+kedua.getNoRek());
		System.out.println("Bunga 				= "+kedua.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.print("Masukkan Pilihan = ");
		int kd = uang.nextInt();
    	switch (kd) 
    	{
    	case 1 :
		kedua.menabung();
		kedua.saldo();
		break;
		case 2 :
		kedua.mengambil();
		kedua.saldo();
		break;
		case 3 :
		kedua.saldo();
		kedua.menransfer();
		break;
		case 4 :
		kedua.menerima();
		kedua.saldo();
		break;
		default:
			System.out.println("Error");
			break;
		}

	}
	
}
