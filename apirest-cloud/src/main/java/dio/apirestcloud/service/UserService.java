package dio.apirestcloud.service;

import dio.apirestcloud.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
