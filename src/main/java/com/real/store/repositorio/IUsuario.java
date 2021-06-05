package com.real.store.repositorio;






import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.real.store.model.usuario;




public interface IUsuario extends JpaRepository<usuario, Integer>{
	@Query(value="{call ListarUsuarios(:dni)}", nativeQuery = true)
	List<usuario> ListarUsuario(@Param("dni") int dni);

	@Query(value="{call EliminarUsuarios(:dni)}", nativeQuery = true)
	usuario EliminarUsuario(@Param("dni") int dni);
	
	@Query(value="{call Autentication(:email, :password)}", nativeQuery = true)
	usuario Autentication(@Param("email") String email, @Param("password") String password);
	
	@Query(value="{call ASIGNAR_ROL(:codigo,:dni)}", nativeQuery = true)
	usuario asignarrol(@Param("codigo") int codigo,@Param("dni") String dni);

}
