package com.example.finalprojectola;


public class contact {
    int no;
    String name;
    int image;

    public contact(int no, String name, int image) {
        this.no = no;
        this.name = name;
        this.image = image;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
