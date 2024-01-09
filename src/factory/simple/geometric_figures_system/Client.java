package factory.simple.geometric_figures_system;

public class Client {

	public static void main(String[] args) {
		System.out.println(" ***** Simple Factory Pattern ***** ");
		GeometricFigureFactory factory = new GeometricFigureFactory();

		IGeometricFigure iGeometricFigure = factory.createGeometricFigure(Type.SQUARE);

		executeOperations(iGeometricFigure);
		((Square) iGeometricFigure).displayInformation();

		iGeometricFigure = factory.createGeometricFigure(Type.TRIANGLE);
		executeOperations(iGeometricFigure);
		((Triangle) iGeometricFigure).displayInformation();

	}

	public static void executeOperations(IGeometricFigure iGeometricFigure) {
		iGeometricFigure.calculateArea();
		iGeometricFigure.calculatePerimeter();
	}

}
