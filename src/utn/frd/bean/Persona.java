package utn.frd.bean;


public class Persona {

	private int id;
	private String name;
	private int age;
	private String gender;
	private Boolean alta;
	
	public Persona(int i, String name2, int edad, String gender2, Boolean alt) {
		name = name2;
		age = edad;
		gender = gender2;
		id = i;
		alta = alt;		
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Boolean getAlta() {
		return alta;
	}
	public void setAlta(Boolean alta) {
		this.alta = alta;
	}
	

}