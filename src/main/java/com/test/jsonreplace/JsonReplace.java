package com.test.jsonreplace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JsonReplace {

    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\eden.yang\\Desktop\\jsonreplace\\src\\main\\resources\\RIS.json";
        File file = new File(path);

        FileInputStream fin = new FileInputStream(file);
        byte[] b = new byte[fin.available()];
        fin.read(b);
        String json = new String(b);
        System.out.println(json);
        fin.close();

        String newJson = json.replaceAll("[\\?]+", "");
        System.out.println(newJson);

        FileOutputStream fout = new FileOutputStream(file);
        byte[] bytes = newJson.getBytes();

        fout.write(bytes);

        fout.flush();
        fout.close();
    }

}
