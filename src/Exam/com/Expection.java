package Exam.com;
import java.util.Scanner;
public class Expection {
    public void sample(){
        int i,j;
        float k;
        Scanner in=new Scanner(System.in);
        try {
            System.out.println("Num 1:");
            i=in.nextInt();
            System.out.println("Num 2:");
            j=in.nextInt();
            //Throws tho=new Throws();
            //tho.example(i,j);
            k=i/j;
            System.out.println("Answer="+k);
        }
        catch(Exception e){
            System.out.println("Please Enter Correct numbers");
        }
        finally {
            System.out.println("Finish...!");
        }
    }
}
