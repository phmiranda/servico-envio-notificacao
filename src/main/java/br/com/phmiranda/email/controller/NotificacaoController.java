/*
 * Author: phmiranda
 * Project: email
 * Task Number: SRC-177
 * Description: DESENVOLVIMENTO DO SERVIÇO DE NOTIFICAÇÃO ENVIADO VIA E-MAIL (GMAIL)
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.controller;

import br.com.phmiranda.email.domain.Notificacao;
import br.com.phmiranda.email.domain.dto.NotificacaoDto;
import br.com.phmiranda.email.service.NotificacaoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    @Autowired
    NotificacaoService notificacaoService;

    @PostMapping
    public ResponseEntity<Notificacao> enviarNotificacao(@RequestBody @Valid NotificacaoDto notificacaoDto) {
        Notificacao notificacao = new Notificacao();
        BeanUtils.copyProperties(notificacaoDto, notificacao);
        notificacaoService.enviar(notificacao);
        return new ResponseEntity<>(notificacao, HttpStatus.CREATED);
    }
}
