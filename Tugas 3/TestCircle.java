class TestCircle {
	public static void main(String[] args) {
	//namaClass namaObjek = new namaKostruktor();

	circle cahya = new circle();
	circle indra = new circle(1.5);
	circle faisal = new circle(2.0, "Merah");
	System.out.println("radius = "+ cahya.getRadius()+" warna = "+ cahya.getColor()+" Area = "+cahya.getArea());
	System.out.println("radius = "+ indra.getRadius()+" warna = "+ indra.getColor() +" Area = "+indra.getArea());
	System.out.println("radius = "+ faisal.getRadius()+" warna = "+ faisal.getColor() +" Area = "+faisal.getArea());
	}
}	