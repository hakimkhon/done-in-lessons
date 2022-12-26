package uz.hakimkhon.lesson.model;

public class QuiaData {
    private String textSavol;
    private int imgSavol;
    private String imgSavolMatni;
    private String variant1;
    private String variant2;
    private String variant3;
    private String variant4;
    private String javob;

    public QuiaData(String textSavol, int imgSavol, String imgSavolMatni, String variant1, String variant2, String variant3, String variant4, String javob) {
        this.textSavol = textSavol;
        this.imgSavol = imgSavol;
        this.imgSavolMatni = imgSavolMatni;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
        this.variant4 = variant4;
        this.javob = javob;
    }

    public String getTextSavol() {
        return textSavol;
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
