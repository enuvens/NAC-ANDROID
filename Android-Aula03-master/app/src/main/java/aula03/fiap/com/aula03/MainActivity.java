package aula03.fiap.com.aula03;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btOpen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOpen = (Button) findViewById(R.id.bt_open);
        btOpen.setOnClickListener(this);
        Log.d("esn", "onCreate");
    }

    @Override
    public void onClick(View v){

        if (v.getId() == R.id.bt_open){
            /*
            Abrir um mapa com a localização (FIAP no exemplo abaixo)
            String location = "geo:-23.5953251,-46.6875112?q=my+street+address";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(location));

            Abrir o discador
            String location = "tel: 123456789";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(location));

            Ligar para o numero definido no location
            String location = "tel: 123456789";
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(location));

            */
            Intent TakepictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if(TakepictureIntent.resolveActivity(getPackageManager()) != null){
                startActivityForResult(TakepictureIntent, 123);
            }

            Log.d("esn", "onClick");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 123 && resultCode == RESULT_OK){
            Log.d("esn", "pegou a foto");
        }

        if (resultCode == RESULT_CANCELED){
            Log.d("esn", "ele não quer mais");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("esn", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("esn", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("esn", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("esn", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("esn", "onDestroy");
    }
}
