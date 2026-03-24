package org.example.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;

public class PropertyReader {
    public static String run(String key) {
        Properties p;
        String begurl = System.getProperty("user.div");
        String url = begurl + "/src/main/resources/data.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(url);
            p=new Properties();
            p.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       return p.getProperty(key);
    }
}



//Properties p;
//String user_dir=System.getProperty("user.dir");
//String file_path=user_dir+"/src/main/resources/data.properties";
//        System.out.println(file_path);
////String file_path="C:/Users/ganes/IdeaProjects/POMPractice/src/main/resources/data.properties";
//        try {
//FileInputStream fileInputStream=new FileInputStream(file_path);
//p=new Properties();
//            p.load(fileInputStream);
//        } catch (FileNotFoundException e) {
//        throw new RuntimeException(e);
//        } catch (IOException e) {
//        throw new RuntimeException(e);
//        }
//                return p.getProperty(key);


