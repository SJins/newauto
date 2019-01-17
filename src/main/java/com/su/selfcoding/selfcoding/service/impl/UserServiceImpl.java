package com.su.selfcoding.selfcoding.service.impl;

import com.su.selfcoding.selfcoding.entity.User;
import com.su.selfcoding.selfcoding.mapper.UserMapper;
import com.su.selfcoding.selfcoding.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
