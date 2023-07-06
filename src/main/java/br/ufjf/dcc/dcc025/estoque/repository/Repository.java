package br.ufjf.dcc.dcc025.estoque.repository;

import br.ufjf.dcc.dcc025.estoque.model.Produto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final String DIRECTORY = "data";
    private final String PATH = DIRECTORY + File.separator + "estoque.json";
    
    public Repository(){        
        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();
    }
    
    public void salvar(List<Produto> itens) {                
        Gson gson = new Gson();
        String json = gson.toJson(itens);
        save(json);
    }

    public List<Produto> getAll() {
        Gson gson = new Gson();
        String json = read();

        List<Produto> itens = new ArrayList<>();
        if(!json.trim().equals("")) {                       
            Type tipoLista = new TypeToken<List<Produto>>(){}.getType();
            itens = gson.fromJson(json, tipoLista);

            if (itens == null)
                itens = new ArrayList<>();
        }
        return itens;
    }
    
    
    private String read() {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return content.toString();
    }

    private void save(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, false))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo \nDetalhes: " + e);
        }
    }
}
