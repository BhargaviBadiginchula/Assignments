// class Naming$naming  :is ok to use but $ in classes. But in classes it have special meaning as it represents inner or anonymous classes.To avoid clashes use Pascal Caseor Title Case conventions.

class Naming{
  //static int abstract; A keyword can't be a variable name. 
  static int  PIE;// valid better use case for constant valued names.
  static String name;//valid recommended.
  static int Av; //valid.
  static String _name;//valid using special characters only "-","$".
  static String $name;
  static String Num1_$;//combination
  //static int %num; invalid beacuse 

//two or more words name
  static String varName;//camelCase-recommended
  static String var_name;//snake or chain case
  static String var$name;//valid
  static String num1_From$classA;


  //static String 1name; invalid
  public static void main(String args[])//All variable conventions applicable to methods and classes.for better readability use lower Case.
  {
   System.out.println(PIE);
   System.out.println(name);
   System.out.println(Av);
   System.out.println($name);
   System.out.println(_name);
   System.out.println(Num1_$);
   System.out.println(varName);
   System.out.println(var_name);
   System.out.println(var$name);
   System.out.println(num1_From$classA);
  
}
}