package br.edu.ifba.gincana.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")

public class UsuarioModel {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)

			@Column(name = "id_Usuario")
			private long id_Usuario;

			@Column(name = "nome_Usuario", nullable = false)
			private String nome_Usuario;

			@Column(name = "email_Usuario", nullable = true)
			private String email_Usuario;

			@Column(name = "senha_Usuario", nullable = true)
			private String senha_Usuario;

			@Column(name = "sexo_Usuario", nullable = true)
			private String sexo_Usuario;
			
			@Column(name = "data_de_Cadastro", nullable = true)
			private Date data_de_Cadastro;

			@Column(name = "id_Gincana")
			private long id_Gincana ;

			//	@Column(name = "id_Equipe")
			//	private long id_Equipe;

			
			public UsuarioModel() {
		
			}

			public UsuarioModel(long id_Usuario, String nome_Usuario, String email_Usuario, String senha_Usuario,
					String sexo_Usuario, Date data_de_Cadastro, long id_Gincana) {
				this.id_Usuario = id_Usuario;
				this.nome_Usuario = nome_Usuario;
				this.email_Usuario = email_Usuario;
				this.senha_Usuario = senha_Usuario;
				this.sexo_Usuario = sexo_Usuario;
				this.data_de_Cadastro = data_de_Cadastro;
				this.id_Gincana = id_Gincana;
			}

			public long getId_Usuario() {
				return id_Usuario;
			}

			public void setId_Usuario(long id_Usuario) {
				this.id_Usuario = id_Usuario;
			}

			public String getNome_Usuario() {
				return nome_Usuario;
			}

			public void setNome_Usuario(String nome_Usuario) {
				this.nome_Usuario = nome_Usuario;
			}

			public String getEmail_Usuario() {
				return email_Usuario;
			}

			public void setEmail_Usuario(String email_Usuario) {
				this.email_Usuario = email_Usuario;
			}

			public String getSenha_Usuario() {
				return senha_Usuario;
			}

			public void setSenha_Usuario(String senha_Usuario) {
				this.senha_Usuario = senha_Usuario;
			}

			public String getSexo_Usuario() {
				return sexo_Usuario;
			}

			public void setSexo_Usuario(String sexo_Usuario) {
				this.sexo_Usuario = sexo_Usuario;
			}

			public Date getData_de_Cadastro() {
				return data_de_Cadastro;
			}

			public void setData_de_Cadastro(Date data_de_Cadastro) {
				this.data_de_Cadastro = data_de_Cadastro;
			}

			public long getId_Gincana() {
				return id_Gincana;
			}

			public void setId_Gincana(long id_Gincana) {
				this.id_Gincana = id_Gincana;
			}

			@Override
			public String toString() {
				return "UsuarioModel [id_Usuario=" + id_Usuario + ", nome_Usuario=" + nome_Usuario + ", email_Usuario="
						+ email_Usuario + ", senha_Usuario=" + senha_Usuario + ", sexo_Usuario=" + sexo_Usuario
						+ ", data_De_Cadastro=" + data_De_Cadastro + ", id_Gincana=" + id_Gincana + "]";
			}
			
	
}