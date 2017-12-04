package home.pratik.domainobjects;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Only for API usage where 
	 * default constructors are mandatory
	 */
	public Employee(){
		
	}
	
	private String id;
	private String empName;
	private String dept;
	private long salary;
	private int age;
	private Employee manager;
	private List<Employee> directReportees;
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public List<Employee> getDirectReportees() {
		return directReportees;
	}
	public void setDirectReportees(List<Employee> directReportees) {
		this.directReportees = directReportees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1 = null;
		if(!(obj instanceof Employee))
			return false;
		else {
			e1 = (Employee) obj;
			if (this.id.equals(e1.getId())) 
				return true;
		}
		return false;
	}
	
	@Override
	public Employee clone(){
		return this.clone();
	}
}
