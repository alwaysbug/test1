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

public class two extends AppCompatActivity implements CallBack {

    private TextView mTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
        initView();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(two.this,three.class));
            }
        });
    }

    @Override
    public void callback(String msg) {
        mTextView.setText(msg);
    }
}
