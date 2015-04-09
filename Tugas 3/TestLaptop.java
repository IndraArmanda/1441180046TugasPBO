class TestLaptop{
public static void main(String[] args) {

		laptop lSatu = new laptop();
		laptop lDua = new laptop("toshiba","kuning");
		laptop lTiga = new laptop("hp", "hitam", "Terputus");
		laptop lEmpat = new laptop("asus", "ungu", "Terhubung", 90);
		
		System.out.println("Laptop Pertama	: Merk = "+ lSatu.getMerk() +" Warna = "+lSatu.getWarna()+"	Wifi = "+lSatu.getWifi()+" Baterai = "+lSatu.getBaterai());
		System.out.println("Laptop Kedua	: Merk = "+ lDua.getMerk() +"	 Warna = "+lDua.getWarna()+"	Wifi = "+lDua.getWifi()+" Baterai = "+lDua.getBaterai());
		System.out.println("Laptop Ketiga	: Merk = "+ lTiga.getMerk() +"	 Warna = "+lTiga.getWarna()+"	Wifi = "+lTiga.getWifi()+"  Baterai = "+lTiga.getBaterai());
		System.out.println("Laptop Keempat	: Merk = "+ lEmpat.getMerk() +"	 Warna = "+lEmpat.getWarna()+"	Wifi = "+lEmpat.getWifi()+" Baterai = "+lEmpat.getBaterai());
		
		//setter
		System.out.println("Setelah Setter");
		lSatu.setMerk("oppo"); lSatu.setWarna("hitam"); lSatu.setWifi("Terhubung"); lSatu.setBaterai(55);
		System.out.println("Laptop Pertama	: Merk = "+ lSatu.getMerk() +" Warna = "+lSatu.getWarna()+"	Wifi = "+lSatu.getWifi()+"  Baterai = "+lSatu.getBaterai());
		lEmpat.setBaterai(55);
		System.out.println("Laptop Keempat	: Merk = "+ lEmpat.getMerk() +"	 Warna = "+lEmpat.getWarna()+"	Wifi = "+lEmpat.getWifi()+" Baterai = "+lEmpat.getBaterai());
		
		}
}