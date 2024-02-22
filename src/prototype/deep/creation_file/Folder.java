package prototype.deep.creation_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Folder implements Cloneable {

	private List<File> files;

	public Folder() {
		files = new ArrayList<>();
	}

	public void addFile(File file) {
		this.files.add(file);
	}
	
	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "Folder [files=" + files + "]";
	}
	
	@Override
	public Folder clone() throws CloneNotSupportedException{
		Folder folder = ( Folder ) super.clone();
		folder.files = new ArrayList<>(this.files);
		return folder;
	}

	@Override
	public int hashCode() {
		return Objects.hash(files);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Folder other = (Folder) obj;
		return Objects.equals(files, other.files);
	}
	
	

}
