package mail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class SendMailTest {

	public static void main(String[] args) throws AddressException, MessagingException {
		
		MailUtils.sendMail("18851738520@163.com", "红尘账号密码重置","重置密码，请点击如下链接。");
		
		
	}
	
}
