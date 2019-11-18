 package restservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//

//@RestController
 
 @Component
public class AppConfiguration {

	private int cstmID;
	private String cstmName;
	private String courseName;
	
	@Autowired
	private Technologies tech;
	
	
	public Technologies getTech() {
		return tech;
	}
	public void setTech(Technologies tech) {
		this.tech = tech;
	}
	public int getCstmID() {
		return cstmID;
	}
	public void setCstmID(int cstmID) {
		this.cstmID = cstmID;
	}
	public String getCstmName() {
		return cstmName;
	}
	public void setCstmName(String cstmName) {
		this.cstmName = cstmName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void display()
	{
		System.out.println("Testing the print");
		tech.display();
	}
	
	
	
	
	
	
	
	
//@RequestMapping("/hello")
//public String hello()
//{
//	return "Hello its my first page";
//}
//	

}
