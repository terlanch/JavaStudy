package cn.tedu.Object;
/*	this
 * 		�ؼ���---������ǵ�ǰ��ģ����⣩����  
 * 		����ָ���໹û���������Ķ���
 * 		ָ�����ǵ�ǰ������Ķ���
 * 		���Ե������е����Ժͷ���
 * 		this���--- this()ֻ���ڹ��췽���е��ñ�����������ʽ�Ĺ��췽��
 * 
 */
public class ThisDemo {
	public static void main(String[] args) {
		Students s1 = new Students();
		//thisָ���Ķ������s1��
		System.out.println("s1:"+s1);
		
		Students s2 = new Students(12);
		//thisָ���Ķ������s2��
		System.out.println("s2:"+s2);
		s1.study();
	}

}

//ѧ����
class Students{
	//����
	String name;
	int age;
	char gender;
	//ѧ��
	String no;
	
	//
	public Students(){
		//System.out.println("this:"+this);
	}
	
	public Students(int age){
		this.age = age;
		//System.out.println("this:"+this);
		
	}
	
	public Students(int age,String name){
		//this.age = age;
		//this()---this���---�� ��ǰ���췽�� �б���������ʽ�Ĺ��췽��
		//this���һ��Ҫ��������
		this(age);
		this.name = name;
		
	}
	
	public Students(int age,char gender,String name){
		//this.age = age;
		//this.name = name;
		this(age,name);
		this.gender = gender;
	}
	
	//����
	public void study(){	
		//this���Դ��浱ǰ�໹û�д��������Ķ���
		System.out.println(this.name+"�ںú�ѧϰ������");//this.����ʡ��
		System.out.println("this:"+this);
	}
}
