package com.controller.Q27;

import com.controller.Q7.Employee7;

public class Demo27 {

	public static int m1(int i) {
		// System.out.println("m1 called");
		System.out.println(i);
		return i * i;
	}

	// Q28
	public static int m2(int i) {
		System.out.println("m2 called");
		return i * i;
	}
	
	//Q29
	public static float m3(int i){
		System.out.println("m3 called");
		return i*i;
	}
	
	//Q30
	public static Employee7 m4(Employee7 em ){	
		 return em;		
		//create Employee object here and return
		//do required changes in m1 method to do this task
	}
	
	//Q31
	public static Object m5(){
		//create Employee object here and return
		//don’t change m1 method prototype i.e return type or access specifier
		Employee7 e = new Employee7(100, "neema", 520);
		return e.toString();
	}
	//Q32
	public static int m6(int i){
		return i*i;
	}





	public static void main(String[] args) {
		// call m1 method and pass some number
		// m1(28);
		// System.out.println(m1(2));

		// Q28
		// call m1 method and pass some number
		// m2(2);
		//int i = 10;
		m2(10);
		int total = 100 + m2(5);
		System.out.println(total);
		
		//Q29
		//call m1 method and pass some number
		 m3(7);
		 int total1 = (int) (100 + m3(7))  ;
		 System.out.println(total1);
		 
		 //Q30
		//call m1 method and catch returned employee object here
		//display returned employee data here	 
		 
		 Employee7 em = new Employee7(10, "Paresh120", 501);
		 m4(em);
		 System.out.println(em.getId() +"--"+ em.getName()+"--"+em.getPrice() );


		 //Q31
		//call m1 method and catch returned employee object here
			//display returned employee data here	  
		 
		 Object e = m5();
		 System.err.println(e);
		 
		 //Q32
		 m6(7);
		 Demo27 d = new Demo27();	 	  
		 System.err.println(m6(7));
		 System.err.println(d.m6(4));
	}

}
