package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView textWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textWidget = (TextView) findViewById(R.id.class_example_textview);
        Log.d(TAG, "onCreate Method has Run");
        textWidget.setText("Hello, Android");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart Method has run");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Method has run");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Method has run");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Method has run");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Method has run");
    }
}
