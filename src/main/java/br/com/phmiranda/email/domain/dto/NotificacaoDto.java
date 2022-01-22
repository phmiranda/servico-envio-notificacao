/*
 * Author: phmiranda
 * Project: email
 * Task Number: SRC-177
 * Description: DESENVOLVIMENTO DO SERVIÇO DE NOTIFICAÇÃO ENVIADO VIA E-MAIL (GMAIL)
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.domain.dto;

import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class NotificacaoDto {

    @NotBlank
    private String assunto;

    @NotBlank
    private String emailDono;

    @NotBlank
    private String emailTexto;

    @Email
    @NotBlank
    private String emailRemetente;

    @Email
    @NotBlank
    private String emailDestinatario;
}
