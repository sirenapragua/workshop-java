package org.example.homeWork1.Clock;

public class ClockDemo {
        public static void main(String[] args) {

            Clock clock = new Clock();
            clock.setHours(23);
            clock.setMinutes(59);
            clock.setSeconds(59);

            clock.readTime();
            clock.tick();
            clock.readTime();
            clock.tick();
            clock.readTime();
        }
    }

