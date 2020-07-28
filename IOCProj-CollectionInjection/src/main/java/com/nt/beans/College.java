package com.nt.beans;

import java.util.Date;
import java.util.List;

public class College {
private List<String> studName;
private List<Date> dateList;
public void setStudName(List<String> studName) {
	this.studName = studName;
}
public void setDateList(List<Date> dateList) {
	this.dateList = dateList;
}
@Override
public String toString() {
	return "College [studName=" + studName + ", dateList=" + dateList + "]";
}

}
