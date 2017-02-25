import java.util.Arrays;

/**
 * Created by Jay on 2/25/2017.
 */
public class stringPermute {
    public boolean compute(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0; i<s1.length(); i++){
                if(ch1[i]==ch2[i]){
                    continue;
                }
                else
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        stringPermute sp = new stringPermute();
        System.out.println(sp.compute("", ""));
    }
}
