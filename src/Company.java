//This example was curated from geekforgeeks.com @https://www.geeksforgeeks.org/composite-design-pattern/
//Client Class

public class Company {
    public static void main (String[] args)
    {
        // Hire developers
        Developer dev1 = new Developer(100, "Esi Coleman", "Senior Software Engineer");
        Developer dev2 = new Developer(101, "Kwabena Antwi", "Junior Software Engineer");

        // Register the hired developers
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        // Hire managers
        Manager man1 = new Manager(200, "Wanda Vision", "Finance Personnel");
        Manager man2 = new Manager(201, "Kofi Ghana", "Finance Manager");

        // Register managers
        CompanyDirectory adminDirectory = new CompanyDirectory();
        adminDirectory.addEmployee(man1);
        adminDirectory.addEmployee(man2);

        // Directory for the entire organisation
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(adminDirectory);

        // Print organisation structure
        companyDirectory.showEmployeeDetails();
    }
}
