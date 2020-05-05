package com.xc.redis.proxy;

public interface IRedisProxy {

    /**
     * 获取缓存
     * @param key 键
     * @return 值
     */
    Object get(String key);

    /**
     * 放入缓存
     * @param key 键
     * @param value 值
     * @return true成功，false失败
     */
    boolean set(String key, Object value);
}
