package demo.anonymous.example.com.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Anonymous on 2017/8/8.
 */

public class one extends AppCompatActivity implements CallBack {
    private TextView mTextView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        initView();
    }

    private void initView() {
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(one.this,two.class));
            }
        });
    }

    @Override
    public void callback(String msg) {
        mTextView2.setText(msg);
    }


}
