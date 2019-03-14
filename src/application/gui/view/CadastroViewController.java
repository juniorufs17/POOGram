package application.gui.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class CadastroViewController implements Initializable{
	
	@FXML private TextField textFieldNome;
	@FXML private TextField textFieldSobrenome;
	@FXML private TextField textFieldEmail;
	@FXML private TextField textFieldSecundario;
	@FXML private PasswordField passwordFieldSenha;
	@FXML private PasswordField passwordFieldConfirmarSenha;
	@FXML private Button buttonProximo;
	@FXML private Button buttonVoltar;
	@FXML private SplitMenuButton menuButtonGender;
	@FXML private MenuItem menuItemMasc;
	@FXML private MenuItem menuItemFem;
	
	@FXML
	private void getNome() {
		String nome = textFieldNome.getText();
		System.out.println(nome);
	}
	
	@FXML
	private void getSobreNome() {
		String sobrenome = textFieldSobrenome.getText();
		System.out.println(sobrenome);
	}
	
	@FXML
	private void getEmail() {
		String email = textFieldEmail.getText();
		System.out.println(email);
	}
	
	@FXML
	private void getSecundario() {
		String secundario = textFieldSecundario.getText();
		System.out.println(secundario);
	}
	
	@FXML
	private void getSenha() {
		String senha = passwordFieldSenha.getText();
		System.out.println(senha);
	}
	
	@FXML
	private void getConfirmarSenhar() {
		String confirmarSenha = passwordFieldConfirmarSenha.getText();
		System.out.println(confirmarSenha);
	}
	
	@FXML
	private void onProximoPressed() {
		this.getNome();
		this.getSobreNome();
		this.getEmail();
		this.getSecundario();
		this.getSenha();
		this.getConfirmarSenhar();
	}
	
	@FXML
	private void onMenuGenderChoiced(Event event) {
		if (event.getSource() == menuItemMasc) {
			menuButtonGender.setText("Man");
			menuButtonGender.setOpacity(1);
			System.out.println(menuItemMasc.getText());
		} else {
			menuButtonGender.setText("Woman");
			System.out.println(menuItemFem.getText());
			menuButtonGender.setOpacity(1);
		}
	}
	
	@FXML
	private void onVoltarPressed() {
		
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
				
	}

}