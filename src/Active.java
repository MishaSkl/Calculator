public class Active {
    public static boolean provAct(String x){
        if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
            return false;
        } else {
            return true;
        }
    }
}
