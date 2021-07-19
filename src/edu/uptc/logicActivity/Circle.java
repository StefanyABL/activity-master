package edu.uptc.logicActivity;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends Figure {
	private double radio ;

	public Circle(Point point, int radio) {
		super(point);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}



}
