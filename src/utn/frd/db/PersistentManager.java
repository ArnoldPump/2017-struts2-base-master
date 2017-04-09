package utn.frd.db;
import java.util.ArrayList;
import java.util.List;
import utn.frd.bean.Persona;
public class PersistentManager {

	public static List<Persona> getInstance() {
		return data;
	}
	private static List<Persona> data = new ArrayList<Persona>();
	
}

