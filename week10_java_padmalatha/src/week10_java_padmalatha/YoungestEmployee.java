package week10_java_padmalatha;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//3. Get the youngest employee details each department wise (By Using Optional)?
public class YoungestEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = GetList.get();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(entry -> {
			Optional<Employee> emp = Optional
					.of(entry.getValue().stream().min((e, e1) -> e.getAge() > e1.getAge() ? 1 : -1).get());
			System.out.println("-------------------------------");
			System.out.println(entry.getKey());
			Employee emp1 = emp.get();
			System.out.println("---Employee Details---");
			System.out.println(emp1);
			System.out.println("-------------------------------");
		});
	}
}
