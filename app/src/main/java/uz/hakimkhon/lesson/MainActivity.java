package uz.hakimkhon.lesson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textSavolNomer, textBall, textSavol, imgSavolMatni;
    ImageView imgSavol;
    RadioGroup radioGroup;
    RadioButton radio1, radio2, radio3, radio4;
    Button btnTasdiqlash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void loadView(){
        textSavolNomer = findViewById(R.id.text_savol);
        textBall = findViewById(R.id.text_ball);
        textSavol = findViewById(R.id.text_savol_matni);
        imgSavolMatni = findViewById(R.id.image_savol_matni);
        imgSavol = findViewById(R.id.image_savol);
        radioGroup = findViewById(R.id.radioGroup);
        btnTasdiqlash = findViewById(R.id.button_tasdiqlash);
        radio1 = findViewById(R.id.radioButton);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);
        radio4 = findViewById(R.id.radioButton4);
    }
}