package com.tarefasAPI.service;

import com.tarefasAPI.dto.*;
import com.tarefasAPI.entity.Tarefa;
import com.tarefasAPI.mapper.TarefaMapper;
import com.tarefasAPI.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repo;

    public TarefaService(TarefaRepository repo) {
        this.repo = repo;
    }

    public ExibirTarefaDTO criar(CriarTarefaDTO dto) {
        Tarefa tarefa = TarefaMapper.fromCreateDTO(dto);
        repo.save(tarefa);
        return TarefaMapper.toDTO(tarefa);
    }

    public List<ExibirTarefaDTO> listar() {
        return repo.findAll()
                .stream()
                .map(TarefaMapper::toDTO)
                .toList();
    }

    public ExibirTarefaDTO buscar(Long id) {
        Tarefa t = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        return TarefaMapper.toDTO(t);
    }

    public ExibirTarefaAdmDTO atualizar(Long id, AtualizaTarefaDTO dto) {
        Tarefa t = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        TarefaMapper.updateFromDTO(t, dto);
        repo.save(t);

        return TarefaMapper.toAdminDTO(t);
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }
}
