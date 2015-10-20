package SimpleClasses;

import java.sql.Date;

public class Student {
	private String name;
	private String middleName;
	private String fatherName;
	private String rollNo;
	private int batch;
	private Date dob;

	public Student(String name,String middleName,String fatherName, int batch,Date dob)
	{
		setName(name);
		setMiddleName(middleName);
		setFName(fatherName);
		//setRollNo(roll);
		setBatch(batch);
		setDOB(dob);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setMiddleName(String name)
	{
		middleName = name;
	}
	public String getMiddleName()
	{
		return middleName;
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
		return fatherName;
	}
	public void setFName(String fName) {
		fatherName = fName;
	}

	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setBatch(int batch)
	{
		this.batch = batch;
	}
	public int getBatch()
	{
		return batch;
	}
}
