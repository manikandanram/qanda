package com.QandA.repository;

import com.QandA.entity.QAndAEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QAndARepository extends CrudRepository<QAndAEntity, Integer> {
}
