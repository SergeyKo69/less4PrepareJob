package ru.kogut.service;

import ru.kogut.mapper.RoleRepository;
import ru.kogut.model.Role;

import java.io.IOException;
import java.util.List;

/**
 * @author S.Kogut on 2019-03-25
 */
public class RoleService extends AbstractService{

    private final RoleRepository roleRepository;

    public RoleService() throws IOException {
        roleRepository = sqlSession.getMapper(RoleRepository.class);
    }


    public void create(Role role) {
        roleRepository.create(role);
        sqlSession.commit();
    }

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role findOne(String id) {
        return roleRepository.findOne(id);
    }

    public void update(Role role) {
        roleRepository.update(role);
        sqlSession.commit();
    }

    public void deleteById(String id) {
        roleRepository.deleteById(id);
        sqlSession.commit();
    }

    public void delete(Role role) {
        roleRepository.delete(role);
        sqlSession.commit();
    }
}
