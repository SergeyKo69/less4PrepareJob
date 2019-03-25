package ru.kogut.service;

import ru.kogut.mapper.UserRoleRepository;
import ru.kogut.model.User;
import ru.kogut.model.UserRole;

import java.io.IOException;
import java.util.List;

/**
 * @author S.Kogut on 2019-03-25
 */
public class UserRoleService extends AbstractService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleService() throws IOException {
        userRoleRepository = sqlSession.getMapper(UserRoleRepository.class);
    }

    public void create(UserRole userRole) {
        userRoleRepository.create(userRole);
        sqlSession.commit();
    }

    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    public UserRole findOne(String id) {
        return userRoleRepository.findOne(id);
    }

    public List<UserRole> findByUserId(String userId) {
        return userRoleRepository.findByUserId(userId);
    }

    public List<UserRole> findByRoleId(String roleId) {
        return userRoleRepository.findByRoleId(roleId);
    }

    public List<UserRole> findByUser(User user) {
        return userRoleRepository.findByUser(user);
    }

    public void update(UserRole userRole) {
        userRoleRepository.update(userRole);
        sqlSession.commit();
    }

    public void deleteById(String id) {
        userRoleRepository.deleteById(id);
        sqlSession.commit();
    }

    public void delete(UserRole userRole) {
        userRoleRepository.delete(userRole);
        sqlSession.commit();
    }
}
