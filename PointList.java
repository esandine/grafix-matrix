import java.util.LinkedList;
//a series of connected lines
public class PointList{
    //points is the list of coordinates for a connected line
    private LinkedList<Coor> points;
    //addCoor adds a new endpoint to the line
    public void addCoor(Coor c){
	points.add(c);
    }
    public void printCoors(){
	LinkedList<Coor> newPoints = new LinkedList<Coor>();
	Coor next = points.poll();
	String r1 = "";
	String r2 = "";
	String r3 = "";
	String r4 = "";
	while(next!=null){
	    newPoints.add(next);
	    next = points.poll();
	    r1+=next.getX()+" ";
	    r2+=next.getY()+" ";
	    r3+=next.getZ()+" ";
	    r4+=next.getL()+" ";
	}
	points = newPoints;
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);	
    }
    public PointList(){
	points = new LinkedList<Coor>();
    }
    
}
