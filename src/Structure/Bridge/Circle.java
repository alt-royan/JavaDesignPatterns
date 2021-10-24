package Structure.Bridge;

public class Circle extends Shape{

    private int radius;

    protected Circle(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        setX(x);
        setY(y);
        setRadius(radius);
    }

    @Override
    public void draw() {
        drawer.draw(x,y, radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
