package ru.kogut.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.kogut.model.Role;

import java.util.List;

/**
 * @author S.Kogut on 2019-03-24
 */
public interface RoleRepository {

    @Insert("INSERT INTO `Role`(`id`,`name`) values (#{id}, #{name})")
    void create(Role role);

    @Select("SELECT * FROM `Role`")
    List<Role> findAll();

    @Select("SELECT * FROM `Role` WHERE `id` = #{id}")
    Role findOne(String id);

    @Update("UPDATE `Role` set `name` = #{name} WHERE `id` = #{id}")
    void update(Role role);

    @Delete("DELETE FROM `Role` WHERE `id` = #{id}")
    void deleteById(String id);

    @Delete("DELETE FROM `Role` WHERE `id` = #{id}")
    void delete(Role role);

}
