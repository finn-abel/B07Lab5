package lab4;

public class Rectangle{
    Point A;
    Point B;
    Point C;
    Point D;

    public Rectangle(Point A, Point B, Point C, Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double [] getSides(){
        double lengths[] = new double[3];
        double sides[] = new double[2];

        lengths[0] = this.A.distance(this.B);
        lengths[1] = this.A.distance(this.C);
        lengths[2] = this.A.distance(this.D);      
        Arrays.sort(lengths);
        //get 2 smallest sides to avoid using diagonal
        sides[0] = lengths[0];
        sides[1] = lengths[1];
        return sides;
    }

    public double Area(){
        double [] sides = this.getSides();
        return sides[0]*sides[1];
    }

    public double Perimeter(){
        double [] sides = this.getSides();
        return 2*(sides[0]+sides[1]);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Rectangle))
            return false;
        Rectangle other = (Rectangle)o;
        int count=0;
        Point [] thisPoints = {this.A, this.B, this.C, this.D};
        Point [] oPoints = {other.A, other.B, other.C, other.D};

        for(Point x:thisPoints){            // iterate through current object's points
            count=0;
            for(Point y: oPoints){          
                if(x.equals(y))
                    count++;
            }
            if(count!=1)                    //ensure EXACTLY one of each rectangle's points match with the other rectangle's points
                return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return (this.A.hashCode() + this.B.hashCode()) * (this.C.hashCode() - this.D.hashCode());
    }
}