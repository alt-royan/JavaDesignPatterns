package Structure.Bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Shape[] shapes ={
                new Circle(3,4, 10, new SmallCircleDrawer()),
                new Circle(3,4, 10, new LargeCircleDrawer()),
        };

        for (Shape next : shapes){
            next.draw();
        }
    }
}
