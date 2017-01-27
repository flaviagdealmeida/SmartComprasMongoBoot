package br.org.smartcompras.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.org.smartcompras.models.Marca;
import br.org.smartcompras.models.Usuario;
import br.org.smartcompras.repository.UsuarioMongoRepository;

@Controller
public class UsuarioController {

	
	
	@Autowired
	UsuarioMongoRepository usuarioRepository;
	
	
	@RequestMapping(value="/addusuario", method = RequestMethod.POST)
		public String addUsuario(@ModelAttribute Usuario usuario) {
			usuarioRepository.save(usuario);
			return "redirect:sistema";
	}
	
	@RequestMapping(value = "/searchusuario")
	public String search(@RequestParam String searchmarcas) {
		return "redirect:sistema";
	}

	@RequestMapping("/usuario")
	public String marcaList(Model model) {
		model.addAttribute("usuarioList", usuarioRepository.findAll());
		return "usuario";
	}

	@RequestMapping(value = "/delusuario", params = { "removerUsuario" }, method = RequestMethod.POST)

	public String delMarca(@ModelAttribute Usuario usuario, final HttpServletRequest req) {
		String usuarioId = String.valueOf((req.getParameter("removerUsuario")));

		usuarioRepository.delete(usuarioId);

		return "redirect:sistema";
	}
	
	
}
