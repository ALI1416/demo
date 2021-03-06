package com.demo.mapper;

import com.demo.entity.vo.UserVo;

import java.util.List;

/**
 * <h1>UserMapper</h1>
 *
 * <p>
 * createDate 2021/11/29 15:00:01
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public interface UserMapper {

    /**
     * 插入
     *
     * @param user UserVo
     * @return 执行成功数量
     */
    int insert(UserVo user);

    /**
     * 更新
     *
     * @param user UserVo
     * @return 执行成功数量
     */
    int update(UserVo user);

    /**
     * 是否存在唯一键
     *
     * @param user UserVo
     * @return 是否存在
     */
    boolean existUniqueKey(UserVo user);

    /**
     * 查找唯一键
     *
     * @param user UserVo
     * @return UserVo
     */
    UserVo findByUniqueKey(UserVo user);

    /**
     * 查询拥有指定角色id的用户
     *
     * @param roleId 角色id
     * @return List&lt;UserVo>
     */
    List<UserVo> findByRoleId(Long roleId);

    /**
     * 查询全部
     * @return List&lt;UserVo>
     */
    List<UserVo> findAll();

}
