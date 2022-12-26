package uz.hakimkhon.lesson.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import uz.hakimkhon.lesson.R;
import uz.hakimkhon.lesson.model.QuiaData;

public class DataSource {
    private List<QuiaData> questions = new ArrayList<>();
    boolean shuffleState = false;
    public List<QuiaData> getQuestions(){
        questions.add(new QuiaData("O'zbekistonning poytaxti?", 0, null, "Andijon", "Buxoro", "Samarqand", "Toshkent", "Toshkent"));
        questions.add(new QuiaData(null, R.drawable.it, "Bu xayvonning bomi nima?", "tovuq", "mol", "it", "mushuk", "mushuk"));
        questions.add(new QuiaData("Eng uzun daryo?", 0, null, "Sirdaryo", "Nil", "Norin daryosi", "Amu daryo", "Nil"));
        questions.add(new QuiaData(null, R.drawable.mushuk, "Bu xayvonning bomi nima?", "tovuq", "mol", "it", "mushuk", "mushuk"));
        questions.add(new QuiaData("Milliy valyuta", 0, null, "dollar", "so'm", "tange", "manat", "so'm"));
        if (shuffleState)
            Collections.shuffle(questions);
        return questions;
    }
    public void setShuffle(boolean shuffle){
        shuffleState = shuffle;
    }

}
