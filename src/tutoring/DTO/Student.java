/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.DTO;

import java.util.ArrayList;
import java.util.List;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.StudentBehaviour;
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.BusinessObjects.TutorCourseBehaviour;

/**
 *
 * @author feng
 */
public class  Student  {

    private int studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    StudentBehaviour studentbehaviour;
    
	/*
	 * This constructor accepts a PhoneBuilder which is then used
	 * to obtain the data for the fields.
	 */
	public Student(MemberBuilder builder)
	{
	   
            studentID = builder.getStudentID();
	    firstName = builder.getFirstName();
	    lastName = builder.getLastName();
	    phoneNumber = builder.getPhoneNumber();
	    email = builder.getEmail();
            
            this.studentbehaviour = StudentCourseBehaviour.getInstance();
	}
        
        
    
    public Student(int studentID, String firstName, String lastName, String phoneNumber, String email){
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
                
                this.studentbehaviour = StudentCourseBehaviour.getInstance();
                
	}

	public Student(int studentID, String firstName, String lastName, String phoneNumber){ 
		this(studentID, firstName, lastName, phoneNumber, null);
	}

	public Student(int studentID, String firstName, String lastName){
		this(studentID, firstName, lastName, null, null);
	}

	public Student(int studentID, String firstName){
		this(studentID, firstName, null, null, null);
	}

	public Student(int studentID){
		this(studentID, null, null, null, null);
	}

	public Student(){ 
		this(0, null, null, null, null);
               
	}

    public int getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
   
    
    public void addCourse(Course course) {
       
	this.studentbehaviour.addCourse( new SelectCourse(this.studentID,course.getCourseCode()));
    }

   
    public void deleteCourse(Course course) {
        this.studentbehaviour.deleteCourse(new SelectCourse(this.studentID,course.getCourseCode()));
    }
    
    public List<SelectCourse> getSelectCourseById(){
    
        return this.studentbehaviour.StudentBehaviourType(this.getStudentID());
    }

    public String StudentBehaviourType() {
        return this.studentbehaviour.StudentBehaviourType();
       //return null;
    }
    
   
    
    
    
}
