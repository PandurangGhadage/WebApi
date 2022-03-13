package com.pd.webapi.services;

import com.pd.webapi.entity.Employee;

public interface IEmployeeService {
	
	public void save(Employee emp);
	public void update(Employee emp);
	public void delete(Long empId);
	public Employee getEmployee(Long empId);

}
