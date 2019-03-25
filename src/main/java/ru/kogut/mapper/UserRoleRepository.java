package ru.kogut.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.kogut.model.User;
import ru.kogut.model.UserRole;

import java.util.List;

/**
 * @author S.Kogut on 2019-03-24
 */
public interface UserRoleRepository {

    @Insert("INSERT INTO `UserRole`(`id`,`userId`,`roleId`) values (#{id}, #{userId}, ${roleId})")
    void create(UserRole userRole);

    @Select("SELECT * FROM `UserRole`")
    List<UserRole> findAll();

    @Select("SELECT * FROM `UserRole` WHERE `id` = #{id}")
    UserRole findOne(String id);

    @Select("SELECT * FROM `UserRole` WHERE `userId` = #{userId}")
    List<UserRole> findByUserId(String userId);

    @Select("SELECT * FROM `UserRole` WHERE `roleId` = #{roleId}")
    List<UserRole> findByRoleId(String roleId);

    @Select("SELECT * FROM `UserRole` WHERE `userId` = #{id}")
    List<UserRole> findByUser(User user);

    @Update("UPDATE `UserRole` set `userId` = #{userId}, `roleId` = #{roleId} WHERE `id` = #{id}")
    void update(UserRole userRole);

    @Delete("DELETE FROM `UserRole` WHERE `id` = #{id}")
    void deleteById(String id);

    @Delete("DELETE FROM `UserRole` WHERE `id` = #{id}")
    void delete(UserRole userRole);

}
