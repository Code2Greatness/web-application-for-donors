package com.sang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.sang.model.Campagne;

@Repository
public interface CampagneRepository extends PagingAndSortingRepository<Campagne, Integer> {

	
}
