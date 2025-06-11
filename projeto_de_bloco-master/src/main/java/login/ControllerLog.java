package login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLog {

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String mostrarCadastro() {
        return "cadastro";
    }
}
