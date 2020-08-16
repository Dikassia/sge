import java.util.Scanner;

public class SGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sobrenome;
        int u;
        String senha = "null";



        System.out.println("Digite Nome Completo: ");
        nome = scanner.nextLine();

        u = nome.lastIndexOf(' ');
        sobrenome = nome.substring(u + 1, nome.length());

        String Login = nome.charAt(0) + "_" + sobrenome;

        System.out.println("Seu login é: " + Login);

        boolean validarsenha = false;

        while (validarsenha != true){

            System.out.println("Digite uma senha:");
            System.out.println(" A senha precisa conter no mínimo 8 caracteres: " +
                    "Uma letra maiúscula, " +
                    "Uma letra minúscula," +
                    "Números," +
                    "E um dos caracteres especiais @,!,-");

            senha = scanner.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@!-])(?=.*\\d).+") ){
                System.out.println("Senha criada com sucesso");
                validarsenha = true;
            } else{
                System.out.println("Senha não atende o padrão" );
            }
        }

        System.out.println("Entrando no Sisema");

        boolean LLogin = false;

        while (LLogin != true){

            System.out.println("Digite nome de usuario:");
            String vLogin = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String vSenha = scanner.nextLine();

            if (vLogin.equals(Login) && vSenha.equals(senha) ){
                System.out.println("Login realizado com sucesso");
                LLogin = true;
            }else{
                System.out.println("Nome de usuário e/ou senha inválidos.");
            }
        }

    }
}





