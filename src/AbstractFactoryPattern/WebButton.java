package AbstractFactoryPattern;

public class WebButton extends Button{
    @Override
    public void paint() {
        System.out.println("WebButton");
    }
}
