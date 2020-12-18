package orihuel.vilaplana.angel.android_layouts;

import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CalculatorActivity extends AppCompatActivity {

    protected EditText etResult;

    private List<Float> numbers;

    private List<Character> operations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        this.etResult = findViewById(R.id.etResult);
        this.numbers = new ArrayList<>();
        this.operations = new ArrayList<>();
    }

    public void handle0(View view) {
        setANumber('0');
    }

    public void handle1(View view) {
        setANumber('1');
    }

    public void handle2(View view) {
        setANumber('2');
    }

    public void handle3(View view) {
        setANumber('3');
    }

    public void handle4(View view) {
        setANumber('4');
    }

    public void handle5(View view) {
        setANumber('5');
    }

    public void handle6(View view) {
        setANumber('6');
    }

    public void handle7(View view) {
        setANumber('7');
    }

    public void handle8(View view) {
        setANumber('8');
    }

    public void handle9(View view) {
        setANumber('9');
    }

    public void handlePlus(View view) {
        setOperation('+');
    }

    public void handleSubtract(View view) {
        setOperation('-');
    }

    public void handleMultiplication(View view) {
        setOperation('x');
    }

    public void handleSplit(View view) {
        setOperation('/');
    }

    public void handlePoint(View view) {
        setANumber('.');
    }

    public void handleDelete(View view) {
        numbers.clear();
        operations.clear();
        etResult.setText("0");
    }

    public void handleEqual(View view) {
        if (numbers.size() < 2) {
            return;
        }

        float total = 0;
        int positionNumber = 2;
        float numberA;
        float numberB;

        for (int i = 0; i < operations.size(); i++) {
            numbers.size();
            if (i == 0) {
                numberA = numbers.get(0);
                numberB = numbers.get(1);
            } else {
                numberA = total;
                numberB =  numbers.get(positionNumber-1);
            }
            total = calculate(operations.get(i), numberA, numberB);

        }
        numbers.clear();
        numbers.add(total);
        operations.clear();

        DecimalFormat format = new DecimalFormat("####.####");
        etResult.setText(format.format(total));
    }

    public void handleBack(View view) {
        finish();
    }

    private float calculate(char operation, float numberA, float numberB) {
        float total = 0;
        switch (operation) {
            case '+':
                total = numberA + numberB;
                break;
            case 'x':
                total = numberA * numberB;
                break;
            case '/':
                total = numberA / numberB;
                break;
            case '-':
                total = numberA - numberB;
                break;
        }
        return total;
    }

    private void setANumber(char number) {
        if (numbers.size() == operations.size()) {
            etResult.setText(String.valueOf(number));
            numbers.add(Float.parseFloat(String.valueOf(number)));
        } else {
            etResult.setText(etResult.getText().toString() + number);
            numbers.set(numbers.size()-1, Float.parseFloat(etResult.getText().toString()));
        }
    }

    private void setOperation(char operation) {
        if (numbers.size() > operations.size()) {
            operations.add(operation);
        } else {
            operations.set(operations.size()-1, operation);
        }
    }

}