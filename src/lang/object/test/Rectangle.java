package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "h=" + h +
                ", w=" + w +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return w == rectangle.w && h == rectangle.h;
    }
}
