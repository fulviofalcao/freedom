package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Fnitbordero generated by hbm2java
 */
@Entity
@Table(name = "FNITBORDERO")
public class Fnitbordero implements java.io.Serializable {

	private FnitborderoId id;
	private Fnitreceber fnitreceber;
	private Fnbordero fnbordero;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Fnitbordero() {
	}

	public Fnitbordero(FnitborderoId id, Fnitreceber fnitreceber,
			Fnbordero fnbordero, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.fnbordero = fnbordero;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnitbordero(FnitborderoId id, Fnitreceber fnitreceber,
			Fnbordero fnbordero, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.fnbordero = fnbordero;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codbor", column = @Column(name = "CODBOR", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "codrec", column = @Column(name = "CODREC", nullable = false)),
			@AttributeOverride(name = "nparcitrec", column = @Column(name = "NPARCITREC", nullable = false)),
			@AttributeOverride(name = "codfilialrc", column = @Column(name = "CODFILIALRC", nullable = false)),
			@AttributeOverride(name = "codemprc", column = @Column(name = "CODEMPRC", nullable = false)) })
	public FnitborderoId getId() {
		return this.id;
	}

	public void setId(FnitborderoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODREC", referencedColumnName = "CODREC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NPARCITREC", referencedColumnName = "NPARCITREC", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALRC", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPRC", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBOR", referencedColumnName = "CODBOR", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Fnbordero getFnbordero() {
		return this.fnbordero;
	}

	public void setFnbordero(Fnbordero fnbordero) {
		this.fnbordero = fnbordero;
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

}
