/*
 * Author: phmiranda
 * Project: email
 * Task Number: SRC-177
 * Description: DESENVOLVIMENTO DO SERVIÇO DE NOTIFICAÇÃO ENVIADO VIA E-MAIL (GMAIL)
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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "destinatarios")
public class Destinatario {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "email")
    private String email;
}
