package factory.abstract_.widgets_creation_system;

public class MacUIFactory extends UIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

	
	
}
