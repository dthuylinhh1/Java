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
import java.time.LocalDate;
import java.util.ArrayList;

public class Instructor {
    private String firstName, lastName, street, city, postalCode, address;
    private int instructorId, age, yearsAtCollege;
    private LocalDate birthday, hiredDate;
    int index = 0;
    
    ArrayList<String> qualifiedCourse = new ArrayList<String>();
    
    
    /**
     * Constructor
     * @param firstName
     * @param lastName
     * @param instructorId
     * @param street
     * @param city
     * @param postalCode
     * @param hiredDate
     * @param birthday 
     */
    public Instructor(String firstName, String lastName,int instructorId, String street, String city, String postalCode,
            LocalDate hiredDate, LocalDate birthday){
        //validate Instructor's birthday
        if(LocalDate.now().getYear() - birthday.getYear()>100){
            throw new IllegalArgumentException("Please check the year entered, instructor cannot be over 100 years old");
        }
        
        //validate Instructor's hired date
        if(LocalDate.now().getYear()- hiredDate.getYear()>80){
            throw new IllegalArgumentException("1910-08-22 as a hire date would mean Anita started working over 80 years ago");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.instructorId = instructorId;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.hiredDate = hiredDate;
        this.birthday = birthday;
    }
    
    /**
     * Setter & Getter
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
        if(street.matches("[. 0-9 a-z A-Z_]+")){
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
     * @param instructorId 
     */
    public void setInstructorId(int instructorId){
        if(Integer.toString(instructorId).matches("[0-9_]+")){
            this.instructorId = instructorId;
        }else{
            throw new IllegalArgumentException("Please enter valid instructor ID!!!");
        }
    }
    
    public int getInstructorId(){
        return instructorId;
    }
    
    /**
     * Setter & Getter
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
     * @param hiredDate 
     */
    public void setHiredDate(LocalDate hiredDate){
        this.hiredDate = hiredDate;
    }
    
    public LocalDate getHiredDate(){
        return hiredDate;
    }
    
    /**
     * Method to 
     * @return Instructor's first name and last name
     */
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
    
    /**
     * method to calculate instructor's age
     * @return 
     */
    public int getAgeInYears(){
        if(birthday.getMonthValue() > LocalDate.now().getMonthValue()){
            return age =  LocalDate.now().getYear() - birthday.getYear() -1;
        }else{
            return age =  LocalDate.now().getYear() - birthday.getYear();
        }
    }
    
    /**
     * method to calculate years working at college
     * @return 
     */
    public int yearsAtCollege(){
        if(hiredDate.getMonthValue() >= LocalDate.now().getMonthValue()){
            return yearsAtCollege =  LocalDate.now().getYear() - hiredDate.getYear() -1;
        }else{
            return yearsAtCollege =  LocalDate.now().getYear() - hiredDate.getYear();
        }
    }
    
    /**
     * method to get address
     * @return 
     */
    public String getAddress(){
        address = getStreet() + ", " + getCity() + ", " + getPostalCode();
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
     * method to return list of subjects that instructors are certified to teach
     * @return 
     */
    public String listOfSubjectsCertifiedToTeach(){
        String availableCourse = "";
        if(index ==0){
            return "not qualified to teach courses yet.";
        }else{
            return availableCourse = qualifiedCourse.toString();
        }
    }
    /**
     * method to add subjects that instructors are able to teach
     * @param course 
     */
    public void addCourseToAbilities(String course){
        if(qualifiedCourse.toString().contains(course) == false){
            qualifiedCourse.add(course);
            index++;
        }
    }
    
    /**
     * method to check if instructor are able to teach or not
     * @param courseCanTeach
     * @return 
     */
    public boolean canTeach(String courseCanTeach){
        if(qualifiedCourse.toString().contains(courseCanTeach)){
            return true;
        }else{
            return false;
        }
    }
    
    
}
    
