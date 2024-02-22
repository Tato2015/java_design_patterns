package prototype.deep.creation_file;

public class Client {

	public static void main(String[] args) {
		
		
		Folder folder = new Folder();
		folder.addFile(new File("File1.txt", 100));
		folder.addFile(new File("File2.txt", 200));
		
		try {
			Folder folderClone = folder.clone();
			folderClone.addFile(new File("File3.txt",300));
			
			System.out.println("\n **** Original Folder **** ");
			folder.getFiles().stream().forEach(System.out::println);
			
			System.out.println("\n **** Clone Folder **** ");
			folderClone.getFiles().stream().forEach(System.out::println);
			
			System.out.println("\n They have the same value : " +( folder.equals(folderClone) ) );
			System.out.println("\n They point the same memory space : " +( folder == folderClone ) );
			
		} catch (CloneNotSupportedException  e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
