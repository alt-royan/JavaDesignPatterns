package Structure.Bridge;

public abstract class Shape {
    protected int x;
    protected int y;
    protected Drawer drawer;

    protected Shape(Drawer drawer){
        this.drawer=drawer;
    }

    public abstract void draw();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
