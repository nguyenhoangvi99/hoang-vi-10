package com.laptrinhjavaweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long>{

	Optional<NewEntity> findById(Long id);

}
 