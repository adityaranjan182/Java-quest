public class speedconverter{
    public static long tomilesperhour(double killoperhour){
        if(killoperhour<0)
            return -1;
        else{

        
        long a = Math.round(killoperhour/1.609);
        
        
        return a;
        }
        
        

    }
}