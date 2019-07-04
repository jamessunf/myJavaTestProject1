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
public class  Student extends Tutor {

    private int studentID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    
    
	/*
	 * This constructor accepts a PhoneBuilder which is then used
	 * to obtain the data for the fields.
	 */
	public Student(StudentBuilder builder)
	{
	    super(builder);
            studentID = builder.getStudentID();
	    firstName = builder.getFirstName();
	    lastName = builder.getLastName();
	    phoneNumber = builder.getPhoneNumber();
	    email = builder.getEmail();
	}
        
        
    
    public Student(int studentID, String firstName, String lastName, String phoneNumber, String email){
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
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
    
    @Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[")
                .append(studentID).append(" ")
		.append(firstName).append(" ")
		.append(lastName).append(" ")
		.append(phoneNumber).append(" ")
		.append(email).append(" ")                                    
                .append("]"); // .append(System.lineSeparator());
		return sb.toString() + super.toString(); 
	}


    
}
