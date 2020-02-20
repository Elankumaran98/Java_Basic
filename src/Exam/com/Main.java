package Exam.com;
import  java.util.Scanner;
public class Main extends superb{
    public static void main(String[] args) {
        //superb sub=new superb();
        //sub.my();
        //Expection exp=new Expection();
        //exp.sample();
        //................Throws............................//
        //int n1,n2;
        //Scanner in=new Scanner(System.in);
        //try {
        //    System.out.println("Num 1:");
        //    n1=in.nextInt();
        //    System.out.println("Num 2:");
        //    n2=in.nextInt();
        //    Throws tho=new Throws();
        //    tho.example(n1,n2);
        //}catch (Exception e){
        //    System.out.println("Please Enter Correctly");
        //}
        //finally {
        //    System.out.println("Finished...!");
        //}
        //...................................Throw.......................................//
        //try {
        //     Throw th=new Throw();
        //     th.fun();
        //}catch (NullPointerException e){
        //    System.out.println("Sorry");
        //}
        //..................................Interface....................................//
        //Sound sound=new Sound();
        //sound.Dog();
        //sound.Cat();
        //sound.Cow();
        //.................................Polymorphism..................................//
        int i,k;
        float j,l;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Age");
        i=in.nextInt();
        System.out.println("Enter Month");
        k=in.nextInt();
        System.out.println("Day.Month+Age");
        j=in.nextFloat();
        Polymorphism poly=new Polymorphism();
        poly.example();
        poly.example(i,k);
        poly.example(i,j);
    }
}