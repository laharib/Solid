//Open-closed principle
public abstract class Faculty {
    String Faculty_id;
    String Faculty_name;
    String[] subjects;
    abstract void printProfDetails();
    abstract void creditSalary();
}
//liskov substitution
class TeachingFaculty extends Faculty{
    public void printProfDetails(){ }
    void creditSalary(){}
    void addSubject(){}
}
class Professor extends TeachingFaculty{
    private int Profsalary;
    public void setProfsalary(int salary){
        this.Profsalary=salary;
    }
    public int getProfsalary(){
        return 0;
    }
}
class ProfessorDuties extends Professor{
    //constructors,setters and getters
}
class AssociateProfessor extends TeachingFaculty{
    private int Associteprofsalary;
    public void setAssociteprofsalary(int salary){
        this.Associteprofsalary=salary;
    }
    public int getAssociteprofsalary(){
        return 0;
    }
}
class AssociateProfessorDuties extends AssociateProfessor{
    //constructors,setters and getters
}
class LabIncharge extends Faculty{
    private int Labinchargesalary;
    public void setLabinchargealary(int salary){
        this.Labinchargesalary=salary;
    }
    public int getLabinchargesalary(){
        return 0;
    }
    public void printProfDetails(){ }
    void creditSalary(){}
}
class LabInchargeDuties extends LabIncharge{
    //constructors,setters and getters
}