package jp.ac.uryukyu.ie.e165741.Report5;

/**
 * Created by e1657 on 2016/12/12.
 */
public class Main {
    public static void main(String[] ages){
        String str = "3．14";
        try {
            System.out.printf("%s", str.length());
            double value = Double.parseDouble(str);
        }
         catch(NullPointerException e) {
            System.out.println("NullPointerExceptionが発生。");
            e.printStackTrace();
        }
        catch(NumberFormatException e) {
            System.out.println("NumberFormatExceptionが発生。");
            e.printStackTrace();
        }

    }
}
