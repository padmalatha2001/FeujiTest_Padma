package week10_java_padmalatha;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//5. List down the names of all employees in each department?
public class EmpInDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = GetList.get();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
		.forEach(entry->{
			System.out.println(entry.getKey()+":");
			System.out.println("-----------------");
			entry.getValue().stream().forEach(emp->{
				System.out.println(emp.getName());
			});
			System.out.println("-----------------");
		});
	}

}
