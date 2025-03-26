package cl.duoc.fullstack.miapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/saludar")
    public HashMap<Integer, String> decirHola() {

        HashMap<Integer, String> listado = new HashMap<>();
        listado.put(1, "hola get");
        listado.put(2, "chao get");

        return listado;
    }

    @PostMapping("/saludar")
    public HashMap<Integer, String> decirHolaPost() {
        HashMap<Integer, String> listado = new HashMap<>();
        listado.put(1, "hola post");
        listado.put(2, "chao post");

        return listado;
    }
}