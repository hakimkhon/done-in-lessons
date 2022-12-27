package uz.hakimkhon.lesson.model;

public class QuizData {
    private String Savol;
    private int imgSavol;
    private String imgSavolMatni;
    private String variant1;
    private String variant2;
    private String variant3;
    private String variant4;
    private String javob;

    public QuizData(String Savol, int imgSavol, String imgSavolMatni, String variant1, String variant2, String variant3, String variant4, String javob) {
        this.Savol = Savol;
        this.imgSavol = imgSavol;
        this.imgSavolMatni = imgSavolMatni;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
        this.variant4 = variant4;
        this.javob = javob;
    }

    public String getSavol() {
        return Savol;
    }

    public int getImgSavol() {
        return imgSavol;
    }

    public String getImgSavolMatni() {
        return imgSavolMatni;
    }

    public String getVariant1() {
        return variant1;
    }

    public String getVariant2() {
        return variant2;
    }

    public String getVariant3() {
        return variant3;
    }

    public String getVariant4() {
        return variant4;
    }

    public String getJavob() {
        return javob;
    }
}
