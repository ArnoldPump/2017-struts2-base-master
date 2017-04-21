package utn.frd.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.*;
import utn.frd.db.PersistentManager;
import utn.frd.bean.MessageStore;
import utn.frd.bean.Persona;
import java.util.ArrayList;
import java.util.List;

public class PersonaAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String gender;
	private List<Persona> personas;
	private String id;
	private String alta;
	public String save(){
		List<Persona> personas = PersistentManager.getInstance();
		int edad = 0;

		try{
			edad = Integer.parseInt(age);
		}catch(Exception e){
			addActionError("Ocurrió un error con la edad");
			return ERROR;
		}

		Persona unaPersona = new Persona(personas.size(), name, edad, gender, true);
		PersistentManager.getInstance().add(unaPersona);
		return SUCCESS;
	}
	public String execute(){
		List<Persona> personas1 = PersistentManager.getInstance();
		ArrayList<Persona> personasTrue = new ArrayList<Persona>();
		for(Persona p:personas1) {
			if (p.getAlta() == true) {
				personasTrue.add(p);
			}	
		}
		personas=personasTrue;
		return SUCCESS;
	}
	
	public String eliminar(){
		personas = PersistentManager.getInstance();
		int ide=0;
		try{
			ide = Integer.parseInt(id);
		}catch(Exception e){
			addActionError("Ocurrió un error con el ID");
			return ERROR;
		}
		for(Persona p:personas) {
			if (p.getId() == ide) {
				p.setAlta(false);
			}
				}		
		return SUCCESS;
		}
	public String modificar(){
		int ide=0;
		int edad=0;
		
		personas = PersistentManager.getInstance();
		try{
			ide = Integer.parseInt(id);
		}catch(Exception e){
			addActionError("Ocurrió un error con el ID");
			return ERROR;
		}
		
		for(Persona p:personas) {
			
			if (p.getId() == ide) {
				if (!(name.equals(""))) {
					p.setName(name);
				}
				try{
					edad = Integer.parseInt(age);
				}catch(Exception e){

				}
				if (edad!=0) {
					p.setAge(edad);
				}
				if (gender!=null) {
					p.setGender(gender);
				}
				if (alta != null) {
				if (alta.equals("t")) {

					p.setAlta(true);
				}
				if (alta.equals("f")) {

					p.setAlta(false);
				}			
				}
			}
		} 
		return SUCCESS;
	}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
		
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAlta() {
		return alta;
	}
	public void setAlta(String alta) {
		this.alta = alta;
	}
}
