package com.softwell.soft.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "prv_cliente")
@Entity
public class Client  {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO )
		private Integer id;
		
		@Column(name="nome", nullable=false)
		@Size(max=80, message="O nome deve ter até 80 caracteres")
		private String name;
		
		@Column(name="data_nasc", nullable=false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date data_nasc;
		
		@Column(name="rg", nullable = false)
		@Size(max=14, message="O RG deve ter até 14 caracteres")
		private String rg;
		
		@Column(name="cpf", nullable = false)
		@Size(max=14, message="O CPF deve ter até 14 caracteres")
		private String cpf;
		
		@Column(name="celular", nullable = false)
		@Size(max=14, message="O telefone deve ter até 14 caracteres")
		private String celular;
		
		@Column(name="email", nullable = false)
		@Size(max=60, message="O email deve ter até 60 caracteres")
		private String email;
		
		@Column(name="nome_mae", nullable = false)
		@Size(max=80, message="O nome da mãe deve ter até 80 caracteres")
		private String nome_mae;
		
		@Column(name="nome_pai", nullable = false)
		@Size(max=80, message="O nome do pai deve ter até 80 caracteres")
		private String nome_pai;
		
		@CreationTimestamp
		private LocalDateTime local;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getData_nasc() {
			return data_nasc;
		}

		public void setData_nasc(Date data_nasc) {
			this.data_nasc = data_nasc;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCelular() {
			return celular;
		}

		public void setCelular(String celular) {
			this.celular = celular;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNome_mae() {
			return nome_mae;
		}

		public void setNome_mae(String nome_mae) {
			this.nome_mae = nome_mae;
		}

		public String getNome_pai() {
			return nome_pai;
		}

		public void setNome_pai(String nome_pai) {
			this.nome_pai = nome_pai;
		}

		public LocalDateTime getLocal() {
			return local;
		}

		public void setLocal(LocalDateTime local) {
			this.local = local;
		}

		@Override
		public String toString() {
			return "Client [id=" + id + ", name=" + name + ", data_nasc=" + data_nasc + ", rg=" + rg + ", cpf=" + cpf
					+ ", celular=" + celular + ", email=" + email + ", nome_mae=" + nome_mae + ", nome_pai=" + nome_pai
					+ ", local=" + local + "]";
		}
	
}
