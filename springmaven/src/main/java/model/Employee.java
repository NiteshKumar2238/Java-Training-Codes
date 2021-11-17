package model;

public class Employee {
	private String name;
	private String id;
	private Device laptopDevice;
	
	Employee(){
		
	}
	
	Employee(String ename,Device device){
		name=ename;
		this.laptopDevice=device;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Device getDevice() {
		return laptopDevice;
	}

	public void setDevice(Device device) {
		this.laptopDevice = device;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Emp name"+name);
	}
	

}
