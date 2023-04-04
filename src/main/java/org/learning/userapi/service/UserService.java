package org.learning.userapi.service;

import org.learning.userapi.model.UserRecord;
import org.learning.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserRecord> getAllUsers() {
        List<UserRecord> allUserRecords = new ArrayList<>();
        userRepository.findAll().forEach(allUserRecords::add);
        return allUserRecords;
    }

    public UserRecord createUser(UserRecord userRecord) {
        return userRepository.save(userRecord);
    }
}
