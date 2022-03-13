package com.pd.webapi.dao;

import com.pd.webapi.entity.Employee;

public interface IEmployeeDao {
	public void save(Employee emp);
	public void update(Employee emp);
	public void delete(Long empId);
	public Employee getEmployee(Long Id);

}
