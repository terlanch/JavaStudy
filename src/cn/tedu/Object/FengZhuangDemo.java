package cn.tedu.Object;
/*	��װ
 * 		��װ��������ʽ---����  
 * 		�����ڶ����Խ���˽�л���
 * 		ͨ�������ķ��ʷ�ʽȥ����˽�����ԣ�
 * 		������ߴ�������ݰ�ȫ��
 * 		�Ҽ�-->source-->Generate Getters and Setters
 */

public class FengZhuangDemo {
	public static void main(String[] args) {
		Personn p = new Personn();
		//��ֵ
		//p.name = "lili";
		//p.age = -10
		//p.setAge(10);
		//p.gender = 'Ů';
		System.out.println();
	}

}

//Personn��
class Personn{
	//����
	//˽�л�����
	private String name;
	private int age;
	private char gender;
	
	/*//�вι���
	public Personn(int age){
		if(age<0){
			System.out.println("��������");
		}else{
			this.setAge(age);
		}
	}*/

	/*//����---�����ķ��ʷ�ʽ
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0){
			System.out.println("��������");
		}else{
		this.age = age;
		}
	}*/
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}