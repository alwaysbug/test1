package demo.anonymous.example.com.demo;

/**
 * Created by Anonymous on 2017/8/8.
 */

public class CallBackClass {
    CallBack mCallBack;

    public CallBackClass(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public String setCallBack(String msg) {
        return msg;
    }
}
