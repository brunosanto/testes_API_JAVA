package br.com.Filmes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.Filmes.Diretor;
import br.com.Filmes.repository.DiretorRespository;
import br.com.Filmes.response.DiretorResponse;



@RestController
@RequestMapping("diretor")
public class DiretorController {
	
	@Autowired
	DiretorRespository diretorRespository;

	
	@RequestMapping(method= RequestMethod.GET)
	public List<DiretorResponse> list(){
		return serviceConsultaDiretor();
	}
	
	public List<DiretorResponse> serviceConsultaDiretor(){
		List<Diretor> lista = diretorRespository.findAll();
		List<DiretorResponse> retorno = new ArrayList<DiretorResponse>();
		
		for(Diretor diretor: lista) {
			DiretorResponse resp = new DiretorResponse();
			resp.setId(diretor.getId());
			resp.setDataNascimento(diretor.getDataNascimento());
			resp.setNome(diretor.getNome());
			resp.setNomeFilme(diretor.getNomeFilme());
			resp.setAnoFilme(diretor.getAnoFilme());
			retorno.add(resp);
		}
		return retorno;
	}
}
