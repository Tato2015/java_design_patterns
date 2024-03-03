package proxy.image;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage( String fileName ) {
		this.fileName = fileName;
		loadImageFromDisk(fileName);
	}
	
	private void loadImageFromDisk( String fileName ) {
		System.out.println("Loading image " + fileName + " from the disk." );
	}
	
	@Override
	public void show() {
		System.out.println("Showing image " + fileName);
		
	}

	
	
}
