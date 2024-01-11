package week10_java_padmalatha;

import java.util.List;
import java.util.stream.Collectors;

//1.How many male and female employees are there in the organization?
public class MaleAndFemaleInOrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = GetList.get();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender)).entrySet()
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue().size()));

	}

}
