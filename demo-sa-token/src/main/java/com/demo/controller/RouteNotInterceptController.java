package com.demo.controller;

import com.demo.base.ControllerBase;
import com.demo.entity.pojo.Result;
import com.demo.entity.vo.RouteNotInterceptVo;
import com.demo.interceptor.RouteInterceptor;
import com.demo.service.RouteNotInterceptService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>RouteNotInterceptController</h1>
 *
 * <p>
 * createDate 2021/12/08 13:55:45
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@RequestMapping("routeNotIntercept")
@AllArgsConstructor
public class RouteNotInterceptController extends ControllerBase {

    private final RouteNotInterceptService routeNotInterceptService;
    private final RouteInterceptor routeInterceptor;

    /**
     * 查询所有
     */
    @PostMapping("findAll")
    public Result findAll() {
        return Result.o(routeNotInterceptService.findAll());
    }

    /**
     * 插入
     */
    @PostMapping("insert")
    public Result insert(@RequestBody RouteNotInterceptVo routeNotIntercept) {
        if (existNull(routeNotIntercept.getPages(), routeNotIntercept.getName(), routeNotIntercept.getSeq())) {
            return paramIsError();
        }
        return Result.o(routeNotInterceptService.insert(routeNotIntercept));
    }

    /**
     * 删除
     */
    @PostMapping("delete")
    public Result delete(@RequestBody RouteNotInterceptVo routeNotIntercept) {
        if (isNull(routeNotIntercept.getId())) {
            return paramIsError();
        }
        return Result.o(routeNotInterceptService.delete(routeNotIntercept.getId()));
    }

    /**
     * 更新
     */
    @PostMapping("update")
    public Result update(@RequestBody RouteNotInterceptVo routeNotIntercept) {
        if (isNull(routeNotIntercept.getId())) {
            return paramIsError();
        }
        return Result.o(routeNotInterceptService.update(routeNotIntercept));
    }

    /**
     * 刷新
     */
    @PostMapping("refresh")
    public Result refresh() {
        routeInterceptor.deleteRouteNotIntercept();
        return Result.o();
    }

}
