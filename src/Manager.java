//This example was curated from geekforgeeks.com @https://www.geeksforgeeks.org/composite-design-pattern/
//Leaf class

public class Manager implements Employee{
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Manager{id: " + empId + ", name: " + name + "}");
    }
}
