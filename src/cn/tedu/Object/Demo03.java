package cn.tedu.Object;



public class Demo03 {
	public static void main(String[] args) {
	
	Person person = Demo03.fun("lili");
	Person person2 = fun("lulu",new Person());
	person2.sayHi();	
		
	}
	
	public static Person fun(String name, Person person){
		Person person2 = person;
		person2.name = name;
		return person2;
	}
	
	public static Person fun(String name){
		Person person = new Person();
		person.name = name;
		person.sayHi();
		return person;		
	}
}	
//Person��
class Person{
	String name;
	int age = 20;
	
	//�޲ι��췽��
	public Person(){
		
	}
	
	//�вι��췽��
	public Person(String name){
		this.name = name;
	}
	
	//���ҽ���
	public void sayHi(){
		System.out.println("������"+ name);
		System.out.println("���䣺"+ age);
	}
}
	