package com.drh.springboot_demo.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author DongRuihua
 * QQ: 84722386
 * @date 2019/2/4 11:13
 */
public class ReidsUtil {

    private RedisTemplate<String, Object> redisTemplate;

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /*===============================================================*/

    /**
     * 指定缓存失效时间
     * @param key
     * @param time 时间，秒
     * @return
     */
    public boolean expire(String key, long time){
        try{
            if(time > 0){
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 根据key获取过期时间
     * @param key
     * @return 获取时间(秒)，返回0表示永久有效
     */
    public long getExpire(String key){

        if(key != null && !"".equals(key)){
            return redisTemplate.getExpire(key, TimeUnit.SECONDS);
        }
        return -1;
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key){

        try{
            if(key != null){
                return redisTemplate.hasKey(key);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 删除缓存
     * @param key
     * @return
     */
    public void delKey(String... key){
        if(key != null & key.length > 0){
            if(key.length == 1){
                redisTemplate.delete(key[0]);
            }else{
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }
        }
    }
}
