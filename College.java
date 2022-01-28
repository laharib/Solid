//Single Responsibility
class Student{
    String student_name;
    String student_id;
    String department,year;
}
class PrintStudentDetails{
    public void printalldetails(){
        //code for printing required details
    }
    public void printStudentname(){}
    public void printStudentid(){}
    public void printstudentyear_dept(){}
}
class AddStudent{
    public void addStudent(){
        //code to add students in the college
    }
}
class CalculateStudentMarks{
    public int calculatemarks(){
        //code for calculating students' marks
        return 0;
    }
}

class StudentFeesDue{
    private int feesdue;
    public String getfeesdues(){
        return "null";
    }
    public void setFeesdue(int totalfeespaid,int feesdue){
        //calculate feedues and set them to variable
    }
}

class StudentFeesPaid{
    public String getfeespaid(){
        return "null";
    }
    public void setFeespaid(int feespaid){
        //calculate fees paid and set them to variable
    }
}
public class College {
    public static void main(String[] args){

    }
}
