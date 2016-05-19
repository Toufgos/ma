package net.youssfi.eboutique.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommande;
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@OneToMany
	@JoinColumn(name = "idCommande")
	private Collection<LigneCommande> ligneCommandes;

	// Getters et Setters
	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	// Cosntructeur sans paramètre
	// Cosntructeur avec paramètres

	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

}
