package Com.Notification.Service;

public class Notification {
public void Notification (String _type)
{
System.out.println("Notification.NotificationService()");
		if(_type.equalsIgnoreCase ("sms") )
		{
			sendSms();
		}
		else if(_type.equalsIgnoreCase("email1"))
		{
			sendEmail();
			}
		else {
			sendWhatspp();
		}
		}

	private void sendSms() {

		System.out.println("Notification.sendSms() START");
		// biz logic
		System.out.println("Notification.sendSms() END");
	}

	private void sendEmail() {
		System.out.println("Notification.sendemail() START");
// biz logic
		System.out.println("Notification.sendemail() END");
	}
	private void sendWhatspp() {

		System.out.println("Notification.sendWhatsApp() START");
		// biz logic
		System.out.println("Notification.sendWhatsApp() END");
	}

}
