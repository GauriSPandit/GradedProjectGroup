package com.greatlearning.gradedProject3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return ("<h1> Employee Management</h1>"
				+ "<table>"
				+ "  <tr>"
				+ "    <th>API</th>"
				+ "<th>____________________</th>"
				+ "    <th>URL</th>"
				+ "<th>____________________</th>"
				+ "<th>Authorization Role</th>"
				+ "  </tr>"
				+ "  <tr>"
				+ "    <td>Add Roles</td>"
				+ "    <td>____________________</td>"
				+ "    <td>http://localhost:8080/roleManagement/addRole</td>"
				+ "	   <td>____________________</td>"
				+ "		<td></td>"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>View All Roles</td>"
				+ "    <td>____________________</td>"
				+ "    <td>http://localhost:8080/roleManagement/allRoles</td>"
				+ "  </tr>"
				+ "  <tr>\r\n"
				+ "    <td>View All Employees</td>"
				+ "    <td>____________________</td>"
				+ "    <td>http://localhost:8080/employeeManagement/allEmployees</td>"
				+ "  </tr>"
				+ "  <tr>\r\n"
				+ "    <td>Get Employee By Id</td>"
				+ "    <td>____________________</td>"
				+ "    <td>http://localhost:8080/employeeManagement/getEmployeeById</td>"
				+ "  </tr>"
				+ "  <tr>\r\n"
				+ "    <td>Add an Employee</td>"
				+ "    <td>____________________</td>"
				+ "    <td>http://localhost:8080/employeeManagement/addEmployee</td>"
				+ "  </tr>"
			
				+ "</table>");
	}
	

}
