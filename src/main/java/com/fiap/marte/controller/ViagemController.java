package com.fiap.marte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.marte.models.ViagemModelo;
import com.fiap.marte.repositories.ViagemRepository;

@Controller
public class ViagemController {
	
	@Autowired
	private ViagemRepository viaRep;
	
	@GetMapping("/listar") 
	public ModelAndView Listar()
	{
		ModelAndView model = new ModelAndView("/listar");
		
		List<ViagemModelo> listViagens = viaRep.findAll();
		model.addObject("viagens", listViagens);
		
		return model;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView Cadastrar() {
		ModelAndView model = new ModelAndView("/cadastrar");
		return model;
	}
	
	@PostMapping("/cadastrar")
	public String Cadastrar(@ModelAttribute("viagem")ViagemModelo objViagem) {
		viaRep.save(objViagem);
		return "redirect:/listar";
	}
	
	@GetMapping("/deletar/{id}")
	public String Deletar(@PathVariable("id")Long id) {
		viaRep.deleteById(id);
		return "redirect:/listar";
	}
	
}
