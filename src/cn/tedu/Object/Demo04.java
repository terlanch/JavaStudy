package cn.tedu.Object;
/*
 * ����һ��ѧ����
 * ˽�л� ����
 * ˽�л� ����
 */

public class Demo04 {
	public static void main(String[] args) {
		//��������
		Student student = new Student();
		//����set������ֵ
		student.setName("xiaoxiao");
		student.setAge(18);
		
		System.out.println("������" + student.getName());
		System.out.println("���䣺"+student.getAge());
		student.sayHi();
	}

}
//ѧ����
class Student{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//˽�л�����
	private String name;
	private int age;
	
	//�޲ι��췽��
	public Student(){
		
	}
	
	//�вι��췽��
	public Student(String name,int age){
		this.name = name;
		this.age = age;
		
		}
	//����
	public void sayHi(){
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
	}
}
