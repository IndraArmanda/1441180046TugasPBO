// nama class circle.java
class circle{
	// variable radius dan color
	// radius -> double
	// color -> string

	private double radius;
	private String color;

// konstruktor untuk class circle??
	// karena nama kelas sama dengan nama funcngsi

	public circle(){

		radius = 1.0;
		color = "pink";
	}
	public circle(double r){

		radius = r;
		color = "pink";
	}

	public circle(double r, String c) {

		radius = r;
		color = c;

	}


	public double getRadius(){

		return radius;

	}

	public String getColor(){

		return color;

	}
	public double setRadius(double r){

		return radius = r;

	}

	public String setColor(String c){

		return color=c;

	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
   }