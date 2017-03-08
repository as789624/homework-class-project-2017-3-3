package hw01;

public class Teacher {
private String name,id;
private char gender;
private float height,weight;

public  Teacher(String name1,String id1){
	name=name1;
	id=id1;
}
 public String getName(){
	return name;
}
 public String getId(){
	return id;
}
public void setGender(char gender1){
	gender=gender1;
}
public char getGender(){
	return gender;
}
public void setBody(float height1,float weight1){
	height=height1;
	weight=weight1;
}
public float getHeight(){
	return height;
}
public float getWeight(){
	return weight;
}

}
