/*
 * Author: phmiranda
 * Project: email
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 21/01/2022
 */

package br.com.phmiranda.email.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    @GetMapping
    public void enviarNotificacao() {
        System.out.println("Lista de cadastros realizados, envio da notificação via e-mail.");
    }

    @PostMapping
    public void cadastrarUsuario() {
        System.out.println("Cadastrar usuário realizado com sucesso.");
    }

    @PutMapping
    public void atualizarCadastroUsuario() {
        System.out.println("Cadastro do usuário atualizado com sucesso.");
    }
}
