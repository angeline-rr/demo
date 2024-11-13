package com.escola.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.escola.Model.Aluno;
import com.escola.Model.Escola;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControladorGeral implements Initializable{
    
    @FXML private Button botaoAdicionar;
    @FXML private Button botaoRemover;
    @FXML private Button botaoListar;
    @FXML private Button botaoBuscarNome;
    @FXML private Button botaoBuscarCpf;
    

    @FXML private TableView<Aluno> alunoTableView;
    @FXML private TableColumn<Aluno, String> nomeColuna;
    @FXML private TableColumn<Aluno, String> cpfColuna;
    @FXML private TableColumn<Aluno, String> emailColuna;
    @FXML private TableColumn<Aluno, String> anoColuna;



    //SceneController sc = new SceneController();

    private ObservableList<Aluno> listaAlunos = FXCollections.observableArrayList();
    private Escola escola;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        
        listaAlunos.setAll(escola.getAlunos());

        alunoTableView.setEditable(true);
    }


}
