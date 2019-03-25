package ru.kogut.service;

import ru.kogut.mapper.UserRepository;
import ru.kogut.model.User;

import java.io.IOException;
import java.util.List;

/**
 * @author S.Kogut on 2019-03-25
 */
public class UserService extends AbstractService {

    private final UserRepository userRepository;

    public UserService() throws IOException {
        userRepository = sqlSession.getMapper(UserRepository.class);
    }

    public void create(User user) {
        userRepository.create(user);
        sqlSession.commit();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findOne(String id) {
        return userRepository.findOne(id);
    }

    public void update(User user) {
        userRepository.update(user);
        sqlSession.commit();
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
        sqlSession.commit();
    }

    public void delete(User user) {
        userRepository.delete(user);
        sqlSession.commit();
    }
}
