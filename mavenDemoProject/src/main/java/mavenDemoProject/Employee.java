package mavenDemoProject;

public class Employee {
private String name;
private String empID;
private Device laptopDevice;

Employee(){
	
}

Employee(String name, Device device)
{
	System.out.println("www");
	this.name = name;
	this.laptopDevice = device;
}


public Device getDevice() {
	return laptopDevice;
} 

public void setDevice(Device device) {
	this.laptopDevice = device;
}

public String getEmpID() {
	return empID;
}

public Device getLaptopDevice() {
	return laptopDevice;
}

public void setLaptopDevice(Device laptopDevice) {
	System.out.println("in setter:setLaptopDevice");
	this.laptopDevice = laptopDevice;
}

public void setEmpID(String empID) {
	this.empID = empID;

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;

}


}

