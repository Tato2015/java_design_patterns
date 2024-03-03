package proxy.security;

public class RealFile implements File {

	private String name;
	
	public RealFile( String name ) {
		this.name = name;
	}
	
	@Override
	public void access() {
		System.out.println("Accessing to the file " + name);
		
	}

}
