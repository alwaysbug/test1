package demo.anonymous.example.com.demo;

/**
 * Created by Anonymous on 2017/8/8.
 */

public class Test {

    static CallBack mCallBack;

    public static void a(String msg,CallBack callBack) {
        callBack.callback(msg);
    }
}
