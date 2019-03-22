package cn.tedu.Object;
/*
 * ����10����
 * ˽�л�4������
 * ���л�3������
 * ���췽��
 * set/get����
 * ���ҽ��ܷ���
 */
public class Demo05 {
	public static void main(String[] args) {
		Animal1 animal = new Animal1();
		animal.setName("��");
		animal.setAge(5);
		animal.setKind("gong");
		animal.setColor("hei");
		
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getKind());
		System.out.println(animal.getColor());
		
		animal.sayHi();
	}

}
//������
class Animal1{
	private String name;
	private String kind;
	private int age;
	private String color;
	
	//�����޲η���
	public Animal1(){
		
	}
	
	//�����вη���
	public Animal1(String name,String kind,int age,String color){
		this.name = name;
		this.kind = kind;
		this.age = age;
		this.color = color;
	}
	
	//�Է���
	public void eat(){
		System.out.println("����Ҫ�Է�");
	}
	//��ˮ����
	public void drink(){
		System.out.println("����Ҫ��ˮ");
	}
	//˯������
	 public void sleep(){
		 System.out.println("����Ҫ˯��");
	 }
	 //���ҽ���
	 public void sayHi(){
		 System.out.println("xingming:"+ name);
		 System.out.println("nianling:"+ age);
		 System.out.println("zhonglei:"+ kind);
		 System.out.println("yanse:"+ color);
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
