package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Client;
import ro.ase.cts.chain.clase.NotificatorEmail;
import ro.ase.cts.chain.clase.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Client client1=new Client("Ion", null, null);
		Client client2=new Client("Maria", "0766652345", null);
		Client client3=new Client("Ana", null, "ana@gmail.com");
		
		
		NotificatorSMS notificareSMS=new NotificatorSMS();
		NotificatorEmail notificatorEmail=new NotificatorEmail();
		notificareSMS.setNotificator(notificatorEmail);
		notificareSMS.trimiteNotificare(client3, "Mesaj1");
		
		
	}
}
