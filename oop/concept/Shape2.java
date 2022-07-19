package in.oop.concept;

public abstract class Shape2 {
	private String color;
	private int borderwidth;
	public static final double PI= 3.14; 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
    public abstract double area() 	;	
}
