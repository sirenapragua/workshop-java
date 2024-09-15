package org.example.homeWork1.Point;

class Point implements Movable {
    private int x;
    private int y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        y -= 1;
    }

    @Override
    public void moveDown() {
        y += 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }

    @Override
    public void print(String message) {
        System.out.println(message + ": " + this);
    }
}