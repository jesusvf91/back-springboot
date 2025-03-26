package cl.duoc.fullstack.miapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hola")
    public HashMap<Integer, String> decirHola() {

        HashMap<Integer, String> listado = new HashMap<>();
        listado.put(1, "hola");
        listado.put(2, "chao");


        return listado;
    }

    @PostMapping("/hola")
    public Boolean decirHolaPost() {
        // otras logicas

        return true;
    }
}