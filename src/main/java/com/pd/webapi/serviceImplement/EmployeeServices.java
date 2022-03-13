package com.pd.webapi.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.webapi.dao.IEmployeeDao;
import com.pd.webapi.entity.Employee;
import com.pd.webapi.services.IEmployeeService;

@Service
public class EmployeeServices implements IEmployeeService {

	@Autowired
	private IEmployeeDao iEmpDao;
	
	@Override
	public void save(Employee emp) {
		
		iEmpDao.save(emp);
		
	}

	@Override
	public void update(Employee emp) {

		iEmpDao.update(emp);
		
	}

	@Override
	public void delete(Long empId) {

		iEmpDao.delete(empId);
	}

	@Override
	public Employee getEmployee(Long empId) {
		
		return iEmpDao.getEmployee(empId);
	}

}
