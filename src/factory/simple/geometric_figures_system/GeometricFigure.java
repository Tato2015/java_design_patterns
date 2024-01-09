package factory.simple.geometric_figures_system;

public class GeometricFigure {

	protected double area;
	protected double perimeter;
	
	public GeometricFigure() {
		super();
	}

	public void displayInformation() {
		System.out.println("Area : " + this.area);
		System.out.println("Perimeter : " + this.perimeter);
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
}
