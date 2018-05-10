package aula03.fiap.com.aula03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Log.d("esn", "2 - onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("esn", "2 - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("esn", "2 - onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("esn", "2 - onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("esn", "2 - onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("esn", "2 - onDestroy");
    }
}
