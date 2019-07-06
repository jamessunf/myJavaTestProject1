/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring.BusinessObjects;

import tutoring.DTO.Tutor;

/**
 *
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

    public int getTutorID() {
        return tutorID;
    }

    public String getStatus() {
        return status;
    }

    public int getExperineceID() {
        return experineceID;
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
	/*
	 * Constructor was marked private to enforce use of create() method
	 */
	private MemberBuilder() { }

	/*
	 * Returns an instance of this PersonBuilder
	 */
	public static MemberBuilder create() { return new MemberBuilder(); }

	/*
	 * Each method accepts the data, sets the data into a field,
	 * then returns a reference to 'this' 
	 * When used it means I can chain the method calls:
	 * E.g. Person p = PersonBuilder.create().personID(1).firstName("First").lastName("Last")
	 *                              .phone("123").email("a@b.c").build();
	 */
	public MemberBuilder studentID (int studentID)     { this.studentID = studentID;   return this; }
	public MemberBuilder firstName(String firstName) { this.firstName = firstName; return this; }
	public MemberBuilder lastName (String lastName)  { this.lastName = lastName;   return this; }
	public MemberBuilder phoneNumber(String phoneNumber){ this.phoneNumber = phoneNumber;return this; }
	public MemberBuilder email    (String email)     { this.email = email;         return this; }
   
        public MemberBuilder tutorID (int tutorID) { this.tutorID = tutorID; return this;}
        public MemberBuilder status (String status){this.status = status; return this;}
        public MemberBuilder experineceID(int experineceID){this.experineceID = experineceID; return this;}

	//Uses the Person(PersonBuilder) constructor to create and initialize a Person
        public Tutor build() { 
            return new Tutor(this); 
        
        }
    
}
