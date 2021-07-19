package edu.uptc.logicActivity;

import java.awt.Graphics;
import java.util.Calendar;

public class Human  implements ActionsFigure{
	private String nombre;
	private Calendar birthay ;

	public Human(String nombre, Calendar birthay) {
		super();
		this.nombre = nombre;
		this.birthay = birthay;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getBirthay() {
		return birthay;
	}
	public void setBirthay(Calendar birthay) {
		this.birthay = birthay;
	}
	@Override
	public double calcArea() {
		double year;
		Calendar  now= Calendar.getInstance();
		int years =now.get(Calendar.YEAR)-birthay.get(Calendar.YEAR);
		int month = now.getMaximum(Calendar.MONTH)-birthay.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH)-birthay.get(Calendar.DAY_OF_MONTH);
		if (month < 0||(month==0&&day<0)) {
			years --;
			
		}
		return years ;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	

}
