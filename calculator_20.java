import java.util.*;

class add{
  int c;
  double d;
  double e;
  

  void add(int x,int b){
    
    c=x+b;
    System.out.println(c);
   
  }
  void sub(int x,int y){
    int s;
    s=x-y;
    System.out.println(s);
  }
  void mul(int x,int y){
    int v;
    v=x*y;
    System.out.println(v);
  }
   void div(int x,int y){
    int v;
    v=x/y;
    System.out.println(v);
  }
   void rem(int x,int y){
    int v;
    v=x%y;
    System.out.println(v);
  }
}

class calculator_20{
  public static void main(String args[]){
    int a,b;
    char s1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your a,b ");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Enter your operator :");
     s1=sc.next().charAt(0);
    
    
    //class name obj name=new c;lass name();
    add a1=new add();
    //objname.methodname();
    if(s1=='+'){
    a1.add(a,b);
    }
    else if(s1=='-'){
    a1.sub(a,b);
    }
    else if(s1=='*'){
    a1.mul(a,b);
    }
    else if(s1=='/'){
      a1.div(a,b);
    }
    else{
      a1.rem(a,b);
    }
    
  }
}