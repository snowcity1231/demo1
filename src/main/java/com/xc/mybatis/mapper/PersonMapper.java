package com.xc.mybatis.mapper;

import com.xc.mybatis.pojo.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {

    int add(Person person);

    Person get(int id);
}
