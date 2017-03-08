package hw01;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher a1 = new Teacher("Jim","94879487");
a1.setGender('男');
a1.setBody(175.5f,72.8f);
System.out.println("名字"+"="+a1.getName());
System.out.println("Id"+"="+a1.getId());
System.out.println("性別"+"="+a1.getGender());
System.out.println("身高"+"="+a1.getHeight());
System.out.println("體重"+"="+a1.getWeight());

	}

}
