package moutawadii.mohjaa.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moutawadii.mohjaa.Dao.IDao;
import moutawadii.mohjaa.beans.Employee;
import moutawadii.mohjaa.repository.EmployeeRepository;


@Service
public class EmployeeService implements IDao<Employee>{

		@Autowired
		 private EmployeeRepository EmployeeRep;
		
		
		@Override
		public Employee create(Employee o) {
			return EmployeeRep.save(o);
		}

		@Override
		public boolean delete(Employee o) {
			try {
				EmployeeRep.delete(o);
				return true;
			}catch(Exception e) {
				return false;
			}
		}

		@Override
		public Employee update(Employee o) {
			return EmployeeRep.save(o);
		}

		@Override
		public Employee findById(long id) {
			return EmployeeRep.findById((long) id).orElse(null);
		}

		@Override
		public List<Employee> findAll() {
			return EmployeeRep.findAll();
		}
		
		public List<Employee> getByService(long id){
			return EmployeeRep.getByService(id);
		}
		
		

}
