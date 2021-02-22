//This example was curated from geekforgeeks.com @https://www.geeksforgeeks.org/composite-design-pattern/
//Leaf class

public class Developer implements Employee{
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Developer{id: " + empId + ", name: " + name + "}");
    }
}
