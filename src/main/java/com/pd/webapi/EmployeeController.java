package com.pd.webapi;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pd.webapi.entity.Employee;
import com.pd.webapi.services.IEmployeeService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	private IEmployeeService iEmpSer;
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String save(@RequestBody Employee employee) {
		
		iEmpSer.save(employee);
		return "Data saved succesfully";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public String update(@RequestBody Employee employee) {
		
		iEmpSer.update(employee);
		return "Data Updated Succesfully";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.DELETE)
	public String delete(@PathVariable Long id) {
		iEmpSer.delete(id);
		
		return "Data deleted succesfully";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee get(@PathVariable Long id) {
		
		
		return iEmpSer.getEmployee(id);
	}
	
}
