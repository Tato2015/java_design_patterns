package factory.simple.geometric_figures_system;

public class GeometricFigureFactory {
	
	public IGeometricFigure createGeometricFigure(Type type) {
		
		IGeometricFigure iGeometricFigure;
		
		if(type.equals(Type.SQUARE)) {
			iGeometricFigure = new Square(10);
		} else if(type.equals(Type.TRIANGLE)) {
			iGeometricFigure = new Triangle(10, 8, 6, 7);
		}else {
			System.out.println("Unknown geoetric figure ");
			throw new IllegalArgumentException("Unknown geomteric figure cannot be instantiated.");
		}
		
		return iGeometricFigure;
		
	}

}
