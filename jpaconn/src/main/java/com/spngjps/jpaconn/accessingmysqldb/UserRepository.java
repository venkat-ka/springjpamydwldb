package com.spngjps.jpaconn.accessingmysqldb;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
