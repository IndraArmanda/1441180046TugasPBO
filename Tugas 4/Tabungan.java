import java.util.Scanner;
class Tabungan{

	

	private int simpanan;
	private String pemilikRek;
	private int noRek;
	private static double bunga = 5.5;
	Scanner uang = new Scanner(System.in);
	public Tabungan()

	{
		simpanan 	= 15000000;
		pemilikRek 	= "Indra";
		noRek 		= 1441180046;
	}

	public Tabungan(int sim)
	{
		simpanan 	= sim;
		pemilikRek 	= "Nita";
		noRek 		= 1441180073;
	}

	public Tabungan(int sim, String pr)
	{
		simpanan 	= sim;
		pemilikRek 	= pr;
		noRek 		= 1441180047;
	}

	public Tabungan(int sim, String pr, int no)
	{
		simpanan 	= sim;
		pemilikRek 	= pr;
		noRek 		= no;
	}


	public void menabung()
	{
		System.out.print("saya Menabung Sebesar  		= Rp.");
		int nabung = uang.nextInt();
		simpanan = simpanan + nabung;
	}
	public void mengambil()
	{
		System.out.print("saya Mengambil Sebesar 		= Rp.");
		int ambil = uang.nextInt();
		simpanan = simpanan - ambil;
	}
	public void menransfer()
	{
		System.out.print("saya Menransfer Sebesar		= Rp.");
		int transfer = uang.nextInt();
		simpanan = simpanan - transfer;
	}

	int rdm = (int) (Math.random()*500000);
	public void menerima()
	{
		simpanan = simpanan + rdm;
		System.out.println("saya menerima transfer sebesar	= Rp."+rdm);
	}

	//getter

	public int getSimpanan()
	{
		return simpanan;
	}
	public String getPemilikRek()
	{
		return pemilikRek;
	}
	public int getNoRek()
	{
		return noRek;
	}
	public double getBunga()
	{
		return bunga;
	}
	//setter

	public int setSimpanan(int simpanan)
	{
		return this.simpanan = simpanan;
	}
	public void saldo()
	{
		System.out.println("Saldo saya 			= Rp."+simpanan);
	}
}