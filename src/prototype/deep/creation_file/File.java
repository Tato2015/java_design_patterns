package prototype.deep.creation_file;

public class File implements Cloneable {

	private String name;
	private int size;
	
	public File(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", size=" + size + "]";
	}
	
	@Override
	public File clone() throws CloneNotSupportedException {
		return ( File ) super.clone();
	}
	
	
}
