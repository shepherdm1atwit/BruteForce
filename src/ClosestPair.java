import java.awt.Point;
import java.lang.Math;
import java.util.ArrayList;

public class ClosetPair {

    /**
     * @param args the command line arguments
     */
    
    public static Integer closestPoint(ArrayList<Point> p){
    ArrayList<Point> arrL = new ArrayList<Point>();

        Double d = null ;
        


        for(int i=1;i < p.size(); i++ ){
            for(int j=i+1;j < p.size();j++ ){
                d = (Math.min(d, Math.sqrt(Math.pow((p.get(i).x-p.get(j).x),2)) + (Math.pow((p.get(i).y-p.get(j).y),2))));
                
            }
        }


        return d;
    }
    
}
