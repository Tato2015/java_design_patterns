package factory.simple.geometric_figures_system;

public class Triangle extends GeometricFigure implements IGeometricFigure {

	private int base;
	private int height;
	private int sideA;
	private int sideB;

	public Triangle(int base, int height, int sideA, int sideB) {
		this.base = base;
		this.height = height;
		this.sideA = sideA;
		this.sideB = sideB;
		System.out.println("\nTriangle created ! ");
	}

	@Override
	public void calculateArea() {
		this.area = ( this.base * this.height ) / 2;
	}

	@Override
	public void calculatePerimeter() {
		this.perimeter = this.sideA + this.sideB + this.base;
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

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

}
