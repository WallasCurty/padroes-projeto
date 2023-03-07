package padroescriacao.singleton;

public class Usuario {
    private static String nome;
    private static String cpf;
    private static String tipoUsuario;    //adm ou user
    private static String email;
    private static Usuario uniqueInstance;

    private Usuario(String nome,String cpf,String tipoUsuario,String email){
        Usuario.nome = nome;
        Usuario.cpf = cpf;
        Usuario.tipoUsuario = tipoUsuario;
        Usuario.email = email;
    }

    public synchronized static Usuario obterUsuario(){
        if (uniqueInstance == null){
            uniqueInstance = new Usuario(nome,cpf,tipoUsuario,email);
        }
        return uniqueInstance;
    }



}
