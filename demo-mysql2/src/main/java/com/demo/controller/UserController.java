package com.demo.controller;

import com.demo.base.ControllerBase;
import com.demo.entity.pojo.Result;
import com.demo.entity.vo.UserVo;
import com.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>用户</h1>
 *
 * <p>
 * createDate 2021/10/26 15:38:52
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController extends ControllerBase {

    private final UserService userService;

    /**
     * 插入
     *
     * @param user account,pwd,createId
     * @return ok:id,e:0
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody UserVo user) {
        return Result.o(userService.insert(user));
    }

    /**
     * 更新
     *
     * @param user id,updateId;至少一个account,pwd,name,gender,year,profile,comment
     * @return 是否成功
     */
    @PostMapping("/update")
    public Result update(@RequestBody UserVo user) {
        return Result.o(userService.update(user));
    }

    /**
     * 删除
     *
     * @param user id,updateId
     * @return 是否成功
     */
    @PostMapping("/delete")
    public Result delete(@RequestBody UserVo user) {
        return Result.o(userService.delete(user));
    }

    /**
     * 恢复
     *
     * @param user id,updateId
     * @return 是否成功
     */
    @PostMapping("/restore")
    public Result restore(@RequestBody UserVo user) {
        return Result.o(userService.restore(user));
    }

    /**
     * 是否存在id
     *
     * @param id id
     * @return 是否存在
     */
    @PostMapping("/existId")
    public Result existId(long id) {
        return Result.o(userService.existId(id));
    }

    /**
     * 是否存在account
     *
     * @param account account
     * @return 是否存在
     */
    @PostMapping("/existAccount")
    public Result existAccount(String account) {
        return Result.o(userService.existAccount(account));
    }

    /**
     * 查询通过id
     *
     * @param id id
     * @return UserVo
     */
    @PostMapping("/findById")
    public Result findById(long id) {
        return Result.o(userService.findById(id));
    }

    /**
     * 查询通过account
     *
     * @param account account
     * @return PageInfo<UserVo>
     */
    @PostMapping("/findByAccount")
    public Result findByAccount(String account) {
        return Result.o(userService.findByAccount(account));
    }

    /**
     * 精确查询
     *
     * @param user UserVo
     * @return PageInfo<UserVo>
     */
    @PostMapping("/findExact")
    public Result findExact(@RequestBody UserVo user) {
        return Result.o(userService.findExact(user));
    }


}
