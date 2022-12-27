package uz.hakimkhon.lesson.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.hakimkhon.lesson.R;
import uz.hakimkhon.lesson.model.QuizData;

public class DataSource {
    private List<QuizData> questions = new ArrayList<>();
    boolean shuffleState = false;
    public List<QuizData> getQuestions(){
        questions.add(new QuizData("O'zbekistonning poytaxti?", 0, null, "Andijon", "Buxoro", "Samarqand", "Toshkent", "Toshkent"));
        questions.add(new QuizData("Eng uzun daryo?", 0, null, "Sirdaryo", "Nil", "Norin daryosi", "Amu daryo", "Nil"));
        questions.add(new QuizData(null, R.drawable.it, "Bu xayvonning nomi nima?", "tovuq", "mol", "it", "mushuk", "it"));
        questions.add(new QuizData(null, R.drawable.mushuk, "Bu xayvonning nomi nima?", "tovuq", "mol", "it", "mushuk", "mushuk"));
        questions.add(new QuizData("Milliy valyuta", 0, null, "dollar", "so'm", "tange", "manat", "so'm"));
        if (shuffleState)
            Collections.shuffle(questions);
        return questions;
    }
    public void setShuffle(boolean shuffle){
        shuffleState = shuffle;
    }

}
