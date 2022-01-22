/*
 * Author: phmiranda
 * Project: email
 * Task Number: SRC-177
 * Description: DESENVOLVIMENTO DO SERVIÇO DE NOTIFICAÇÃO ENVIADO VIA E-MAIL (GMAIL)
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.repository;

import br.com.phmiranda.email.domain.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinatarioRepository extends JpaRepository<Destinatario, Long> {

}
