package demo.anonymous.example.com.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anonymous on 2017/8/8.
 */

public class three extends AppCompatActivity {
    private Button mButton5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);
        initView();
    }

    private void initView() {
        mButton5 = (Button) findViewById(R.id.button5);
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test.a("改变了!", new CallBack() {
                    @Override
                    public void callback(String msg) {
                        mButton5.setText(msg);
                    }
                });
            }
        });
    }
}
