package Exam.com;

class Volume {
    protected int length,width,height;
    void Area(int x,int y){
        int area;
        length=x;
        width=y;
        area=x*y;
        System.out.println("Area="+area);
    }
    void vol(int x,int y,int z){
        int vol;
        height=z;
        width=y;
        length=x;
        vol=x*y*z;
        System.out.println("Volume="+vol);
    }
    void eat(){
        System.out.println("Hello...");
    }
    public void my(){
        System.out.println("My name is Elankumaran");
    }
}
