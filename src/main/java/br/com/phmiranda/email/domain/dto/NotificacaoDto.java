/*
 * Author: phmiranda
 * Project: email
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NotificacaoDto {
    private Long id;
    private String remetente;
    private String destinatario;
    private String assunto;
    private String email;
}
