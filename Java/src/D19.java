import java.util.ArrayList;
import java.util.Arrays;

public class D19 {
    public static void main(String[] args) {
    	System.out.println(accum("ZpglnRxqenU"));
    	
    	
    }
    
    
    public static String accum(String s) {
    	ArrayList<String> accumArr = new ArrayList<>(Arrays.asList(s.split("")));
    	String stringToReturn = "";
    	
    	
    	
    	for(int indexAcumArr=0; indexAcumArr< accumArr.size(); indexAcumArr++) {
    		String appendThis = accumArr.get(indexAcumArr).toUpperCase();
    		stringToReturn+=appendThis;
    		appendThis = appendThis.toLowerCase();
    		for(int repeatXTimes = 0; repeatXTimes < indexAcumArr; repeatXTimes++) {
    			
    			stringToReturn+=appendThis;
    		}

    		stringToReturn+="-";
    	}
    	
        return stringToReturn.substring(0, stringToReturn.length()-1);
    	
    }
}
