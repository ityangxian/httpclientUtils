package com.test.jsonreplace;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class GetURLName {

    @Test
    public void getURLName() throws Exception {
        String path = "C:\\Users\\eden.yang\\Desktop\\jsonreplace\\src\\main\\resources\\RIS.postman_collection.json";
        File file = new File(path);
        FileInputStream fin = new FileInputStream(file);
        byte[] b = new byte[fin.available()];
        fin.read(b);
        fin.close();

        JSONObject obj = JSONObject.parseObject(new String(b));
        JSONArray item = obj.getJSONArray("item");
        ArrayList<String> list = new ArrayList<>();
        for (Object o : item) {
            boolean flag = true;
            JSONObject jsonObject = (JSONObject) o;
            String name = jsonObject.getString("name");
            for (String s : list) {
                if (s.equals(name)) {
                    flag = false;
                    System.out.println(name);
                    System.out.println(list.indexOf(name));
                    break;
                }
            }
            if (flag) list.add(name);
        }
        System.out.println(list.size());
    }
}
