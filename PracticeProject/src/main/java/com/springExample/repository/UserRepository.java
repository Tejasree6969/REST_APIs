package com.springExample.repository;

import org.springframework.data.repository.CrudRepository;

import com.springExample.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord,String>{

}
