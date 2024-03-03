package proxy.image;

public class Client {

	public static void main(String[] args) {

		Image image = new ProxyImage("image.jpg");
		// The actual image is loaded only when the show() method is called
		image.show();
		// The actual image is already uploaded, so it will not be uploaded again
		image.show();

	}

}
