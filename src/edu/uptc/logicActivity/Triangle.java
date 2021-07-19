package edu.uptc.logicActivity;

import java.awt.Graphics;
import java.awt.Point;

public class Triangle extends Figure {
	private int base;
	private int height;
	
	public Triangle(Point point, int base, int height) {
		super(point);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
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
		return (base*height)/2;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
}
