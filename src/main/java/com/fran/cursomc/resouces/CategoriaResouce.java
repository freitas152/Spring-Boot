package com.fran.cursomc.resouces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/Categoria")

public class CategoriaResouce {
	
	@RequestMapping(method=RequestMethod.GET)
	public String list() {
		return "Rest esta Funcionando";
	}

}
