package ru.kogut.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.kogut.model.User;

import java.util.List;

/**
 * @author S.Kogut on 2019-03-24
 */
public interface UserRepository {

    @Insert("INSERT INTO `User`(`id`,`name`,`login`,`password`,`eMail`) values (#{id}, #{name}, #{login}, #{password}, #{eMail})")
    void create(User user);

    @Select("SELECT * FROM `User`")
    List<User> findAll();

    @Select("SELECT * FROM `User` WHERE `id` = #{id}")
    User findOne(String id);

    @Update("UPDATE `User` set `name` = #{name}, `login` = #{login}, `password` = #{password}, `eMail` = #{eMail} WHERE `id` = #{id}")
    void update(User user);

    @Delete("DELETE FROM `User` WHERE `id` = #{id}")
    void deleteById(String id);

    @Delete("DELETE FROM `User` WHERE `id` = #{id}")
    void delete(User user);

}
