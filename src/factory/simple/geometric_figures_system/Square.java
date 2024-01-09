package factory.simple.geometric_figures_system;

public class Square extends GeometricFigure implements IGeometricFigure {

	private int side;

	public Square(int side) {
		this.side = side;
		System.out.println("\nSquare created ! ");
	}

	@Override
	public void calculateArea() {
		this.area = this.side * this.side;
	}

	@Override
	public void calculatePerimeter() {
		this.perimeter = this.side * 4;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
