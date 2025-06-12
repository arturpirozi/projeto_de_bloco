package org.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerCad {

    @GetMapping("/cadastro")
    public String exibirFormularioCadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String processarCadastro(
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam String senha,
            Model model) {

        System.out.println("Cadastro recebido: " + nome + ", " + email);

        model.addAttribute("mensagem", "Cadastro realizado com sucesso!");
        return "cadastro";
    }
}
