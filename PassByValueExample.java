public class PassByValueExample{
    public static void main(String ar[]){
        int a=1;
        int b=2;
        method1(a,b);
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
    private static void method1(int a ,int b){
        a=a+10; b=b+10;
         //System.out.println("value of a in method1:"+a);
        //System.out.println("value of a in method1:"+b);
    }
}