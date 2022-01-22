/*
 * Author: phmiranda
 * Project: email
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "notificacoes")
public class Notificacao {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "remetente")
    private String remetente;

    private List<String> destinatarios;

    @Column(name = "assunto")
    private String assunto;

    @Column(name = "email_html")
    private String email;
}
