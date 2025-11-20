package com.springCore.AutoWire;

public class Emp {
	
	Address address;
	
    private int  empId;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", empId=" + empId + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	

}
