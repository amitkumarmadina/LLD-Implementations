package L8.Factory_Pattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input) {

        case "CIRCLE": 
        return new circle();
        case "RECTANGLE": 
        return new Rectangle();
        default:
            return null;
    }
}
}
