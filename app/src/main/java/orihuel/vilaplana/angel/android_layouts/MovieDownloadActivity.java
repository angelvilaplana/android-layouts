package orihuel.vilaplana.angel.android_layouts;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MovieDownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_download);
        setEditTextNoEditable();
    }

    private void setEditTextNoEditable() {
        EditText etPersonName = findViewById(R.id.etPersonName);
        etPersonName.setKeyListener(null);
        EditText etQualitat = findViewById(R.id.etQualitat);
        etQualitat.setKeyListener(null);
    }

    public void handleDownload(View view) {
        Toast toast = Toast.makeText(this, "Has clicat en download", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void handleComentar(View view) {
        Toast toast = Toast.makeText(this, "Has clicat en comentar", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void handleStar(View view) {
        Toast toast = Toast.makeText(this, "Has clicat en la estrella", Toast.LENGTH_SHORT);
        toast.show();
    }

}