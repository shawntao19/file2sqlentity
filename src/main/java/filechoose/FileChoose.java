package filechoose;

import java.io.File;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author happy
 */
public class FileChoose {
    
    
    public static void main(String[] args){
        getModifiedTime();
    }

    public static void getModifiedTime() {
        File f = new File("D:\\happyDocuments\\Tencent Files\\172911061\\FileRecv\\cheshi.txt");
        Calendar cal = Calendar.getInstance();
        long time = f.lastModified();
        cal.setTimeInMillis(time);
        System.out.println("修改时间： " + cal.getTime().toLocaleString());
    }

}
