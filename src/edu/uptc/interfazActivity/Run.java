package edu.uptc.interfazActivity;

import java.util.GregorianCalendar;
import java.awt.Point;
import java.util.Calendar;

import edu.uptc.logicActivity.*;

public class Run {
	public static void main(String[] args) {
//		Rectangle figure = new Rectangle (new  Point(10, 10),20,40);
//		System.out.println(figure.calcArea());
		Figure rectangle  = new Rectangle  (new Point(10,10), 15, 20);
		Figure circle  = new Circle (new Point (20, 20),5);
		Figure triangle = new Triangle (new Point(30,30),15 ,20);
		Human human = new Human( "Lola", new GregorianCalendar( 2000, 7, 12) );
		viewObject (rectangle);
		viewObject (circle);
		viewObject (triangle);
		viewObject(human);
		
		
	}
	
	public static void viewObject (Human human){
		System.out.println(human.calcArea());
	}
	public static void viewObject (Figure aux){
		System.out.println(aux.calcArea());
	}
	

}
