import com.arraylists.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jaggu","G",12));
        employeeList.add(new Employee("Diggy","D",108));
        employeeList.add(new Employee("Popu","Foo",1231));
        employeeList.add(new Employee("Sexyy","Me",1112));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Bob","B",208));//replace
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3,new Employee("Piggy","Poo",343));
        employeeList.forEach(employee -> System.out.println(employee));

    }
}