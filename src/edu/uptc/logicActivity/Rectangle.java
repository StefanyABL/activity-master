package edu.uptc.logicActivity;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Figure {
	private int width ;
	private int height ;
	public Rectangle (Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}



}
