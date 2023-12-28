package com.controller.Q16;

import com.controller.Q7.Employee7;

public class Demo16 {

	 

	public static void m1(){
		System.out.println("a");
	} 
	//Q17
	public void m2(){ 
		System.out.println("a22222");
	}
	 
	//Q18
	public static void m1(int a){
		System.out.println("int value--" +a);
	}
	//Q19
	public  void m4(float a){
		System.out.println("Float value -  "+a );
	}
	//Q20
	public static void m5(float a){
		System.out.println("Float value in static -- " +a);
	}
	//Q21
	public static void m6(Employee7 e){
		System.out.println("Class/ Model called ");
	}
	//Q22
	public static void m7(String s){
		System.out.println("string called- " +s);
	}
	//Q23
	public static void m8(Object o){
		System.out.println("Object method called--" +o.getClass());
	}
	//Q24
	public static void m9(Employee7 ed){
		//display data here
		System.err.println("Employee method data show --" +ed.getId());
		System.err.println("Employee method data show --" +ed.getName());
		System.err.println("Employee method data show --" +ed.getPrice());
		
		 
	}
	//Q25
	public static void m10(Object o){
		//display employee data here
		o.getClass().toString();	
		System.err.println("Object called ---- "+o);
		 
 		}
       //Q26	
	public static void m11(int i){
		System.out.println("Employeee id - "+i);
	}







	public static void main(String[] args) {
		//call m1 method from here
		Demo16.m1();
		//Q17
		Demo16 d = new Demo16();		
		 d.m2();  
		 //Q18
		 Demo16.m1(50); 
		 //Q19
		 d.m4(5f);
		 
		 //Q20
		 m5(4f);
		 //Q21
		 Employee7 e = new Employee7(10, "Neema", 100);
		 m6(e);
		 //Q22
		 m7("neema");
		 //Q23
		 m8(e);
		 //Q24
		 m9(e);
		 //Q25
		 m10(e);
		 //Q26
		 m11(e.getId());
		 
		 
	}

}
