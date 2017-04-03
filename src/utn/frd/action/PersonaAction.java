package utn.frd.action;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import utn.frd.bean.Persona;
import utn.frd.db.PersistentManager;

public class PersonaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String gender;
	
	public String save(){
		List<Persona> personas = PersistentManager.getInstance();
		int edad = 0;

		try{
			edad = Integer.parseInt(age);
		}catch(Exception e){
			addActionError("Ocurrió un error con la edad");
			return ERROR;
		}

		Persona unaPersona = new Persona(personas.size(), name, edad, gender);
		PersistentManager.getInstance().add(unaPersona);
		
		return SUCCESS;
	
	}
	public String execute(){
		
		personas = PersistentManager.getInstance();
		Persona p =personas.get(0);
		return SUCCESS;
	}

	private List<Persona> personas;
	
	
	
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


}
