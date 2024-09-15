package org.example.homeWork1.Point;

public class PointDemo {
        public static void main(String[] args) {
            Point point = new Point();
            point.print("Начальное положение");

            point.moveRight();
            point.moveUp();
            point.print("После перемещения вправо и вверх");

            point.moveLeft();
            point.moveDown();
            point.print("После перемещения влево и вниз");

            point.setX(5);
            point.setY(-3);
            point.print("После установки новых координат");

            for (int i = 0; i < 3; i++) {
                point.moveRight();
            }
            point.print("После перемещения на 3 единицы вправо");

            point.print("Текущие координаты: X = " + point.getX() + ", Y = " + point.getY());
        }
    }

