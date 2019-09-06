/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationsystem;

/**
 *
 * @author Linh
 */

//import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
//import java.time.LocalTime;


public class Student {
    private String firstName, lastName, street, city, postalCode, program, address;
    private int studentNumber, age;
    private LocalDate enrollmentDate, birthday;
    private boolean studentSuspend, studentPass;
    
    ArrayList<String> completedCourse = new ArrayList<String>();
    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param street
     * @param city
     * @param postalCode
     * @param program
     * @param studentNumber
     * @param enrollmentDate
     * @param birthday
     */
    
    
    public Student(String firstName, String lastName, String street, String city, String postalCode,
            String program, int studentNumber, LocalDate enrollmentDate, LocalDate birthday){
        if(LocalDate.now().getYear() - birthday.getYear()>100){
            throw new IllegalArgumentException("Please check the year entered, student cannot be over 100 years old");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.program = program;
        this.studentNumber = studentNumber;
        this.enrollmentDate = enrollmentDate;
        this.birthday = birthday;
    }
    
    /**
     * Setter & getter
     * @param firstName 
     */
    public void setFirstName(String firstName){
        if(firstName.matches("[A-Z a-z_]+")){
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException("Please enter alphabet only!!!");
        }
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * Setter & Getter
     * @param lastName 
     */
    public void setLastName(String lastName){
        if(lastName.matches("[A-Z a-z_]+")){
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException("Please enter alphabet only!!!");
        }
    }
    
    public String getLastName(){
        return lastName;
    }
    
    /**
     * Setter & Getter
     * @param street 
     */
    public void setStreet(String street){
        if(street.matches("[0-9 a-z A-Z_]+")){
            this.street= street;
        }else{
            throw new IllegalArgumentException("Please enter valid address!!!");
        }
    }
    
    public String getStreet(){
        return street;
    }
    
    /**
     * Setter & Getter
     * @param city 
     */
    public void setCity(String city){
        if(city.matches("[a-z A-Z_]+")){
            this.city = city;
        }else{
            throw new IllegalArgumentException("Please enter alphabet only!!!");
        }
    }
    
    public String getCity(){
        return city;
    }
    
    /**
     * Setter & Getter
     * @param postalCode 
     */
    public void setPostalCode(String postalCode){
        if(postalCode.matches("[0-9 a-z A-Z_]+")){
            this.postalCode = postalCode;
        }else{
            throw new IllegalArgumentException("Please enter valid postal code!!!");
        }
    }
    
    public String getPostalCode(){
        return postalCode;
    }
    
    /**
     * Setter & Getter
     * @param program 
     */
    public void setProgram(String program){
        if(program.matches("[a-z A-Z_]+")){
            this.program = program;
        }else{
            throw new IllegalArgumentException("Please enter alphabet only!!!");
        }
    }
    
    public String getProgram(){
        return program;
    }
    
    /**
     * Setter & Getter
     * @param studentNumber 
     */
    public void setStudentNumber(int studentNumber){
        if(Integer.toString(studentNumber).matches("[0-9_]+")){
            this.studentNumber = studentNumber;
        }else{
            throw new IllegalArgumentException("Please enter valid student number!!!");
        }
    }
    
    public int getStudentNumber(){
        return studentNumber;
    }
    
    /**
     *Setter & Getter
     * @param birthday
     */
    public void setBirthday(LocalDate birthday){
        if(LocalDate.now().getYear() - birthday.getYear()>100){
            throw new IllegalArgumentException("Please check the year entered, student cannot be over 100 years old");
        }else{
            this.birthday = birthday;
        }
    }
    
    public LocalDate getBirthday(){
        return birthday;
    }
    
    /**
     * Setter & Getter
     * @param enrollmentDate 
     */
    public void setEnrollmentDate(LocalDate enrollmentDate){
        this.enrollmentDate = enrollmentDate;
    }
    
    public LocalDate getEnrollmentDate(){
        return enrollmentDate;
    }
  
    /**
     * method to
     * @return student's first name, last name and student number
     */
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + ", student number: " + getStudentNumber();
    }
    
    /**
     * method to calculate student's age
     * @return 
     */
    public int getAge(){
        if(birthday.getMonthValue() > LocalDate.now().getMonthValue()){
            return age =  LocalDate.now().getYear() - birthday.getYear() -1;
        }else{
            return age =  LocalDate.now().getYear() - birthday.getYear();
        }
    }
    
    /**
     * method to get student's address
     * @return 
     */
    public String getAddress(){
        address = getStreet() + " " + getCity() + " " + getPostalCode();
        return address;
    }
    
    /**
     * method to change to new address
     * @param street
     * @param city
     * @param postalCode 
     */
    public void changeAddress(String street, String city, String postalCode){
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }
    
    
    /**
     * method to check if student is in good standing or not
    */
    public boolean inGoodStanding(){
        if(studentSuspend == true){
            return false;
        }else 
            return true;
        
    }
    /**
     * method to suspend student
     * @return 
     */
    public boolean suspendStudent(){
        return studentSuspend = true;
    }
    
    /**
     * method to get year that student was enrolled
     * @return 
     */
    public int getYearEnrolled(){
        return enrollmentDate.getYear();
    }
    
    /**
     * method to reinstate student to good standing
     * @return 
     */
    public boolean reinstateStudent(){
        return studentSuspend = false;
    }
    
    /**
     * method to add student's completed courses
     * @param course
     * @param grade 
     */
    public void addCompletedCourse(Course course, int grade){
        //validate student's grade
        if(grade < 0 || grade > 100){
            throw new IllegalArgumentException("grade must be 0-100 inclusive");
        }else{
            if(grade >=50){
                completedCourse.add(course + " grade=" + grade);
                studentPass = true;
            }else{
                if(grade >=0){
                    studentPass = false;
                }
            }
        }
        
    }
    /**
     * method to 
     * @return student's completed courses
     */
    public String getCompletedCourses(){
        return completedCourse.toString();
    }
    
    /**
     * method to check if student has completed courses or not
     * @param course
     * @return 
     */
    public boolean hasCompleted(String course){
        if(studentPass == false){
            return false;
        }else{
            return true;
        }
    }
}
