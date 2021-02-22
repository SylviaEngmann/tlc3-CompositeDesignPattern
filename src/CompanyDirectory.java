//This example was curated from geekforgeeks.com @https://www.geeksforgeeks.org/composite-design-pattern/
//Composite class

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee
{
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("===");
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
        System.out.println();
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}
