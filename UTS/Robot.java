class Robot
{
	int Sensor=4;
	int Servo;
	int Power;

	public int Robot()
	{
		return Sensor;
	}
}

class Asimo extends Robot 
{
	private int Sensor;
	private int Camera;

	Robot asi = new Robot();

	public Asimo(int InputSensor, int InputServo, int InputPower, int InputCamera)
	{
		Sensor 		= InputSensor;
		Servo		= InputServo;
		Power 		= InputPower;
		Camera		= InputCamera;
	}

	public void CetakSpesifikasi()
	{
		System.out.println("Jumlah Sensor Robot "+asi.Robot());
		System.out.println("Jumlah Sensor Mobil: "+Sensor);
		System.out.println("Jumlah Servo: "+Servo);
		System.out.println("Kapasitas Power: "+Power);
		System.out.println("Jumlah Kamera: "+Camera);
		System.out.println();
	}

	public void Upgrade(int sensor)
	{
		System.out.println("Asimo diupgrade dengan jumlah sensor: "+sensor);
	}
}