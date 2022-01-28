interface Employee{
    public void work();
    public void print_details();
}
class AdministrationStaff implements Employee{
    public void work(){}
    public void print_details(){}
}
class Helpers implements Employee{
    public void work(){}
    public void print_details(){}
}
public class Staff {
    Employee employee;
    void addStaff(AdministrationStaff newAdmin){
        this.employee=newAdmin;
    }
    void addStaff(Helpers newPeon){
        this.employee=newPeon;
    }
}
