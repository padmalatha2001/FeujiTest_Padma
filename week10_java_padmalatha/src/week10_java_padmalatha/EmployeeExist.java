package week10_java_padmalatha;

import java.util.*;
//6.Write a program and check whether employee existing or not by passing employee name using JUNIT?
//In my system junit jar is not there so I am unable to do this using junit
public class EmployeeExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        
        List<Employee> employeeList = GetList.get();
        Optional<Employee> employee=employeeList.stream().filter(emp->emp.getName().equals("AKhila")).findAny();
	    
	    if(employee.get()!=null)
         {
	    	System.out.println(employee);
         }
	    else
	    {
	    	System.out.println("No Employee exist with that name");
	    }
	}

}
