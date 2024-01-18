package factory.abstract_.widgets_creation_system;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println(" ***** ABSTRACT FACTORY PATTERN ***** ");
		UIFactory factory;
		factory = new WindowsUIFactory();
		Button button = factory.createButton();
		CheckBox checkBox = factory.createCheckBox();
		button.render();
		checkBox.render();
		
		factory = new MacUIFactory();
		button = factory.createButton();
		checkBox = factory.createCheckBox();
		button.render();
		checkBox.render();
		
	}

}
