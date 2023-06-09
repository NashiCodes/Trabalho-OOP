package com.dcc025.trabalhooop.persistence;

import com.dcc025.trabalhooop.model.Usuario;

import java.lang.*;

import com.google.gson.Gson;

import java.io.*;
import java.util.*;

public class UserPersistence implements Persistence<Usuario> {
    private static final String PATH = DIRECTORY + File.separator + "user.json"; // Caminho para o arquivo JSON

    @Override
    public void save(List<Usuario> itens) { // Função para salvar os dados em um arquivo JSON
        Gson gson = new Gson(); // Instancia um objeto Gson
        String json = gson.toJson(itens); // Converte a lista de objetos para uma string JSON

        File diretorio = new File(DIRECTORY); // Cria um objeto File para o diretório
        if (!diretorio.exists()) diretorio.mkdirs(); // Cria o diretório caso ele não exista

        Arquivo.salva(PATH, json); // Salva o arquivo
    }

    @Override
    public List<Usuario> findAll() {
        //TODO: implementar findAll
        return null;
    }
}
