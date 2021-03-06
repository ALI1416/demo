package com.demo.controller;

import com.demo.entity.po.User;
import com.demo.entity.pojo.Result;
import com.demo.util.RedisUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;
import java.util.Map;

/**
 * <h1>字符串操作</h1>
 *
 * <p>
 * createDate 2021/09/09 10:35:04
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@RequestMapping("string")
public class StringController {

    /* ==================== set各种类型 ==================== */
    //region

    /**
     * <h3>放入int</h3>
     * POST /string/intSet?key=int&value=12<br>
     * Redis中的值 12<br>
     * get返回值 12
     */
    @PostMapping("intSet")
    public Result intSet(String key, int value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入short</h3>
     * POST /string/shortSet?key=short&value=123<br>
     * Redis中的值 123S (尾部带大写字母S)<br>
     * get返回值 123
     */
    @PostMapping("shortSet")
    public Result shortSet(String key, short value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入long</h3>
     * POST /string/longSet?key=long&value=1234567890123456789<br>
     * Redis中的值1234567890123456789<br>
     * get返回值 1234567890123456789
     */
    @PostMapping("longSet")
    public Result longSet(String key, long value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入boolean</h3>
     * POST /string/booleanSet?key=boolean&value=true<br>
     * Redis中的值 true<br>
     * get返回值 true
     */
    @PostMapping("booleanSet")
    public Result booleanSet(String key, boolean value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入byte</h3>
     * POST /string/byteSet?key=byte&value=123<br>
     * Redis中的值 123B (尾部带大写字母B)<br>
     * get返回值 123
     */
    @PostMapping("byteSet")
    public Result byteSet(String key, byte value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入char</h3>
     * POST /string/charSet?key=char&value=c<br>
     * Redis中的值 "c"<br>
     * get返回值 "c"
     */
    @PostMapping("charSet")
    public Result charSet(String key, char value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入float</h3>
     * POST /string/floatSet?key=float&value=123.45<br>
     * Redis中的值 123.45F (尾部带大写字母F)<br>
     * get返回值 123.45
     */
    @PostMapping("floatSet")
    public Result floatSet(String key, float value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入double</h3>
     * POST /string/doubleSet?key=double&value=123.456789012<br>
     * Redis中的值 123.456789012D (尾部带大写字母D)<br>
     * get返回值 123.456789012
     */
    @PostMapping("doubleSet")
    public Result doubleSet(String key, double value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入String</h3>
     * POST /string/stringSet?key=string&value=string<br>
     * Redis中的值 "string"<br>
     * get返回值 "string"
     */
    @PostMapping("stringSet")
    public Result stringSet(String key, String value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入Integer</h3>
     * POST /string/integerSet?key=integer&value=123<br>
     * Redis中的值 123<br>
     * get返回值 123
     */
    @PostMapping("integerSet")
    public Result integerSet(String key, Integer value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入对象User</h3>
     * POST /string/userSet?key=user<br>
     * body JSON {"account":"aaa","year":1998,"gender":true,"date":"2021-01-02 12:34:56"}<br>
     * Redis中的值 {"@type":"com.demo.entity.po.User","account":"aaa","date":"2021-01-02 12:34:56","gender":true,
     * "year":1998}<br>
     * get返回值 {"account":"aaa","date":"2021-01-02 12:34:56","gender":"true","year":"1998"}
     */
    @PostMapping("userSet")
    public Result userSet(String key, @RequestBody User user) {
        RedisUtils.set(key, user);
        return Result.o();
    }

    /**
     * <h3>放入Map String Object</h3>
     * POST /string/mapStringObjectSet?key=mapStringObjectSet<br>
     * body JSON {"account":"aaa","year":1998,"gender":true,"date":"2021-01-02 12:34:56"}<br>
     * Redis中的值 {"@type":"java.util.HashMap","date":"2021-01-02 12:34:56","gender":true,"year":1998,"account":"aaa"}<br>
     * get返回值 {"account":"aaa","date":"2021-01-02 12:34:56","gender":"true","year":"1998"}
     */
    @PostMapping("mapStringObjectSet")
    public Result mapStringObjectSet(String key, @RequestBody Map<String, Object> value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入Array Integer</h3>
     * POST /string/arrayIntegerSet?key=arrayIntegerSet&value=123&value=456&value=789<br>
     * Redis中的值 [123,456,789]<br>
     * get返回值 [123,456,789]
     */
    @PostMapping("arrayIntegerSet")
    public Result arrayIntegerSet(String key, Integer[] value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    /**
     * <h3>放入List Integer</h3>
     * POST /string/listIntegerSet?key=listIntegerSet<br>
     * body JSON [111,222,333]<br>
     * Redis中的值 [111,222,333]<br>
     * get返回值 [123,456,789]
     */
    @PostMapping("listIntegerSet")
    public Result listIntegerSet(String key, @RequestBody List<Integer> value) {
        RedisUtils.set(key, value);
        return Result.o();
    }

    //endregion

    /**
     * <h3>放入，并设置失效时间</h3>
     * POST /string/setExpire?key=a&value=a&timeout=100</h3>
     * 倒计时100秒
     */
    @PostMapping("setExpire")
    public Result setExpire(String key, String value, long timeout) {
        RedisUtils.set(key, value, timeout);
        return Result.o();
    }

    /**
     * <h3>放入，并设置持续时间</h3>
     * POST /string/setExpireDuration?key=a&value=aa&timeout=PT100H</h3>
     * 倒计时100小时
     */
    @PostMapping("setExpireDuration")
    public Result setExpireDuration(String key, String value, String timeout) {
        RedisUtils.set(key, value, Duration.parse(timeout));
        return Result.o();
    }

    /**
     * <h3>如果key不存在，则放入</h3>
     * POST /string/setIfAbsent?key=a&value=a</h3>
     * 存在 false</h3>
     * 不存在 true
     */
    @PostMapping("setIfAbsent")
    public Result setIfAbsent(String key, String value) {
        return Result.o(RedisUtils.setIfAbsent(key, value));
    }

    /**
     * <h3>如果key不存在，则放入，并设置失效时间</h3>
     * POST /string/setIfAbsentExpire?key=a&value=a&timeout=100</h3>
     * 存在 false</h3>
     * 不存在 true
     */
    @PostMapping("setIfAbsentExpire")
    public Result setIfAbsent(String key, String value, long timeout) {
        return Result.o(RedisUtils.setIfAbsent(key, value, timeout));
    }

    /**
     * <h3>如果key不存在，则放入，并设置持续时间</h3>
     * POST /string/setIfAbsentExpireDuration?key=a&value=a&timeout=PT100H</h3>
     * 存在 false</h3>
     * 不存在 true
     */
    @PostMapping("setIfAbsentExpireDuration")
    public Result setIfAbsent(String key, String value, String timeout) {
        return Result.o(RedisUtils.setIfAbsent(key, value, Duration.parse(timeout)));
    }

    /**
     * <h3>如果key存在，则放入</h3>
     * POST /string/setIfPresent?key=a&value=a</h3>
     * 存在 true</h3>
     * 不存在 false
     */
    @PostMapping("setIfPresent")
    public Result setIfPresent(String key, String value) {
        return Result.o(RedisUtils.setIfPresent(key, value));
    }

    /**
     * <h3>如果key存在，则放入，并设置失效时间</h3>
     * POST /string/setIfPresentExpire?key=a&value=a&timeout=100</h3>
     * 存在 true</h3>
     * 不存在 false
     */
    @PostMapping("setIfPresentExpire")
    public Result setIfPresent(String key, String value, long timeout) {
        return Result.o(RedisUtils.setIfPresent(key, value, timeout));
    }

    /**
     * <h3>如果key存在，则放入，并设置持续时间</h3>
     * POST /string/setIfPresentExpireDuration?key=a&value=a&timeout=PT100H</h3>
     * 存在 true</h3>
     * 不存在 false
     */
    @PostMapping("setIfPresentExpireDuration")
    public Result setIfPresent(String key, String value, String timeout) {
        return Result.o(RedisUtils.setIfPresent(key, value, Duration.parse(timeout)));
    }

    /**
     * <h3>map中的key和value依次放入(键存在则不会放入)</h3>
     * POST /string/multiSet<br>
     * body JSON {"a":"a","b":"b","c":"c","d":"d"}<br>
     * 存在键b，acd依次放入，b未被修改
     */
    @PostMapping("multiSet")
    public Result multiSet(@RequestBody Map<String, Object> map) {
        RedisUtils.setMulti(map);
        return Result.o();
    }

    /**
     * <h3>如果map中的key全部不存在，则map中的key和value依次放入</h3>
     * POST /string/multiSetIfAbsent<br>
     * body JSON {"a":"a","b":"b","c":"c","d":"d"}<br>
     * abcd都不存在 true<br>
     * 存在1个以上 false
     */
    @PostMapping("multiSetIfAbsent")
    public Result multiSetIfAbsent(@RequestBody Map<String, Object> map) {
        return Result.o(RedisUtils.setMultiIfAbsent(map));
    }

    /**
     * <h3>获取</h3>
     * POST /string/get?key=a<br>
     * 存在a a的值<br>
     * 不存在a null
     */
    @PostMapping("get")
    public Result get(String key) {
        return Result.o(RedisUtils.get(key));
    }

    /**
     * <h3>获取并放入</h3>
     * POST /string/getAndSet?key=a&value=abc<br>
     * 存在a a的值<br>
     * 不存在a null
     */
    @PostMapping("getAndSet")
    public Result getAndSet(String key, String value) {
        return Result.o(RedisUtils.getAndSet(key, value));
    }

    /**
     * <h3>获取多个</h3>
     * POST /string/multiGetLis<br>
     * body JSON ["a","b","c"]<br>
     * 存在a/b ["aaa","bbb",null]
     */
    @PostMapping("multiGetList")
    public Result multiGet(@RequestBody List<String> keys) {
        return Result.o(RedisUtils.getMulti(keys));
    }

    /**
     * <h3>获取多个</h3>
     * POST /string/multiGetLis?keys=a&keys=b&keys=c<br>
     * 存在a/b ["aaa","bbb",null]
     */
    @PostMapping("multiGetArray")
    public Result multiGet(String[] keys) {
        return Result.o(RedisUtils.getMultiArray(keys));
    }

    /**
     * <h3>整数型递增1(键不存在自动创建并赋值为0后再递增)</h3>
     * POST /string/increment1?key=a<br>
     * 值为123 返回124，值改变为124<br>
     * 不存在键 返回1，值改变为1
     */
    @PostMapping("increment1")
    public Result increment(String key) {
        return Result.o(RedisUtils.increment(key));
    }

    /**
     * <h3>整数型递增(键不存在自动创建并赋值为0后再递增)</h3>
     * POST /string/increment?key=a&delta=2<br>
     * 值为123 返回125，值改变为125<br>
     * 不存在键 返回2，值改变为2
     */
    @PostMapping("increment")
    public Result increment(String key, long delta) {
        return Result.o(RedisUtils.increment(key, delta));
    }

    /**
     * <h3>整数型递减1(键不存在自动创建并赋值为0后再递减)</h3>
     * POST /string/decrement1?key=a<br>
     * 值为123 返回122，值改变为122<br>
     * 不存在键 返回-1，值改变为-1
     */
    @PostMapping("decrement1")
    public Result decrement(String key) {
        return Result.o(RedisUtils.decrement(key));
    }

    /**
     * <h3>整数型递减(键不存在自动创建并赋值为0后再递减)</h3>
     * POST /string/decrement?key=a&delta=2<br>
     * 值为123 返回121，值改变为121<br>
     * 不存在键 返回-2，值改变为-2
     */
    @PostMapping("decrement")
    public Result decrement(String key, long delta) {
        return Result.o(RedisUtils.decrement(key, delta));
    }

}
