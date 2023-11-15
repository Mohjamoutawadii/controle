package moutawadii.mohjaa.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moutawadii.mohjaa.Dao.IDao;
import moutawadii.mohjaa.beans.Servicee;
import moutawadii.mohjaa.repository.ServiceRepository;
import moutawadii.mohjaa.repository.ServiceRepository;


@Service
public class Serservice implements IDao<Servicee>{

		@Autowired
		 private ServiceRepository ServiceeRep;
		
		
		@Override
		public Servicee create(Servicee o) {
			return ServiceeRep.save(o);
		}

		@Override
		public boolean delete(Servicee o) {
			try {
				ServiceeRep.delete(o);
				return true;
			}catch(Exception e) {
				return false;
			}
		}

		@Override
		public Servicee update(Servicee o) {
			return ServiceeRep.save(o);
		}

		@Override
		public Servicee findById(long id) {
			return ServiceeRep.findById((long) id).orElse(null);
		}

		@Override
		public List<Servicee> findAll() {
			return ServiceeRep.findAll();
		}
		
		
	
		
		

}
