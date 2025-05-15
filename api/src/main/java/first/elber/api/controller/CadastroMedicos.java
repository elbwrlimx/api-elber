package first.elber.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class CadastroMedicos {

   @PostMapping
  public void teste(@RequestBody String json) {
    System.out.println(json);
  }
} 