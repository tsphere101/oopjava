import java.lang.Math;

public class test {
    public static void main(String[] args) {

        double a = 0;
        for(int i = 0 ; i < 100 ; i++)
        {
        a = (int)(10 + Math.random() * 11);
        System.out.println((int)a);
        }

        
    }
}