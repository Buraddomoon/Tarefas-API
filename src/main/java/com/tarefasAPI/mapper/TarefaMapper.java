package com.tarefasAPI.mapper;

import com.tarefasAPI.dto.*;
import com.tarefasAPI.entity.Tarefa;

public class TarefaMapper {

    public static Tarefa fromCreateDTO(CriarTarefaDTO dto) {
        Tarefa t = new Tarefa();
        t.setTitulo(dto.titulo);
        t.setDescricao(dto.descricao);
        return t;
    }

    public static void updateFromDTO(Tarefa tarefa, AtualizaTarefaDTO dto) {
        if (dto.titulo != null) tarefa.setTitulo(dto.titulo);
        if (dto.descricao != null) tarefa.setDescricao(dto.descricao);
        tarefa.setConcluida(dto.concluida);
    }

    public static ExibirTarefaDTO toDTO(Tarefa t) {
        ExibirTarefaDTO dto = new ExibirTarefaDTO();
        dto.id = t.getId();
        dto.titulo = t.getTitulo();
        dto.concluida = t.isConcluida();
        dto.dataCriacao = t.getDataCriacao();
        return dto;
    }

    public static ExibirTarefaAdmDTO toAdminDTO(Tarefa t) {
        ExibirTarefaAdmDTO dto = new ExibirTarefaAdmDTO();
        dto.id = t.getId();
        dto.titulo = t.getTitulo();
        dto.descricao = t.getDescricao();
        dto.concluida = t.isConcluida();
        dto.dataCriacao = t.getDataCriacao();
        return dto;
    }
}
