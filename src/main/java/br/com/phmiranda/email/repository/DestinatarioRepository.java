/*
 * Author: phmiranda
 * Project: email
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.repository;

import br.com.phmiranda.email.domain.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinatarioRepository extends JpaRepository<Long, Destinatario> {

}
