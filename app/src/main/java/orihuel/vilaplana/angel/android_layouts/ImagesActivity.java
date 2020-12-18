package orihuel.vilaplana.angel.android_layouts;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ImagesActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_images);

        imageView = findViewById(R.id.imageView);
    }


    public void handleCenter(View view) {
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public void handleCenterCrop(View view) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public void handleCenterInside(View view) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public void handleFitCenter(View view) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void handleFitEnd(View view) {
        imageView.setScaleType(ImageView.ScaleType.FIT_END);
    }

    public void handleFitStart(View view) {
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
    }

    public void handleFitXY(View view) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void handleMatrix(View view) {
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void handleHome(View view) {
        finish();
    }

}