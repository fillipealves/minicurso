package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LISTA
 * @generated
 */
@Entity
@Table(name = "\"LISTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.lista")
public class lista implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "email", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "matricula", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer matricula;

  /**
   * Construtor
   * @generated
   */
  public lista(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public lista setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public lista setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public lista setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * Obtém matricula
   * return matricula
   * @generated
   */
  
  public java.lang.Integer getMatricula(){
    return this.matricula;
  }

  /**
   * Define matricula
   * @param matricula matricula
   * @generated
   */
  public lista setMatricula(java.lang.Integer matricula){
    this.matricula = matricula;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    lista object = (lista)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
