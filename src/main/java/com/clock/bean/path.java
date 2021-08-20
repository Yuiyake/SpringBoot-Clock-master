package com.clock.bean;

import java.nio.file.Path;
import java.nio.file.Paths;

public class path {
//    public static String getFileimg() {
////        Path p = Paths.get("C:\\Users\\Lenovo\\Desktop\\");
//        return "C:\\Users\\Lenovo\\Desktop\\study\\java\\javaee\\大作业\\Clock-Project\\SpringBoot-Clock-master\\src\\main\\java\\com\\clock\\util\\img";
//    }
    private String Fileimg = "C:\\Users\\Lenovo\\Desktop\\study\\java\\javaee\\大作业\\Clock-Project\\SpringBoot-Clock-master\\src\\main\\java\\com\\clock\\util\\img";

    private String USEIMG = "http://localhost:8080/";

    public String getFileimg() {
        return Fileimg;
    }

    public void setFileimg(String fileimg) {
        Fileimg = fileimg;
    }

    public String getUSEIMG() {
        return USEIMG;
    }

    public void setUSEIMG(String USEIMG) {
        this.USEIMG = USEIMG;
    }

}
