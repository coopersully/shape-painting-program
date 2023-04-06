package me.coopersully.shapepainter.shapes;

import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape {

    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected int x3;
    protected int y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String color) {
        super(0, 0, color); // we are never going to use Shape's x, y attribute so let's make it 0, 0 to emphasize that point
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void draw(Graphics g) {
        if (g==null)
            System.out.println("drawing some sort of " + color + " triangle");
        else {
            g.setColor(color);
            Polygon triangle = new Polygon(new int[] {x1, x2, x3}, new int[] {y1, y2, y3}, 3);
            g.drawPolygon(triangle);
        }
    }
    
}
