/*
 * Author: phmiranda
 * Project: email
 * Task Number: SRC-177
 * Description: DESENVOLVIMENTO DO SERVIÇO DE NOTIFICAÇÃO ENVIADO VIA E-MAIL (GMAIL)
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.domain;

import br.com.phmiranda.email.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "notificacoes")
public class Notificacao {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "assunto")
    private String assunto;

    @Column(name = "email_dono")
    private String emailDono;

    @Column(name = "email_texto", columnDefinition = "TEXT")
    private String emailTexto;

    @Column(name = "email_remetente")
    private String emailRemetente;

    @Column(name = "email_destinatario")
    private String emailDestinatario;

    @Column(name = "data_envio")
    private LocalDateTime dataEnvio;

    @Column(name = "status")
    private Status status = Status.NOTIFICACAO_EM_PROCESSAMENTO;
}
