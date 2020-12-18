package orihuel.vilaplana.angel.android_layouts;

import android.app.AlertDialog;
import android.text.Html;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputLayout;

public class FormActivity extends AppCompatActivity {

    private TextInputLayout tfName;

    private TextInputLayout tfPhone;

    private TextInputLayout tfArea;

    private TextInputLayout tfAddress;

    private TextInputLayout tfCity;

    private TextInputLayout tfState;

    private TextInputLayout tfZip;

    private TextInputLayout tfEmail;

    private TextInputLayout tfBirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        setUI();
    }

    private void setUI() {
        tfName = findViewById(R.id.tfName);
        tfPhone = findViewById(R.id.tfPhone);
        tfArea = findViewById(R.id.tfArea);
        tfAddress = findViewById(R.id.tfAddress);
        tfCity = findViewById(R.id.tfCity);
        tfState = findViewById(R.id.tfState);
        tfZip = findViewById(R.id.tfZip);
        tfEmail = findViewById(R.id.tfEmail);
        tfBirthday = findViewById(R.id.tfBirthday);
    }

    public void handleShowData(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(Html.fromHtml("<br><b>Name</b>: " + tfName.getEditText().getText() +
                "<br><br><b>Phone</b>: " + tfPhone.getEditText().getText() +
                "<br><br><b>Area</b>: " + tfArea.getEditText().getText() +
                "<br><br><b>Address</b>: " + tfAddress.getEditText().getText() +
                "<br><br><b>City</b>: " + tfCity.getEditText().getText() +
                "<br><br><b>State</b>: " + tfState.getEditText().getText() +
                "<br><br><b>Zip</b>: " + tfZip.getEditText().getText() +
                "<br><br><b>Email</b>: " + tfEmail.getEditText().getText() +
                "<br><br><b>Birthday</b>: " + tfBirthday.getEditText().getText()
        , Html.FROM_HTML_MODE_LEGACY)).setTitle("Form Data")
                                      .setPositiveButton("OK", null)
                                      .show();
    }

    public void handleExit(View view) {
        finish();
    }

}