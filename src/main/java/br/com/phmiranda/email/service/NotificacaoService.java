/*
 * Author: phmiranda
 * Project: email
 * Task Number: SRC-177
 * Description: DESENVOLVIMENTO DO SERVIÇO DE NOTIFICAÇÃO ENVIADO VIA E-MAIL (GMAIL)
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.service;

import br.com.phmiranda.email.domain.Notificacao;
import br.com.phmiranda.email.domain.enums.Status;
import br.com.phmiranda.email.repository.NotificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class NotificacaoService {

    @Autowired
    NotificacaoRepository notificacaoRepository;

    @Autowired
    JavaMailSender mailSender;

    @Transactional
    public Notificacao enviar(Notificacao notificacao) {
        notificacao.setDataEnvio(LocalDateTime.now());
        try{
            SimpleMailMessage email = new SimpleMailMessage();
            email.setFrom(notificacao.getEmailRemetente());
            email.setTo(notificacao.getEmailDestinatario());
            email.setSubject(notificacao.getAssunto());
            email.setText(notificacao.getEmailTexto());
            mailSender.send(email);
            notificacao.setStatus(Status.NOTIFICACAO_ENVIADA);
        }catch (MailException mailException) {
            notificacao.setStatus(Status.NOTIFICACAO_NAO_ENVIADA);
        } finally {
            return notificacaoRepository.save(notificacao);
        }
    }
}
