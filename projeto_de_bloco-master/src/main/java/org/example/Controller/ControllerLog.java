package org.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerLog {

    @GetMapping("/login")
    public String exibirLogin() {
        return "login"; // retorna login.html
    }

    @PostMapping("/login")
    public String processarLogin(
            @RequestParam String email,
            @RequestParam String senha,
            Model model) {

        if (email.equals("admin@biketour.com") && senha.equals("123")) {
            model.addAttribute("mensagem", "Login bem-sucedido!");
            return "redirect:/home";
        } else {
            model.addAttribute("erro", "Credenciais inválidas!");
            return "login";
        }
    }
}
