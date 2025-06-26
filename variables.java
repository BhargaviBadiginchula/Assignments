//Create 4 examples on Variables and methods.
class variables{	

  static String uni="jntua";	//static variable
  String name;			//instance variable

  void show(String a){ 
    name =a;//here a is parameter variable
    System.out.println(name+"from"+uni);
   }


  static void display(String a){
    System.out.println( a+"from"+variables.uni);
    }
public static void main(String[] args){
  variables v=new variables();

  v.show("Amareshwar");
  v.display("Bhanu");//passing values to the method
  int x=10;  	//local variable

  System.out.println(x);
  System.out.println(v.name);	//accessing instance variable  
  System.out.println(variables.uni);   //accessing static variable using class anem or it can directly accessed since it is a static method.
  

  }
}    
