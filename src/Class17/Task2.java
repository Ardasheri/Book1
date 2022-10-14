package Class17;

public class Task2 {

  public static String reverseStr(String str){
        String newStr;
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        newStr=sb.toString();
        return newStr;
    }
}
