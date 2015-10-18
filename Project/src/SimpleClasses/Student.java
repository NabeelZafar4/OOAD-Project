package SimpleClasses;

import java.util.Date;

public class Student {

	private String Name;
	private String MName;
	private String FName;
	private int rollNo;
	protected int batch;
	private Date dob;

	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public void setDOB(Date dt)
	{
		dob=dt;
	}
	public Date getDOB()
	{
		return dob;
	}
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
