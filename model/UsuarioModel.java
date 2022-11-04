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
@Table(name = "usuario")

public class UsuarioModel {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)

			@Column(name = "idUsuario")
			private long idUsuario;

			@Column(name = "nomeUsuario", nullable = false, unique = true)
			private String nomeUsuario;

			@Column(name = "emailUsuario", nullable = true)
			private String emailUsuario;

			@Column(name = "senhaUsuario", nullable = true)
			private String senhaUsuario;

			@Column(name = "cpfUsuario", nullable = true)
			private String cpfUsuario;

			@Column(name = "sexoUsuario", nullable = true)
			private String sexoUsuario;

			@Column(name = "idGincana", nullable = true)
			private Gincana idGincana;


			public UsuarioModel() {

			}


			public UsuarioModel(long idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario,
					String cpfUsuario, String sexoUsuario, Gincana idGincana) {
				this.idUsuario = idUsuario;
				this.nomeUsuario = nomeUsuario;
				this.emailUsuario = emailUsuario;
				this.senhaUsuario = senhaUsuario;
				this.cpfUsuario = cpfUsuario;
				this.sexoUsuario = sexoUsuario;
				this.idGincana = idGincana;
			}


			public long getIdUsuario() {
				return idUsuario;
			}


			public void setIdUsuario(long idUsuario) {
				this.idUsuario = idUsuario;
			}


			public String getNomeUsuario() {
				return nomeUsuario;
			}


			public void setNomeUsuario(String nomeUsuario) {
				this.nomeUsuario = nomeUsuario;
			}


			public String getEmailUsuario() {
				return emailUsuario;
			}


			public void setEmailUsuario(String emailUsuario) {
				this.emailUsuario = emailUsuario;
			}


			public String getSenhaUsuario() {
				return senhaUsuario;
			}


			public void setSenhaUsuario(String senhaUsuario) {
				this.senhaUsuario = senhaUsuario;
			}


			public String getCpfUsuario() {
				return cpfUsuario;
			}


			public void setCpfUsuario(String cpfUsuario) {
				this.cpfUsuario = cpfUsuario;
			}


			public String getSexoUsuario() {
				return sexoUsuario;
			}


			public void setSexoUsuario(String sexoUsuario) {
				this.sexoUsuario = sexoUsuario;
			}


			public Gincana getIdGincana() {
				return idGincana;
			}


			public void setIdGincana(Gincana idGincana) {
				this.idGincana = idGincana;
			}


			@Override
			public String toString() {
				return "GincanaModel [idUsuario=" + idUsuario + ", nomeUsuario=" + nomeUsuario + ", emailUsuario="
						+ emailUsuario + ", senhaUsuario=" + senhaUsuario + ", cpfUsuario=" + cpfUsuario
						+ ", sexoUsuario=" + sexoUsuario + "]";
			}

}