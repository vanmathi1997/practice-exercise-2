import java.util.*;
public class Member {
    String Name;
    int Age;
    float Salary;

    Member(String name, int age, float salary)//constructor class for assigning values
    {

        Name = name;
        Age = age;
        Salary = salary;
    }
    public String DisplayMemberDetails()//displaying the MemberDetails
     {
        if(Name==null||Age==0||Salary==0)
            return null;
        else
       return Name+ Age +Salary;
    }
}

class Member_Variable{
    public String member_variable(String name, int age, float salary){
        Member member = new Member(name, age, salary);
        String result= member.DisplayMemberDetails();
        return result;

    }
}
