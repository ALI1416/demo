package com.demo.service;

import com.demo.dao.mysql.RoleRouteDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>RoleRouteService</h1>
 *
 * <p>
 * createDate 2021/12/13 17:39:59
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Service
@AllArgsConstructor
public class RoleRouteService {

    private final RoleRouteDao roleRouteDao;

    /**
     * 删除，通过RoleId
     *
     * @param roleId roleId
     * @return 是否成功
     */
    @Transactional
    public boolean deleteByRoleId(Long roleId) {
        return roleRouteDao.deleteByRoleId(roleId);
    }

}
