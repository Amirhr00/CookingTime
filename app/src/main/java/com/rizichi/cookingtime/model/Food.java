package com.rizichi.cookingtime.model;

public class Food {
    String name;
    int pic;
    int time;

    public Food(String name, int pic, int time) {
        this.name = name;
        this.pic = pic;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
