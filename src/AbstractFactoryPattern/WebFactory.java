package AbstractFactoryPattern;

public class WebFactory extends ComponentFactory{
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Table createTable() {
        return new WebTable();
    }
}
