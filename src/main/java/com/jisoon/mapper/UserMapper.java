package com.jisoon.mapper;

import com.jisoon.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by jisoon on 2017-07-25.
 */
@Mapper
public interface UserMapper{

    UserModel findOne(@Param(value = "userId") String userId);
}
