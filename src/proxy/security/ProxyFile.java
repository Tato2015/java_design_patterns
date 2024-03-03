package proxy.security;

public class ProxyFile implements File{
	
	private String name;
	private RealFile realFile;
	private String user;
	
	public ProxyFile( String name, String user ) {
		this.name = name;
		this.user = user;
	}
	

	@Override
	public void access() {
		if( hasAccess(user) ) {
			if( realFile == null ) {
				realFile = new RealFile(name);
			}
			realFile.access();
		}else {
			System.out.println("Access denied to the user " + user);
		}
		
	}
	
	
	private boolean hasAccess( String user ) {
		return user.equals("admin");
	}

}
