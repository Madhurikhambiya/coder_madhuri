package lab_1;

public class Employee {
	// Employee.java
	
	    private String employeeId;
	    private String name;
	    private double salary;

	    public Employee(String employeeId, String name, double salary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(String employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: " + salary;
	    }
	}

class Faculty extends Employee {
    private String department;

    public Faculty(String employeeId, String name, double salary, String department) {
        super(employeeId, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

class Staff extends Employee {
    private String jobTitle;

    public Staff(String employeeId, String name, double salary, String jobTitle) {
        super(employeeId, name, salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
    }
}

class Main {
	public static void main(String[] args) {
		Faculty facultyMember = new Faculty("F123", "Dr. John Smith", 75000, "Computer Science");
        Staff staffMember = new Staff("S456", "Jane Doe", 50000, "Administrative Assistant");
        System.out.println(facultyMember);
        System.out.println(staffMember);

		
	}
}
	
	
    








		  