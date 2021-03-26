package org.zgx.common.test.redis;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zgx
 */
public class RedisJedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);

        //1.操作Redis字符串
        jedis.set("stringKey1", "stringValue1");
        jedis.setex("stringKey2", 20, "stringValue2");
        System.out.println(jedis.get("stringKey1"));

        //2.操作Redis列表
        jedis.lpush("redisList", "a", "b", "c");
        jedis.rpush("redisList", "a", "b", "c");
        //Redis中，0为起始索引，-1为结束索引用
        List<String> redisList = jedis.lrange("redisList", 0, -1);
        System.out.println(redisList);
        String element1 = jedis.lpop("redisList");
        System.out.println(element1);
        String element2 = jedis.rpop("redisList");
        System.out.println(element2);
        List<String> mylist2 = jedis.lrange("redisList", 0, -1);
        System.out.println(mylist2);

        //3.操作Redis集合
        jedis.sadd("read_flag", "1", "2", "3");
        System.out.println(jedis.smembers("read_flag"));
        jedis.sadd("read_flag", "4", "5");
        System.out.println(jedis.smembers("read_flag"));
        jedis.srem("read_flag", "3");
        System.out.println(jedis.smembers("read_flag"));

        //4.操作Redis有序集合
        jedis.zadd("sortedSet", 3, "Spring");
        jedis.zadd("sortedSet", 7, "Summer");
        jedis.zadd("sortedSet", 10, "Autumn");
        jedis.zadd("sortedSet", 17, "Winter");
        Set<String> sortedSet = jedis.zrange("sortedSet", 0, -1);
        System.out.println(sortedSet);

        //5.操作Redis散列
        jedis.hset("user", "name", "Redy");
        jedis.hset("user", "age", "24");
        jedis.hset("user", "gender", "male");
        // 获取hash
        String name = jedis.hget("user", "name");
        System.out.println(name);
        // 获取某hash的所有数据
        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String key : keySet) {
            //获取value
            String value = user.get(key);
            System.out.println(key + ":" + value);
        }
        //关闭连接
        jedis.close();
    }
}
