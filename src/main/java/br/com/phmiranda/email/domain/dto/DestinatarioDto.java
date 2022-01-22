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

@Getter
@Setter
public class DestinatarioDto {
    private Long id;
    private String nome;
    private String usuario;
    private String email;
}
