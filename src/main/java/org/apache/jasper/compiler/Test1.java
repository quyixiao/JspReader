package org.apache.jasper.compiler;

import org.apache.jasper.JasperException;

import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Test1 {


    public static void main(String[] args) throws Exception {
        JspReader reader = new JspReader("/Users/quyixiao/Desktop/testfile/yy.txt","UTF-8",new ErrorDispatcher());
        InputStreamReader inputStreamReader = JspReader.getReader("/Users/quyixiao/Desktop/testfile/xx.txt","UTF-8",new ErrorDispatcher());
        Method method = JspReader.class.getDeclaredMethod("pushFile", String.class,String.class,InputStreamReader.class);
        method.setAccessible(true);
        method.invoke(reader,"/Users/quyixiao/Desktop/testfile/xx.txt","UTF-8", inputStreamReader);

        for(int i = 0 ;i < 10;i ++){
            System.out.println((char)reader.nextChar());
        }
    }


}
