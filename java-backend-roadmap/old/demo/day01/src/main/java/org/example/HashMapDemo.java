package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Long, User> userMap = new HashMap<>();

        userMap.put(1001L, new User(1001L, "xiaoming", 20));
        userMap.put(1002L, new User(1002L, "xiaohong", 18));
        userMap.put(1003L, new User(1003L, "xiaohua", 22));

        User user = userMap.get(1001L);
        System.out.println(user.toString());

        boolean exists = userMap.containsKey(1002L);
        System.out.println("用户存在" + exists);

        userMap.put(1001L, new User(1001L, "xiaoming", 24));

        System.out.println(userMap);

        userMap.remove(1003L);

        System.out.println(userMap);

        for (Map.Entry<Long, User> entry:userMap.entrySet()) {
            System.out.println("id:" + entry.getKey()
                    + " 用户：" + entry.getValue());
        };
    }
}
