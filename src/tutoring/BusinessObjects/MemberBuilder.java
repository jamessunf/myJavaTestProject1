/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Project 1
 * Project Purpose: Part of Tutoring book system, using three patterns
 * 
 * File Name: MemberBuilder.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: Jul/7/2019
 */
package tutoring.BusinessObjects;

import tutoring.DTO.Tutor;

/**
 *class to deal with create student and tutor
 * @author feng
 */
public class MemberBuilder {
    
    private int studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    
    private int tutorID;
    private String status;
    private int experineceID;

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
	/*
         * 
	 * Constructor was marked private to enforce use of create() method
	 */
	private MemberBuilder() { }

	
        /**
         * Returns an instance of this PersonBuilder
         * @return an instance of this PersonBuilder
         */
	public static MemberBuilder create() { return new MemberBuilder(); }

	/*
	 * Each method accepts the data, sets the data into a field,
	 * then returns a reference to 'this' 
	 * When used it means I can chain the method calls:
	 * E.g. Person p = PersonBuilder.create().personID(1).firstName("First").lastName("Last")
	 *                              .phone("123").email("a@b.c").build();
	 */
        /**
         * accepts the student id, sets the student id into a field,
         * @param studentID  the student id
         * @return a reference to 'this' 
         */
	public MemberBuilder studentID (int studentID)     { this.studentID = studentID;   return this; }
        /**
         * accepts the student first name, sets the student first name into a field,
         * @param firstName the student first name
         * @return a reference to 'this' 
         */
	public MemberBuilder firstName(String firstName) { this.firstName = firstName; return this; }
        /**
         * accepts the student last name, sets the student last name into a field,
         * @param lastName the student last name
         * @return a reference to 'this' 
         */
	public MemberBuilder lastName (String lastName)  { this.lastName = lastName;   return this; }
        /**
         * accepts the student phone number, sets the student phone number into a field,
         * @param phoneNumber the student phone number
         * @return a reference to 'this' 
         */
	public MemberBuilder phoneNumber(String phoneNumber){ this.phoneNumber = phoneNumber;return this; }
        /**
         * accepts the student email, sets the student email into a field,
         * @param email the student email
         * @return a reference to 'this' 
         */
	public MemberBuilder email    (String email)     { this.email = email;         return this; }
        /**
         * accepts the  tutor id, sets the  tutor id into a field,
         * @param tutorID the tutor id
         * @return a reference to 'this' 
         */
   
        public MemberBuilder tutorID (int tutorID) { this.tutorID = tutorID; return this;}
        /**
         * accepts the tutor status, sets the tutor status into a field,
         * @param status the tutor status
         * @return a reference to 'this' 
         */
        public MemberBuilder status (String status){this.status = status; return this;}
        /**
         * 
         * @param experineceID the tutor experience
         * @return a reference to 'this' 
         */
        public MemberBuilder experineceID(int experineceID){this.experineceID = experineceID; return this;}

	//Uses the Person(PersonBuilder) constructor to create and initialize a Person
        /**
         * Uses the Student(MemberBuilder) constructor to create and initialize a Student or Tutor
         * @return a tutor
         */
        public Tutor build() { 
            return new Tutor(this); 
        
        }
    
}
