package AbstractFactoryPattern;

public class SwingFactory extends ComponentFactory{
    public Button createButton(){
        return new SwingButton();
    }
    public Table createTable(){
        return new SwingTable();
    }
}
