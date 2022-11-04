package br.edu.ifba.gincana.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.edu.ifba.gincana.repository.UsuarioRepository;
import br.edu.ifba.gincana.model.UsuarioModel;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@GetMapping("/listall")
	public List<UsuarioModel> listall() {
	List<UsuarioModel> result = repository.findAll();
	return result;
}

	@GetMapping(value = "/{id}")
	public UsuarioModel findById(@PathVariable Long id) {
	Optional<UsuarioModel> obj = repository.findById(id);
	if ( obj.isPresent() )
		return obj.get();
    return null;
}

	@PostMapping
	public UsuarioModel insert (@RequestBody UsuarioModel usuario) {
	UsuarioModel result = repository.save(UsuarioModel);
	return result;
}

	@DeleteMapping("/{id}")
	public ResponseEntity<UsuarioModel> delete(@PathVariable Long id) {
	repository.deleteById(id);
	return ResponseEntity.noContent().build();
}

	@PutMapping("/{id}")
	public ResponseEntity<UsuarioModel> update(@PathVariable Long id, @RequestBody UsuarioModel usuarioModel) {
	var p = repository.findById(id);
	
    if (p.isPresent()) {
        var usuario = p.get();

        if (usuarioModel.getNomeUsuario() != null)
        	usuario.setNomeUsuario(usuarioModel.getNomeUsuario());

        if (usuarioModel.getEmailUsuario() != null)
        	usuario.setEmailUsuario(usuarioModel.getEmailUsuario());

        if (usuarioModel.getSenhaUsuario() != null)
        	usuario.setSenhaUsuario(usuarioModel.getSenhaUsuario());

        if (usuarioModel.getCpfUsuario() != null )
        	usuario.setCpfUsuario(usuarioModel.getCpfUsuario());

        if (usuarioModel.getSexoUsuario() != null)
        	usuario.setSexoUsuario(usuarioModel.getSenhaUsuario());

        repository.save(usuario);
        return ResponseEntity.ok(usuario);
    } else {
    	return ResponseEntity.notFound().build();
    }
}
}