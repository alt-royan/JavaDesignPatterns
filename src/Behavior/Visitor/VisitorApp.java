package Behavior.Visitor;

public class VisitorApp {
    public static void main ( String [] args ) {
        Point p = new Point2d( 1, 2 );
        Visitor v = new Visitor1();
        p.accept( v );
        System.out.println( p.getMetric() );
        System.out.println("=================");
        Visitor w = new Visitor2();
        p.accept( w );
        System.out.println( p.getMetric() );
    }
}

interface Visitor {
     void visit ( Point2d p );
    void visit ( Point3d p );
}

abstract class Point {
    public abstract void accept ( Visitor v );
    private double metric = -1;
    public double getMetric () {
        return metric;
    }
    public void setMetric ( double metric ) {
        this.metric = metric;
    }
}

class Point2d extends Point {
    public Point2d ( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public void accept ( Visitor v ) {
        v.visit( this );
    }

    private double x;
    public double getX () { return x; }

    private double y;
    public double getY () { return y; }
}

class Point3d extends Point {
    public Point3d ( double x, double y, double z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void accept ( Visitor v ) {
        v.visit( this );
    }

    private double x;
    public double getX () { return x; }

    private double y;
    public double getY () { return y; }

    private double z;
    public double getZ () { return z; }
}

class Visitor1 implements Visitor {
    public void visit ( Point2d p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() ) );
    }
    public void visit ( Point3d p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() + p.getZ()*p.getZ() ) );
    }
}

class Visitor2 implements Visitor {
    public void visit ( Point2d p ) {
        double ax = Math.abs( p.getX() );
        double ay = Math.abs( p.getY() );
        p.setMetric( ax>ay ? ax : ay );
    }
    public void visit ( Point3d p ) {
        double ax = Math.abs( p.getX() );
        double ay = Math.abs( p.getY() );
        double az = Math.abs( p.getZ() );
        double max = ax>ay ? ax : ay;
        if ( max<az ) max = az;
        p.setMetric( max );
    }
}
