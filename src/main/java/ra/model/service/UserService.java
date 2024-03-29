package ra.model.service;

import ra.model.entity.Users;

public interface UserService {
    Users findByUserName(String userName);
    boolean existsByUserName(String userName);
    Users saveOrUpdate(Users user);

    Users getUsersByUserName(String userName);
}
