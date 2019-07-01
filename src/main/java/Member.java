import java.util.*;
public class Member {
    String Name;
    int Age;
    float Salary;

    Member(String name, int age, float salary){
        Name = name;
        Age = age;
        Salary = salary;
    }
    public void DisplayMemberDetails(){
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + Salary);
    }
}

class Member_Variable{
    public String member_variable(String name, int age, float salary){
        Member member = new Member(name, age, salary);
        member.DisplayMemberDetails();
        return "Success";

    }
}
