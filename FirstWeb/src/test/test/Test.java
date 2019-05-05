package test.test;


import domain.Person;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    @org.junit.Test
    public void junitTest() throws IOException {
        Person p = new Person("小龙",18,true);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(p);
        System.out.println("json字符串是 "+s);
        //测试数组
//        Person p1 = new Person("小na",18,true);
//        Person p2 = new Person("小非",8,true);
//        Person p3 = new Person("小哈",58,false);
//        List<Person> personList = new ArrayList<>();
//        personList.add(p1);
//        personList.add(p2);
//        personList.add(p3);
//        String asString = objectMapper.writeValueAsString(personList);
//        System.out.println(asString);

        //测试map {"name":"long","age":18}
//        Map<String,Object> map = new HashMap<>();
//        map.put("age",18);
//        map.put("name","long");
//        String mapStr = objectMapper.writeValueAsString(map);
//        System.out.println(mapStr);
    }




}



