package bcas.edu;

public class Vehicle {
	
	private String vehicleNumber;
	private String modelName;
	private String colour;
	private Double capacity;
	private Integer manufacturingYear;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Double getCapacity() {
		return capacity;
	}
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}
	public Integer getManufacturingYear() {
		return manufacturingYear;
	}
	public void setManufacturingYear(Integer manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [vehicleNumber=");
		builder.append(vehicleNumber);
		builder.append(", modelName=");
		builder.append(modelName);
		builder.append(", colour=");
		builder.append(colour);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append(", manufacturingYear=");
		builder.append(manufacturingYear);
		builder.append("]");
		return builder.toString();
	}
	
}
