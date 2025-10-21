public class Circle {
    private Point center;
    private Double radius;

    public Circle() 
    {
        center = new Point(0, 0);
        radius = 0;
    }

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double xVal, Double yVal, double radius)
    {
        this.center = new Point(xVal, yVal);
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public boolean containedIn(Point p)
    {
        return (center.distance(p) <= radius);
    }

    public double getArcLength(double angle)
    {
        return (angle / 360) * getCircumference();
    }
}