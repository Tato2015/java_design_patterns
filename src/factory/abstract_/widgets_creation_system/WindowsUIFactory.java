package factory.abstract_.widgets_creation_system;

public class WindowsUIFactory extends UIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}

	
	
}
