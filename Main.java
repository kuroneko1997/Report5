package jp.ac.uryukyu.ie.e165741.Report5;

/**
 * Created by e1657 on 2016/12/12.
 */
public class Main {
    public static void main(String[] ages){
        String str = null;
        try {
            System.out.printf("%s", str.length());
        }
         catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが発生。プログラムを終了します。");
            e.printStackTrace();
        }


    }
}
