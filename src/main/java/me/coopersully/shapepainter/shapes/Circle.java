package me.coopersully.shapepainter.shapes;

import java.awt.*;

public class Circle extends Shape {

    protected int widthheight = 10;

    public Circle(int x, int y, int widthheight, String color) {
        super(x, y, color);
        this.widthheight = widthheight;
    }

    @Override
    public void draw(Graphics g) {
        if (g==null)
            System.out.println("drawing a " + widthheight + " " + color + " circle");
        else {
            g.setColor(color);
            g.drawOval(x, y, widthheight, widthheight);
        }
    }

}
