package week10_java_padmalatha;

import java.util.List;
import java.util.stream.Collectors;

//2.Get the names of all employees who have joined after 2015?
public class EmpJoinedAfter2015 {

	public static void main(String[] args) {
		List<Employee> employeeList = GetList.get();
		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).collect(Collectors.toList()).stream()
				.forEach(emp -> System.out.println(emp.getName()));
	}
}
