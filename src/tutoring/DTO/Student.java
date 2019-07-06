/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: Student.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.DTO;

import java.util.ArrayList;
import java.util.List;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.StudentBehaviour;
import tutoring.BusinessObjects.StudentCourseBehaviour;
import tutoring.BusinessObjects.TutorCourseBehaviour;

/**
 *class to transfer student data between different layer
 * @author feng
 */
public class  Student  {

    private int studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    StudentBehaviour studentbehaviour;
    
	
    /**
     * This constructor accepts a MemberBuilder which is then used
     * @param builder to obtain the data for the fields.
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
        
        /**
         * This constructor accepts some properties of student
         * @param studentID student id of student
         * @param firstName  first name of student
         * @param lastName last name of student
         * @param phoneNumber phone number of student
         * @param email email of student
         */
    
    public Student(int studentID, String firstName, String lastName, String phoneNumber, String email){
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
                
                this.studentbehaviour = StudentCourseBehaviour.getInstance();
                
	}
 /**
         * This constructor accepts some properties of student
         * @param studentID student id of student
         * @param firstName  first name of student
         * @param lastName last name of student
         * @param phoneNumber phone number of student 
 */
	public Student(int studentID, String firstName, String lastName, String phoneNumber){ 
		this(studentID, firstName, lastName, phoneNumber, null);
	}
 /**
         * This constructor accepts some properties of student
         * @param studentID student id of student
         * @param firstName  first name of student
         * @param lastName last name of student
        
 */
	public Student(int studentID, String firstName, String lastName){
		this(studentID, firstName, lastName, null, null);
	}
/**
  /**
         * This constructor accepts some properties of student
         * @param studentID student id of student
         * @param firstName  first name of student
    
 */
	public Student(int studentID, String firstName){
		this(studentID, firstName, null, null, null);
	}
 /**
         * This constructor accepts some properties of student
         * @param studentID student id of student
         
 */
	public Student(int studentID){
		this(studentID, null, null, null, null);
	}
/**
 * This default constructor chain with others
 */
	public Student(){ 
		this(0, null, null, null, null);
               
	}
/**
 * the getter to return the student id
 * @return student id
 */
    public int getStudentID() {
        return studentID;
    }
/**
 * the getter to return the student last name
 * @return  student last name
 */
    public String getLastName() {
        return lastName;
    }
/**
 * the getter to return the student first name
 * @return student first name
 */
    public String getFirstName() {
        return firstName;
    }
/**
 * the getter to return the student email
 * @return student email
 */
    public String getEmail() {
        return email;
    }
/**
 * the getter to return the student phone number
 * @return student phone number
 */
    public String getPhoneNumber() {
        return phoneNumber;
    }
/**
 * the setter to accept student id
 * @param studentID student id
 */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
/**
 * the setter to accept student last name
 * @param lastName student last name
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * the setter to accept student first name
 * @param firstName student first name
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * the setter to accept student email
 * @param email student email
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * the setter to accept student phone number
 * @param phoneNumber student phone number
 */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
   /**
    * add a course to the student
    * @param course Course object for add
    */
    
    public void addCourse(Course course) {
       
	this.studentbehaviour.addCourse( new SelectCourse(this.studentID,course.getCourseCode()));
    }

   /**
    * delete a course for the student
    * @param course Course object for delete
    */
    public void deleteCourse(Course course) {
        this.studentbehaviour.deleteCourse(new SelectCourse(this.studentID,course.getCourseCode()));
    }
    /**
     * get back all courses that the student has already added.
     * @return List for the courses that the student has already added
     */
    public List<SelectCourse> getSelectCourseById(){
    
        return this.studentbehaviour.getSelectCourseById(this.studentID);
    }
/**
 * get the student current behavior type
 * @return student behavior type
 */
    public String StudentBehaviourType() {
        return this.studentbehaviour.StudentBehaviourType();
       //return null;
    }

   
    
   
    
    
    
}
