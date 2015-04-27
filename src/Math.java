import java.util.ArrayList;
import java.util.List;


public class Math {
	
	public static List<Double> doMath(int x1, int x1p, int z1, int z1p, int x2, int x2p, int z2, int z2p) {

		double slopeFirst = getSlope(x1, x1p, z1, z1p);
		double slopeSecond = getSlope(x2, x2p, z2, z2p);
		
		double yIntFirst = getYInt(slopeFirst, x1, z1);
		double yIntSecond = getYInt(slopeSecond, x2, z2);
		
		double xCord = getXCord(slopeFirst, yIntFirst, slopeSecond, yIntSecond);
		double yCord = getYCord(xCord, slopeFirst, yIntFirst);
		
		List<Double> xyCord = new ArrayList<Double>();
		xyCord.add(xCord);
		xyCord.add(yCord);
		
		return xyCord;
	}
	
	public static double getSlope(int x1, int x1p, int z1, int z1p) {
		float run = x1p - x1;
		float rise = z1p - z1;
		double slope = rise / run;
		return slope;
	}
	public static double getYInt(double Slope, double coEff, int z1) {
		return (z1 - (coEff * Slope));
	}
	public static double getXCord(double slopeFirst, double yIntFirst, double slopeSecond, double yIntSecond) {
		yIntSecond -= yIntFirst;
		slopeFirst -= slopeSecond;
		
		double xCord = yIntSecond * (1/slopeFirst);
		return xCord;
	}
	public static double getYCord(double xCord, double coEff, double yIntercept) {
		double yCord = (coEff * xCord) + yIntercept;
		return yCord;
	}
}
