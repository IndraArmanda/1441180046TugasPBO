class laptop{
	// instance variable
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public laptop(){
		merk = "toshiba";
		warna ="hitam";
		wifi ="terhubung";
		baterai =50;
	}

	public laptop(String merkInput, String warnaInput)
	{
		merk =merkInput;
		warna =warnaInput;
		wifi ="terhubung";
		baterai =50;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput)
	{
		merk = merkInput;
		warna =warnaInput;
		wifi =wifiInput;
		baterai =50;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk = merkInput;
		warna =warnaInput;
		wifi =wifiInput;
		baterai =bateraiInput;
	}

	public void menyala()
	{
		System.out.println("Welcame to laptop");
	}

	public void mati(){

		System.out.println("thankyou have a nice day");
	}

	public void indikatorBaterai(){

		System.out.println("baterai tinggal : " + baterai + "%");
	}

	public void indikatorwifi(){

		System.out.println("wifi  : " + wifi);

	}

	// getter
	public String getMerk()
	{
		return merk;
	}
	public String getWarna()
	{
		return warna;
	}
	public String getWifi()
	{
		return wifi;
	}
	public int getBaterai()
	{
		return baterai;
	}

	//setter 
	public String setMerk(String merk)
	{
		return this.merk = merk;
	}
	public String setWarna(String warna)
	{
		return this.warna = warna;
	}
	public String setWifi(String wifi)
	{
		return this.wifi = wifi;
	}
	public int setBaterai(int baterai)
	{
		return this.baterai = baterai;
	}

}