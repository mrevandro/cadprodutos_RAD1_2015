

package cadprodutos;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Lista extends Application{
    private final TableView tabela = new TableView();
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Lista");
        stage.setWidth(300);
        stage.setHeight(500);
        
        final Label label = new Label("Produtos Cadastrados");
        label.setFont(new Font("Arial", 20));
 
        tabela.setEditable(false);
 
        TableColumn descricao = new TableColumn("Descrição");
        TableColumn valor = new TableColumn("Valor");
        
        tabela.getColumns().addAll(descricao, valor);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, tabela);
        
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }

}
