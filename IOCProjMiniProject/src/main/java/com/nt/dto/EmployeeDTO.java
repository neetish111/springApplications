package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
private String eid;
private String ename;
private String eaddress;
private float ebasicpay;
private float eda;
private float epersonalallowance;
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
public float getEbasicpay() {
	return ebasicpay;
}
public void setEbasicpay(float ebasicpay) {
	this.ebasicpay = ebasicpay;
}
public float getEda() {
	return eda;
}
public void setEda(float eda) {
	this.eda = eda;
}
public float getEpersonalallowance() {
	return epersonalallowance;
}
public void setEpersonalallowance(float epersonalallowance) {
	this.epersonalallowance = epersonalallowance;
}

}
