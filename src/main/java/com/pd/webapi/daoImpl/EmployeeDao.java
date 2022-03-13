package com.pd.webapi.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pd.webapi.dao.IEmployeeDao;
import com.pd.webapi.entity.Employee;

@Repository
public class EmployeeDao implements IEmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.jdbcTemplate = template; 
	}
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		 String sql="insert into Employee (empId,name) values("+emp.getEmpId()+",'"+emp.getName()+"')";    
		    int i=jdbcTemplate.update(sql);    
		System.out.println(emp);
		
	}

	@Override
	public void update(Employee emp) {

		 String sql="update Employee set name='"+emp.getName()+"' where id="+emp.getEmpId()+"";    
		    int i=jdbcTemplate.update(sql);    
		
	}

	@Override
	public void delete(Long empId) {
		// TODO Auto-generated method stub
		 String sql="delete from Emp99 where id="+empId+"";    
		    int i=jdbcTemplate.update(sql); 
	}

	@Override
	public Employee getEmployee(Long Id) {
		// TODO Auto-generated method stub
		String sql="select * from Employee where id=?";    
	    return jdbcTemplate.queryForObject(sql, new Object[]{Id},new BeanPropertyRowMapper<Employee>(Employee.class)); 
		
	}

}
