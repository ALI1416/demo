package com.demo.mapper;

import com.demo.entity.vo.RouteNotInterceptVo;

import java.util.List;

/**
 * <h1>RouteNotInterceptMapper</h1>
 *
 * <p>
 * createDate 2021/12/08 09:57:34
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public interface RouteNotInterceptMapper {

    /**
     * 查询所有
     *
     * @return List&lt;RouteNotInterceptVo>
     */
    List<RouteNotInterceptVo> findAll();

    /**
     * 插入
     *
     * @param routeNotIntercept RouteNotInterceptVo
     * @return 执行成功数量
     */
    int insert(RouteNotInterceptVo routeNotIntercept);

    /**
     * 删除
     *
     * @param id id
     * @return 执行成功数量
     */
    int delete(Long id);

    /**
     * 更新
     *
     * @param routeNotIntercept RouteNotInterceptVo
     * @return 执行成功数量
     */
    int update(RouteNotInterceptVo routeNotIntercept);

}
