package AbstractFactoryPattern;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        createButtonAndTable("Swing");

    }

    public static void createButtonAndTable(String factoryType){
        ComponentFactory factory = null;
        if(Objects.equals(factoryType, "Swing")){
            factory = new SwingFactory();
        } else if(Objects.equals(factoryType, "Web")){
            factory = new WebFactory();
        } else {
            System.out.println("Invalid factory type");
            return;
        }
        Button button = factory.createButton();
        Table table = factory.createTable();
        button.paint();
        table.print();
    }
}
