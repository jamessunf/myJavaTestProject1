/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.DTO;

import java.util.List;
import tutoring.BusinessObjects.MemberBuilder;
import tutoring.BusinessObjects.StudentBehaviour;
import tutoring.BusinessObjects.StudentBuilder;


/**
 *
 * @author feng
 */
public class Tutor extends Student {
    
    private int tutorID;
    private String status;
    private int experineceID;
    
    public Tutor(MemberBuilder builder){
        
        super(builder);
        this.tutorID = builder.getTutorID();
        this.experineceID = builder.getExperineceID();
        this.status = builder.getStatus();
    
    }
    
    	public Tutor(int tutorID, String status, int experineceID){
		this.tutorID = tutorID;
                this.status = status;
                this.experineceID = experineceID;
	}

	public Tutor(int tutorID, String status){
		this(tutorID, status, 0);
	}
        public Tutor(int tutorID){
		this(tutorID,null,0);
	}

	public Tutor(){ 
		this(-1, null, 0);
	}

   

   

    public int getTutorID() {
        return tutorID;
    }

    public String getStatus() {
        return status;
    }

    public int getExperineceID() {
        return experineceID;
    }

    public void setTutorID(int tutorID) {
        this.tutorID = tutorID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExperineceID(int experineceID) {
        this.experineceID = experineceID;
    }
    /**
     * 
     * @param course 
     */
    @Override
     public void addCourse(Course course) {
       
	this.studentbehaviour.addCourse( new SelectCourse(this.getTutorID(),course.getCourseCode()));
    }

   /**
    * 
    * @param course 
    */
    @Override
    public void deleteCourse(Course course) {
        this.studentbehaviour.deleteCourse(new SelectCourse(this.getTutorID(),course.getCourseCode()));
    }

   
    public void changeBehaviourTo(StudentBehaviour studentbehaviour){
      
             this.studentbehaviour = studentbehaviour;
           
    }
    
    
}
