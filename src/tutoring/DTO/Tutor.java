/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.DTO;

import tutoring.BusinessObjects.StudentBuilder;

/**
 *
 * @author feng
 */
public class Tutor {
    
    private int tutorID;
    private String status;
    private int experineceID;
    
    public Tutor(StudentBuilder builder){
        
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
		this(tutorID, null, 0);
	}
        public Tutor(int tutorID){
		this(tutorID, null);
	}

	public Tutor(){ 
		this(0, null, 0);
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
    
         @Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[")
                .append(tutorID).append(" ")
		.append(status).append(" ")
		.append(experineceID).append(" ")		                                   
                .append("]"); // .append(System.lineSeparator());
		return sb.toString() ;
	}
 
    
    
}
