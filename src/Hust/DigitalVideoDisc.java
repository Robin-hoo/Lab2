package Hust;

public class DigitalVideoDisc {
    private String title; //tieu de
    private String category;//danh muc
    private String director;//tac gia
    private int length;//
    private float cost;//gia

    // Constructor theo tieu de
    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    //COnstructor theo tieu de danh muc va gia thanh
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
   //Constructor theo tieu de danh muc tac gia gia thanh
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
  //theo tat ca thuoc tinh
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

 
}

