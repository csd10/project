package bcas.edu;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setVehicleNumber("NPJS2345");
		v1.setModelName("HONDA");
		v1.setColour("Red");
		v1.setCapacity(200.0);
		v1.setManufacturingYear(2014);
		
		System.out.println(v1.toString());
	}

}
