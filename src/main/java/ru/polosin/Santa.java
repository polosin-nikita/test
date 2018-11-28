package ru.polosin;

public class Santa {
    private int x, y;

    private int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    private void setX(int x) {
        this.x = x;
    }

    private void setX(String x) {
        try {
            Integer.parseInt(x);
            this.x = Integer.parseInt(x);
        } catch (NumberFormatException e) {
            System.out.println("Entered value isn't a number");
        }
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setY(String y) {
        try {
            Integer.parseInt(y);
            this.y = Integer.parseInt(y);
        } catch (NumberFormatException e) {
            System.out.println("Entered value isn't a number");
        }
    }


    public static void main(String[] args) {

        Santa santa = new Santa();
        santa.setX(5);
        santa.setX(10);
        System.out.println(santa.getX());
        santa.setX("4");
        System.out.println(santa.getX());
        santa.setX("7f");
        System.out.println(santa.getX());


    }
}

