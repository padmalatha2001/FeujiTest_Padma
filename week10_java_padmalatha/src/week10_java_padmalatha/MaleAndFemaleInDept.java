package week10_java_padmalatha;

import java.util.List;
import java.util.stream.Collectors;

//4. Number of male and female employees are there in the sales and marketing department?
public class MaleAndFemaleInDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = GetList.get();
		employeeList.stream()
				.filter(emp -> emp.getDepartment().equals("Sales") || emp.getDepartment().equals("Marketing"))
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)))
				.entrySet().forEach(entry -> {
					System.out.println("---------------");
					System.out.println(entry.getKey());

					entry.getValue().entrySet().forEach(entry1 -> {
						System.out.println(entry1.getKey() + " Count : " + entry1.getValue().size());
						System.out.println("---------------");
					});
				});

	}

}
