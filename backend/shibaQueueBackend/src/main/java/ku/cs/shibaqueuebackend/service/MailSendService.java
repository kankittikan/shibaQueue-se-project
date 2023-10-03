package ku.cs.shibaqueuebackend.service;

import jakarta.mail.internet.InternetAddress;
import ku.cs.shibaqueuebackend.model.UserCreateMailConfirm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class MailSendService {
    @Autowired
    private JavaMailSender javaMailSender;
    public void sendMailConfirmCreateUser(UserCreateMailConfirm mail) {
        MimeMessagePreparator preparator = (mimeMessage) -> {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(new InternetAddress("no-reply@doksakura.com", "ShibaQueue"));
            helper.setTo(mail.getEmail());
            helper.setSubject("Comfirm Your Email");

            helper.setText("\n" +
                    "Confirm your email to create account\n" +
                    "Within 15 minutes" +
                    "\n" +
                    mail.getConfirmLink() +
                    "\n\nShibaQueue Service Team");
        };
        javaMailSender.send(preparator);
    }
}
