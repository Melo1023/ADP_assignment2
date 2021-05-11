import java.util.ArrayList;
import java.util.List;


public class ListClass {

    List<String> EmployeeNames = new ArrayList<>();

    public void add (String name){
        EmployeeNames.add(name);
        System.out.println(EmployeeNames);
    }
    public  String find (String object){
        EmployeeNames.contains(object);
        System.out.println(EmployeeNames);
        return object;
    }

    public void remove (String object){
        EmployeeNames.remove (object);
        System.out.println(EmployeeNames);
    }



}
