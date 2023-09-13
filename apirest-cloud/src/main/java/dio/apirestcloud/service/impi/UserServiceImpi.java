package dio.apirestcloud.service.impi;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.apirestcloud.domain.model.User;
import dio.apirestcloud.domain.repository.UserRepository;
import dio.apirestcloud.service.UserService;

@Service
public class UserServiceImpi implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
