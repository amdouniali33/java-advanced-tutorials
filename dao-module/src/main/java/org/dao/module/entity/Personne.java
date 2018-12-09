package org.dao.module.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  //
 @Column(name="NOM_PERSONNE")
  private String nom;
  //
 @Column(name="PRENOM_PERSONNE")
  private String prenom;
  //
 @Column(name="MAIL_PERSONNE")
  private String mail;
  
  //
 @Column(name="ADRESSE_PERSONNE")
  private String adresse;
  //
 @Column(name="TEL_PERSONNE")
  private String telephone;
  //
 @Column(name="AGE_PERSONNE")
  private String age;


  
  public Personne() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Personne( String nom, String prenom, String mail, String adresse, String telephone,
      String age) {
    super();
    
    this.nom = nom;
    this.prenom = prenom;
    this.mail = mail;
    this.adresse = adresse;
    this.telephone = telephone;
    this.age = age;
  }


  
  

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }



}
