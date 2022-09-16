package org.apache.jasper.compiler;

public class Test2 {


    public static void main(String[] args) throws Exception {
        JspReader reader = new JspReader("/Users/quyixiao/Desktop/testfile/zz.txt", "UTF-8", new ErrorDispatcher());


        String str = "<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>";
        int index = str.indexOf("\"");
        System.out.println(index);

        Mark mark0 = reader.mark();
        Mark mark = reader.skipUntil("\"");
        System.out.println(mark);
        System.out.println(reader.getText(mark0,mark));


    }


}
