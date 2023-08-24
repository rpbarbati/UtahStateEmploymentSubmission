package com.rodneybarbati.StateEmploymentSubmission.repositories;

import com.rodneybarbati.StateEmploymentSubmission.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
