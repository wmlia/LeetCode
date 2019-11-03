import java.util.ArrayList;
import java.util.List;

public class Test412 {
    public static void main(String[] args) {
//        412. Fizz Buzz
//        写一个程序，输出从 1 到 n 数字的字符串表示。
//        1. 如果 n 是3的倍数，输出“Fizz”；
//        2. 如果 n 是5的倍数，输出“Buzz”；
//        3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。\
        int n=15;
        List<String> list = fizzBuzz(n);

        System.out.println(list.toString());
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for (int i = 1; i <=n; i++) {
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
