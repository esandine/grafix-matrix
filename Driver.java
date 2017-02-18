import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Driver{
    public static void main(String[] args){
	Coor c1 = new Coor(12,12,12);
	Coor c2 = new Coor(16,16,16);
	Coor c3 = new Coor(66,66,66);
	PointList p = new PointList();
	p.addCoor(c1);
	p.addCoor(c2);
	p.addCoor(c3);
	p.printCoors();
	p.printCoors();
    }
}
