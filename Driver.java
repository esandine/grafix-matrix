import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Driver{
    public static void main(String[] args){
	Coor c1 = new Coor(12,12,12);
	Coor c2 = new Coor(16,16,16);
	Coor c3 = new Coor(66,66,66);
	Coor c4 = new Coor(200,203,200);
	Coor c5 = new Coor(300,203,211);
	Coor c6 = new Coor(400,303,300);
	Grafix g = new Grafix();
	Coor[] coors = {c1,c2,c3};
	Coor[] coors2 = {c4,c5,c6};
	g.addEdge(coors);
	g.addEdge(coors2);
	Pixel p = new Pixel(200,0,0);
	g.printEdgeList();
	g.writeCoors(p);
	g.write("edgy.ppm");
    }
}
