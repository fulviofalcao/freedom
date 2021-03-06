package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqmodlote generated by hbm2java
 */
@Entity
@Table(name = "EQMODLOTE")
public class Eqmodlote implements java.io.Serializable {

	private EqmodloteId id;
	private String descmodlote;
	private String txamodlote;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppestruturas = new HashSet(0);

	public Eqmodlote() {
	}

	public Eqmodlote(EqmodloteId id, String descmodlote, String txamodlote,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.descmodlote = descmodlote;
		this.txamodlote = txamodlote;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqmodlote(EqmodloteId id, String descmodlote, String txamodlote,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set ppestruturas) {
		this.id = id;
		this.descmodlote = descmodlote;
		this.txamodlote = txamodlote;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppestruturas = ppestruturas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codmodlote", column = @Column(name = "CODMODLOTE", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqmodloteId getId() {
		return this.id;
	}

	public void setId(EqmodloteId id) {
		this.id = id;
	}

	@Column(name = "DESCMODLOTE", nullable = false, length = 30)
	public String getDescmodlote() {
		return this.descmodlote;
	}

	public void setDescmodlote(String descmodlote) {
		this.descmodlote = descmodlote;
	}

	@Column(name = "TXAMODLOTE", nullable = false, length = 100)
	public String getTxamodlote() {
		return this.txamodlote;
	}

	public void setTxamodlote(String txamodlote) {
		this.txamodlote = txamodlote;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqmodlote")
	public Set getPpestruturas() {
		return this.ppestruturas;
	}

	public void setPpestruturas(Set ppestruturas) {
		this.ppestruturas = ppestruturas;
	}
*/
}
