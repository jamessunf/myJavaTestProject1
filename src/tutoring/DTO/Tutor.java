/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: Tutor.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.DTO;

import java.util.List;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.StudentBehaviour;



/**
 *class to transfer tutor data between different layer
 * @author feng
 */
public class Tutor extends Student {
    
    private int tutorID;
    private String status;
    private int experineceID;
    /**
     * the constructor of Tutor
     * @param builder accept MemberBuilder object
     */
    public Tutor(MemberBuilder builder){
        
        super(builder);
        this.tutorID = builder.getTutorID();
        this.experineceID = builder.getExperineceID();
        this.status = builder.getStatus();
    
    }
    /**
     * the constructor of Tutor
     * @param tutorID accept tutor id
     * @param status accept tutor status
     * @param experineceID accept tutor experinece id
     */
    	public Tutor(int tutorID, String status, int experineceID){
		this.tutorID = tutorID;
                this.status = status;
                this.experineceID = experineceID;
	}
    /**
     * 
     * the constructor of Tutor
     * @param tutorID accept tutor id
     * @param status accept tutor status
 */
	public Tutor(int tutorID, String status){
		this(tutorID, status, 0);
	}
        /**
         * 
         * the constructor of Tutor
         * @param tutorID accept tutor id
         */
        public Tutor(int tutorID){
		this(tutorID,null,0);
	}
/**
 * the default constructor of Tutor
 */
	public Tutor(){ 
		this(-1, null, 0);
	}

   

   /**
    * a getter deal with return the tutor id
    * @return integer value for tutor id
    */

    public int getTutorID() {
        return tutorID;
    }
/**
 * a getter deal with return the tutor status
 * @return String value for tutor status
 */
    public String getStatus() {
        return status;
    }
/**
 * a getter return tutor experience id
 * @return integer value for tutor experience
 */
    public int getExperineceID() {
        return experineceID;
    }
/**
 * the setter of tutor id
 * @param tutorID integer value to setting the tutor id
 */
    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }
/**
 * the setter of  status
 * @param status String value to setting the status
 */
    public void setStatus(String status) {
        this.status = status;
    }
/**
 * the setter of experience id
 * @param experineceID integer value to setting the experience id
 */
    public void setExperineceID(int experineceID) {
        this.experineceID = experineceID;
    }
    /**
     * Add a tutor course
     * @param course a object Course to add
     */
    
     public void addTCourse(Course course) {
       
	this.studentbehaviour.addCourse( new SelectCourse(this.getTutorID(),course.getCourseCode()));
    }

   /**
    * Delete a tutor course
    * @param course a object Course for delete
    */
    
    public void deleteTCourse(Course course) {
        this.studentbehaviour.deleteCourse(new SelectCourse(this.getTutorID(),course.getCourseCode()));
    }
    
   /**
    * get all select tutoring courses of the tutor
    * @return a list of courses of the tutor
    */
     public List<SelectCourse> getTSelectCourseById(){
    
        return this.studentbehaviour.getSelectCourseById(this.tutorID);
    }

   /**
    * change behaviour for the student
    * @param studentbehaviour a behaviour of the student
    */
    public void changeBehaviourTo(StudentBehaviour studentbehaviour){
      
             this.studentbehaviour = studentbehaviour;
           
    }
    
    
}
