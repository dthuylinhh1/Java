public class StudentRecord {
    private long studentReferenceNumber;
    private boolean scholarship;
    private int studentID;
    public static int numberRecord = 0;
    String name;

    public StudentRecord(){

    }

    public StudentRecord(int inputStudentID, long inputStudentReferenceNumber, boolean inputScholarship){
        this.studentID = inputStudentID;
        this.studentReferenceNumber = inputStudentReferenceNumber;
        this.scholarship = inputScholarship;
        numberRecord++;
    }

    public void setStudentID(int inputStudentID){
        studentID = inputStudentID;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentReferenceNumber(long inputStudentReferenceNumber){
        studentReferenceNumber = inputStudentReferenceNumber;
    }

    public long getStudentReferenceNumber(){
        return studentReferenceNumber;
    }

    public void setScholarship(boolean inputScholarship){
        scholarship = inputScholarship;
    }

    public boolean getScholarship(){
        return scholarship;
    }
}
