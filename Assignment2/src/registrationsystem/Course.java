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
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.time.LocalTime;


public class Course {
    private String courseNumber, courseName, classroom, prerequisiteSubject;
    private Instructor instructor;
    private int classSize;
    private DayOfWeek classDay;
    private LocalTime classTime;
   
    
    ArrayList<Student> classList = new ArrayList<Student>();
    
    /**
     * Constructor 1 without prerequisiteSubject
     * @param instructor
     * @param courseNumber
     * @param courseName
     * @param classroom
     * @param classDay
     * @param classTime
     * @param classSize 
     */
    public Course(Instructor instructor, String courseNumber, String courseName, String classroom,
            DayOfWeek classDay, LocalTime classTime, int classSize){
        //Validate classTime
        if(LocalTime.parse("08:00").isAfter(classTime) || 
                LocalTime.parse("18:00").isBefore(classTime)){
            throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
        }
        //Check if instructor is available to teach
        if(instructor.canTeach(courseNumber)==false){
            throw new IllegalArgumentException("Professor " + instructor + " is not qualified to teach " +
                    courseNumber);
        }
        this.instructor = instructor;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.classroom = classroom;
        this.classDay = classDay;
        this.classTime = classTime;
        this.classSize = classSize;
    }
    
    /**
     * Constructor with prerequisiteSubject
     * @param instructor
     * @param courseNumber
     * @param courseName
     * @param classroom
     * @param classDay
     * @param classTime
     * @param classSize
     * @param prerequisiteSubject 
     */
    public Course(Instructor instructor, String courseNumber, String courseName, String classroom,
            DayOfWeek classDay, LocalTime classTime, int classSize, String prerequisiteSubject){
        //validate classtime
        if(LocalTime.parse("08:00").isAfter(classTime) || 
                LocalTime.parse("18:00").isBefore(classTime)){
            throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
        }
        //Check if instructor is available to teach
        if(instructor.canTeach(courseNumber)==false){
            throw new IllegalArgumentException("Professor " + instructor + " is not qualified to teach " +
                    courseNumber);
        }
        this.instructor = instructor;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.classroom = classroom;
        this.classDay = classDay;
        this.classTime = classTime;
        this.classSize = classSize;
        this.prerequisiteSubject = prerequisiteSubject;
    }
    
    /**
     * Setter & Getter
     * @param courseNumber 
     */
    public void setCourseNumber(String courseNumber){
        if(courseNumber.matches("[0-9 A-Z a-z_]+")){
            this.courseNumber = courseNumber;
        }else{
            throw new IllegalArgumentException("Please enter valid course number!");
        }
    }
    
    public String getCourseNumber(){
        return courseNumber;
    }
    
    /**
     * Setter & Getter
     * @param courseName 
     */
    public void setCourseName(String courseName){
        if(courseName.matches("[- A-Z a-z 0-9_]+")){
            this.courseName = courseName;
        }else{
            throw new IllegalArgumentException("Please enter valid course name!");
        }
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    /**
     * Setter & Getter
     * @param classroom 
     */
    public void setClassRoom(String classroom){
        if(classroom.matches("[a-z A-Z 0-9_]+")){
            this.classroom = classroom;
        }else{
            throw new IllegalArgumentException("Please enter valid class room!");
        }
    }
    
    public String getRoom(){
        return classroom;
    }
    
    /**
     * Setter & Getter
     * @param instructor 
     */
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    
    public Instructor getInstructor(){
        return instructor;
    } 
    
    /**
     * Setter & Getter
     * @param classSize 
     */
    public void setClassRoomSize(int classSize){
        if(Integer.toString(classSize).matches("[0-9_]+")&& classSize <=40){
            this.classSize = classSize;
        }else{
            classSize = 40;
        }
    }
    
    public String setClassSize(int classSize){
        if(classSize <=40){
            return "";
        }else{
            setClassRoomSize(40);
            return "Max class size = 40, it has been set to 40";
        }
    }
    
    public int getClassSize(){
        return classSize;
    }
    
    /**
     * Setter & Getter
     * @param classDay 
     */
    public void setClassDay(DayOfWeek classDay){
        this.classDay = classDay;
    }
    
    public DayOfWeek getClassDay(){
        return classDay;
    }
    
    /**
     * Setter & Getter
     * @param classTime 
     */
    public void setClassTime(LocalTime classTime){
        if(LocalTime.parse("08:00").isBefore(classTime) || 
                LocalTime.parse("18:00").isAfter(classTime)){
            this.classTime = classTime;
        }else{
            throw new IllegalArgumentException("Course start time must be between 08:00-18:00");
        }
        
    }
    
    public LocalTime getClassTime(){
        return classTime;
    }
    
    /**
     * Setter & Getter
     * @param prerequisiteSubject 
     */
    public void setPrerequisiteSubject(String prerequisiteSubject){
        this.prerequisiteSubject = prerequisiteSubject;
    }
    
    public String getPrerequisite(){
        return prerequisiteSubject;
    }
    
    /**
     * 
     * @return courseNumber and courseName
     */
    @Override
    public String toString(){
        return getCourseNumber() + "-" + getCourseName();
    }
    
    /**
     * 
     * @return course day & time
     */
    public String getCourseDayAndTime(){
        return getClassDay() + "'s, starting at "+ getClassTime();
    }
    
    /**
     * Method to add student to the class list
     * @param student
     * @return 
     */
    public String addStudent(Student student){
        //Check if student whether in good standing or not
        if(student.inGoodStanding()==false){
            return "The Student is not in good standing and cannot join the course.";    
        }    
        //Check if class whether full or not
        if(getClassSize()<= classList.size()){
            return "Student was not added because the course is full";        
        }
        
        //Check if there is a prerequisite subject ot not
        //If there is, check if student has completed it or not
        if(getPrerequisite()==null){
            classList.add(student);
        }else{
            if(student.getCompletedCourses().contains(prerequisiteSubject)==false){
                return "Student has not completed the prerequisite course: COMP1008";
            }else{
                classList.add(student);
            }
        }
        
        
        return "";
    }
    
    /**
     * Method to 
     * @return a class list
     */
    public String showClassList(){
        String studentList = "";
        studentList = classList.toString().substring(1,classList.toString().length()-1);
        return studentList;
    }
    
    /**
     * Method to
     * @return average age of student in a class
     */
    public int averageAge(){
        int ageStu=0;
        int averageAge;
        ArrayList<Integer> studentAge = new ArrayList<Integer>();
        for(Student i:classList){
            studentAge.add(i.getAge());
        }
        for(int i = 0; i<studentAge.size(); i++){
            ageStu = ageStu + studentAge.get(i);
        }
        averageAge = ageStu / studentAge.size();
        return averageAge;
    }
    
    /**
     * method to check if that class is mature or not
     * @return true or false
     */
    public boolean matureClass(){
        if(averageAge() < 25){
            return false;
        }else{
            return true;
        }
    }
    
}
