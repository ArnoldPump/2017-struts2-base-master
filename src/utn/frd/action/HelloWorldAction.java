package utn.frd.action;

import utn.frd.bean.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

/* todos los actions de struts2 tienen que heredar de ActionSupport */
public class HelloWorldAction extends ActionSupport {
	/* este campo es requerido por un tema de serialización */
	private static final long serialVersionUID = 1L;

	/* este es el campo del Action que va a ser visible en el JSP */
	private MessageStore messageStore;

	/* metodo que se ejecuta en la acción "hello" definida en el struts.xml */
	public String execute() throws Exception {
		//creo una instancia del objeto MessageStore
		messageStore = new MessageStore();
		
		//devuelvo la constante SUCCESS (esta viene heredada de la clase ActionSupport)
		//también hay otras constantes como ERROR, INPUT o LOGIN
		return SUCCESS;
	}

	/* Getters y Setters de los campos que serán visibles en el JSP */
	public MessageStore getMessageStore() {
		return messageStore;
	}
	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
}
