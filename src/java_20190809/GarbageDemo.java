package java_20190809;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class A extends Thread{
	@Override
	public void run() {
		System.out.println("스레드2....");
	}
}

class B implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Customer{
	String name;
	Customer(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class CustomerDao{
	public Customer[] getCustomer() {
		 Customer[] cs = new Customer[10];
		 /*
		Customer c1 = new Customer("성영한1");
		Customer c2 = new Customer("성영한2");
		Customer c3 = new Customer("성영한3");
		Customer c4 = new Customer("성영한4");
		Customer c5 = new Customer("성영한5");
		Customer c6 = new Customer("성영한6");
		Customer c7 = new Customer("성영한7");
		Customer c8 = new Customer("성영한8");
		Customer c9 = new Customer("성영한9");
		Customer c10 = new Customer("성영한10"); */
		cs[0] = new Customer("성영한1");
		cs[1] = new Customer("성영한2");
		cs[2] = new Customer("성영한3");
		cs[3] = new Customer("성영한4");
		cs[4] = new Customer("성영한5");
		cs[5] = new Customer("성영한6");
		cs[6] = new Customer("성영한7");
		cs[7] = new Customer("성영한8");
		cs[8] = new Customer("성영한9");
		cs[9] =new Customer("성영한10");
		
		
		return cs;
		
	}
	public ArrayList<Customer> getCustomers(){
		ArrayList<Customer> list = new ArrayList<Customer>(20);
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한1"));
		
		return list;
	}
	
}

public class GarbageDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Dao(Data Access Object)
		CustomerDao cdao = new CustomerDao();
		Customer[] customers = cdao.getCustomer();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}
		
		ArrayList<Customer> list = cdao.getCustomers();
		for (Customer customer : list) {
			
		}
	}

	
	/*public static void main(String[] args) {
		
		A a = new A();
		a.start();

		
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();
		System.out.println("aaaaa");
		
		//동일한 코드
		Calendar c = Calendar.getInstance();
		Calendar c1 = new GregorianCalendar();
	}
	*/
	
	/*Calendar 클래스의 메서드만 사용할 수 있음.
	//단, GregorianCalendar 클래스에서 overriding 된 메서드는 사용가능.
	public static Calendar getInstance() {
		Calendar c = new GregorianCalendar();
		return new GregorianCalendar(); */
		
		
		
	}


