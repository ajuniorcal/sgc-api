package br.com.sgc.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ativos")
public class AtivoController {
	
	@GetMapping
	public ResponseEntity<String> findAll(){
		return ResponseEntity.ok("Olá Mundo");
	}

}
