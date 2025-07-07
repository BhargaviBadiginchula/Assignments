public class UnaryOp {
    public static void main(String[] args){
        int a=10;
        int b=a++ + ++a + a + --a + a-- + a;//a=10;b=66
        System.out.println(b);

        int c=~b+2;//c=-65
        System.out.println(c);
        boolean d=false;
        System.out.println(!d);//true
        System.out.println(a++ + b++ + ~c );
        System.out.println("a : "+a+"b : "+b+"c :"+c);//a=11,b=67 c=-65
        int result = ~(-a++) + ++a - --a; //a=11
        System.out.println("result :"+result+" a : "+a);//result=11,a=12
    }
    
}
