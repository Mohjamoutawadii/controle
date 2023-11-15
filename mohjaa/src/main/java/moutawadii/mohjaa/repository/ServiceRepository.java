package moutawadii.mohjaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import moutawadii.mohjaa.beans.Servicee;


@Repository
public interface ServiceRepository extends JpaRepository<Servicee, Long> {
	
	

}
