package com.tarefasAPI.controller;

import com.tarefasAPI.dto.*;
import com.tarefasAPI.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<ExibirTarefaDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ExibirTarefaDTO buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public ExibirTarefaDTO criar(@RequestBody CriarTarefaDTO dto) {
        return service.criar(dto);
    }

    @PutMapping("/{id}")
    public ExibirTarefaAdmDTO atualizar(@PathVariable Long id, @RequestBody AtualizaTarefaDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
