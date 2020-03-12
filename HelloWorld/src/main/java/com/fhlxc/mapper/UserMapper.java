package com.fhlxc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

import com.fhlxc.demo.User;

/**
* @author Xingchao Long
* @date 2020年3月10日 下午7:29:49
* @ClassName UserMapper
* @Description 
*/

@Mapper
public interface UserMapper {
    
    @Select("select * from user")
    @Results(id="userMap", value = {
            @Result(property = "id", column = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(property = "age", column = "age", jdbcType = JdbcType.INTEGER), 
            @Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR)
            })
    List<User> getAll();
    
    @Select("select * from user where id = #{id}")
    @ResultMap(value = "userMap")
    User getOne(int id);
    
    @Insert("insert into user(name, age) values(#{name}, #{age})")
    void insert(User user);
    
    @Update("update user set name = #{name}, age = #{age} where id = #{id}")
    void update(User user);
    
    @Delete("delete from user where id = #{id}")
    void delete(int id);
    
}
