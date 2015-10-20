package test;

import java.text.ParseException;
import Controller.StudentController;
import SimpleClasses.Student;
import sql.MySqlJdbc;

public class AddStudent {
	public static void main(String[] args) throws ParseException
	{
		MySqlJdbc  s= new MySqlJdbc();
		if(s.isDatabaseConnected())
			System.out.println("Connected");
		else
			System.out.println("Not Connected");
		
		
		try
		{
			// for demo taking it from system
			java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
			
			// View 
			StudentController.AddStudent(new Student("Arslan","","Shafiq",2,date));
			
		}
		catch(Exception e)
		{
			System.out.println("Error is : "+e.getMessage());
		}
	}
	
}