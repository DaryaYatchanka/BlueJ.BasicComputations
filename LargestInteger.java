 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int first = 0;
        int result =0;
        if (integers[0]>integers[1]){
            first = integers[0];
        }
        else {
            first = integers[1];
        }
        if (first>integers[2]){
            result = first;
        }
        else {
            result = integers[2];
        }
        
        
        
        return result;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int result = Math.max(integers[0], integers[1]);
        return Math.max(result, integers[2]);
    }
}
