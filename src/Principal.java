import java.util.List;

public class Principal {

	public static void main(String[] args) {
//		Usuario u = new Usuario();
//		u.setLogin("alemao");
//		u.setNome("Alemãdo do Mbororé");
//		u.setEmail("amborore@gmail.com");
//		UsuarioDAO.inserirUsuario(u);
		
		List<Usuario> lista = UsuarioDAO.todosUsuarios();
		lista.forEach(System.out::println);
	}
}
