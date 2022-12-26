package uz.hakimkhon.lesson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import uz.hakimkhon.lesson.data.DataSource;
import uz.hakimkhon.lesson.model.QuiaData;

public class MainActivity extends AppCompatActivity {
    TextView textSavolNomer, textBall, textSavol, imgSavolMatni;
    ImageView imgSavol;
    RadioGroup radioGroup;
    RadioButton radio1, radio2, radio3, radio4;
    Button btnTasdiqlash;

    DataSource dataSource = new DataSource();
    List<QuiaData> quiaData = new ArrayList<>();

    int questionIndex = 0;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadView();
        dataSource.setShuffle(true);
        quiaData.addAll(dataSource.getQuestions());
        setActiveQuestion(questionIndex);
    }

    void loadView(){
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
    void setActiveQuestion(int index){
        QuiaData joriySavol = quiaData.get(index);
        if (joriySavol.getTextSavol() == null && joriySavol.getImgSavol() != 0){
            imgSavol.setVisibility(View.VISIBLE);
            imgSavolMatni.setVisibility(View.VISIBLE);
            textSavol.setVisibility(View.INVISIBLE);

            imgSavol.setImageResource(joriySavol.getImgSavol());
            imgSavolMatni.setText(joriySavol.getImgSavolMatni());
        }
        else {
            imgSavol.setVisibility(View.INVISIBLE);
            imgSavolMatni.setVisibility(View.VISIBLE);
            textSavol.setVisibility(View.VISIBLE);

            textSavol.setText(joriySavol.getTextSavol());
            imgSavol.setImageResource(0);
            imgSavolMatni.setText("");
        }
        radio1.setText(joriySavol.getVariant1());
        radio2.setText(joriySavol.getVariant2());
        radio3.setText(joriySavol.getVariant3());
        radio4.setText(joriySavol.getVariant4());

        textSavol.setText("Savol: " + (++index));
    }
}