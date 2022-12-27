package uz.hakimkhon.lesson;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.hakimkhon.lesson.data.DataSource;
import uz.hakimkhon.lesson.model.QuizData;

public class MainActivity extends AppCompatActivity {
    TextView textSavolNomer, textBall, textSavolMatni, imgSavolMatni;
    ImageView imgSavol;
    RadioGroup radioGroup;
    RadioButton radio1, radio2, radio3, radio4;
    Button btnTasdiqlash;

    DataSource dataSource = new DataSource();
    List<QuizData> quizData = new ArrayList<>();

    int questionIndex = 0;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadView();
        dataSource.setShuffle(true);
        quizData.addAll(dataSource.getQuestions());
        setActiveQuestion(questionIndex);

        btnTasdiqlash.setOnClickListener(v ->{
            int checkedButtonId = radioGroup.getCheckedRadioButtonId();
            if (checkedButtonId == -1){
                Toast.makeText(this, "Biror bir javobni belgilang", Toast.LENGTH_SHORT).show();
            }
            else {
                RadioButton selectedRadio = findViewById(checkedButtonId);
                String text = selectedRadio.getText().toString();
                if (text.equals(quizData.get(questionIndex).getJavob())){
                    textBall.setText("Ball: " + (++score));
                }
                if (questionIndex >= quizData.size()-1){
                    textBall.setText("");
                    textSavolNomer.setText("");
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder
                            .setTitle("O'yin tugadi")
                            .setMessage("Savollar soni: " +(questionIndex + 1) + "\nTo'gri javoblar: " + score)
                            .setPositiveButton("Qayta boshlash", (dialogInterface, i) ->restart())
                            .setNegativeButton("Chiqish", ((dialogInterface, i) ->finish()));
                    Dialog dialog = builder.create();
                    dialog.show();

                }
                else {
                    radioGroup.clearCheck();
                    setActiveQuestion(++questionIndex);
                }
            }
        });
    }

    void setActiveQuestion(int index){
        QuizData joriySavol = quizData.get(index);
        if (joriySavol.getSavol() == null && joriySavol.getImgSavol() != 0){
            imgSavol.setVisibility(View.VISIBLE);
            imgSavolMatni.setVisibility(View.VISIBLE);
            textSavolMatni.setVisibility(View.INVISIBLE);

            imgSavol.setImageResource(joriySavol.getImgSavol());
            imgSavolMatni.setText(joriySavol.getImgSavolMatni());
        }
        else {
            imgSavol.setVisibility(View.INVISIBLE);
            imgSavolMatni.setVisibility(View.VISIBLE);
            textSavolMatni.setVisibility(View.VISIBLE);

            textSavolMatni.setText(joriySavol.getSavol());
            imgSavol.setImageResource(0);
            imgSavolMatni.setText("");
        }
        radio1.setText(joriySavol.getVariant1());
        radio2.setText(joriySavol.getVariant2());
        radio3.setText(joriySavol.getVariant3());
        radio4.setText(joriySavol.getVariant4());
        textSavolNomer.setText("Savol: " + (++index));

    }
    void restart(){
        questionIndex = 0;
        score = 0;
        Collections.shuffle(quizData);
        setActiveQuestion(questionIndex);
        textSavolNomer.setText("Savol: 1");
        textBall.setText("Ball: 0");
        radioGroup.clearCheck();
    }

    void loadView(){
        textSavolNomer = findViewById(R.id.text_savol);
        textBall = findViewById(R.id.text_ball);
        textSavolMatni = findViewById(R.id.text_savol_matni);
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