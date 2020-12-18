package orihuel.vilaplana.angel.android_layouts;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleFilms(View view) {
        Intent intent = new Intent(this, MovieDownloadActivity.class);
        startActivity(intent);
    }

    public void handleImages(View view) {
        Intent intent = new Intent(this, ImagesActivity.class);
        startActivity(intent);
    }

    public void handleCalculadora(View view) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }

    public void handleForm(View view) {
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }

}