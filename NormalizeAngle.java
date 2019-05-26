 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
     angle =  angle % 360;
       
     angle = (angle + 360) % 360;  

     
     if (angle > 359)  
     angle -= 360;  
     return angle ;
    
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int angle = java.lang.Math.floorMod(integer, 360); 
        return angle;


    }

    public static void main(String[] args){

    }
}
