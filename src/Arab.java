public class Arab {
    public static boolean arabNumProv(String x){
        try{
            Integer.parseInt(x);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
