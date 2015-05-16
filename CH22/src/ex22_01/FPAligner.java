package ex22_01;

public class FPAligner {
    public void alignFP(double[] doubles, int raw) {
        if (raw < 1 || raw > 7) { 
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < doubles.length; i++) {
            System.out.printf("% .5e ", doubles[i]);
            if(i%raw == raw-1){
            	System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        double[] floatData = new double[20];
        for(int i = 0; i < floatData.length; i++){
        	floatData[i] = Math.random() / Math.random();
        }
        FPAligner fpa = new FPAligner();
        for(int i = 1; i < 7; i++){
        	fpa.alignFP(floatData, i);
        	System.out.println();
        }
    }
    
}
