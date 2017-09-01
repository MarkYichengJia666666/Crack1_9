/**
 * Created by jiayicheng on 17/7/18.
 */
import java.lang.String;
public class String_Rotation {

    public static void main(String[] args) {
        //目的：判断一个序列是不是另一个序列的循环序列，允许使用判断是否是子序列的函数isSubString
        //思路：需要解决是否是循环序列，只需要把第一个序列重复拼在一起，看子序列有没有原序列就可以。
        String str1 = "abc";
        String str2 = "abcd";
        System.out.print(isRotation(str1,str2));
        return;
    }

    static boolean isRotation(String str1, String str2) {
        String str11;
        if (str1.length() > 0 && str1.length() == str2.length()) {
            str11 = str1 + str1;
            return true;
            //(str11,str2);
        }
        return false;
    }
}
