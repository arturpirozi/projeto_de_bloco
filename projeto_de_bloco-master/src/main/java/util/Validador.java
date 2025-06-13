package util;

public class Validador {
    public static boolean emailValido(String email) {
        return email.matches("^[\\w.-]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean senhaForte(String senha) {
        return senha.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$");
    }
}
