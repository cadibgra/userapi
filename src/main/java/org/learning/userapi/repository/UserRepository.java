package org.learning.userapi.repository;

import org.learning.userapi.model.UserRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserRecord, Long> {
    List<UserRecord> findByLastName(final String lastName);

    UserRecord findById(long id);
}
