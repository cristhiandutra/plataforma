import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.plataforma.entidades.Usuario;

public class UsuarioDAO {
	
	private EntityManager em;
	
	public UsuarioDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Usuario> listarUsuarios() {
		
		try{
			Query query = em.createQuery("FROM Usuario ");
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
