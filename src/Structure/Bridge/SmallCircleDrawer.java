package Structure.Bridge;

public class SmallCircleDrawer implements Drawer{
    public static final double radiusMultiplier = 0.25;

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
    }
}
