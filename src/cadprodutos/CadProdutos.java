package cadprodutos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class CadProdutos extends Application {
    
    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Bem-Vindo ao Cadastro de Produtos!");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text titulo = new Text("Cadastro de Produtos");
        titulo.setId("cadastro-texto");
        grid.add(titulo, 0, 0, 2, 1);
        
        Label descricao = new Label("Descrição do produto:");
        grid.add(descricao, 0, 2);
        
        final TextField descricaoTF = new TextField();
        grid.add(descricaoTF, 0, 3);
        
        Label valor = new Label("Valor do produto:");
        grid.add(valor, 0, 4);
        
        final TextField valorTF = new TextField();
        grid.add(valorTF, 0, 5);
        
        Button salvar = new Button("Salvar");
        grid.add(salvar, 0, 7);
        
        Button lista = new Button("Lista");
        grid.add(lista, 1, 7);
        
        salvar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Produto p = new Produto();
                p.setDescricao(descricaoTF.getText());
                p.setValor(Double.parseDouble(valorTF.getText()));
                GerenciadorProdutos gp = new GerenciadorProdutos();
                gp.salvar(p);
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                descricaoTF.setText(null);
                valorTF.setText(null);
            }
        });
        
        lista.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Lista lista = new Lista();
                lista.start(primaryStage);
            }
        });
        
        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        //scene.getStylesheets().add(CadastroAluno.class.getResource("cadastro.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
