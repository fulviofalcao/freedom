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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lfsittrib generated by hbm2java
 */
@Entity
@Table(name = "LFSITTRIB")
public class Lfsittrib implements java.io.Serializable {

	private LfsittribId id;
	private Sgfilial sgfilial;
	private String descsittrib;
	private char operacao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitvendasForLfitvendafklfsittribipi = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribpis = new HashSet(0);
	private Set lfitvendasForLfitvendafklfsittribpis = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribiss = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribcof = new HashSet(0);
	private Set lfitvendasForLfitvendafklfsittribcof = new HashSet(0);
	private Set lfitclfiscalsForLfitclsfiscalfklfsittribipi = new HashSet(0);

	public Lfsittrib() {
	}

	public Lfsittrib(LfsittribId id, Sgfilial sgfilial, String descsittrib,
			char operacao, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsittrib = descsittrib;
		this.operacao = operacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfsittrib(LfsittribId id, Sgfilial sgfilial, String descsittrib,
			char operacao, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt,
			Set lfitvendasForLfitvendafklfsittribipi,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribpis,
			Set lfitvendasForLfitvendafklfsittribpis,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribiss,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribcof,
			Set lfitvendasForLfitvendafklfsittribcof,
			Set lfitclfiscalsForLfitclsfiscalfklfsittribipi) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descsittrib = descsittrib;
		this.operacao = operacao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitvendasForLfitvendafklfsittribipi = lfitvendasForLfitvendafklfsittribipi;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribpis = lfitclfiscalsForLfitclsfiscalfklfsittribpis;
		this.lfitvendasForLfitvendafklfsittribpis = lfitvendasForLfitvendafklfsittribpis;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribiss = lfitclfiscalsForLfitclsfiscalfklfsittribiss;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribcof = lfitclfiscalsForLfitclsfiscalfklfsittribcof;
		this.lfitvendasForLfitvendafklfsittribcof = lfitvendasForLfitvendafklfsittribcof;
		this.lfitclfiscalsForLfitclsfiscalfklfsittribipi = lfitclfiscalsForLfitclsfiscalfklfsittribipi;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codsittrib", column = @Column(name = "CODSITTRIB", nullable = false, length = 2)),
			@AttributeOverride(name = "impsittrib", column = @Column(name = "IMPSITTRIB", nullable = false, length = 2)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfsittribId getId() {
		return this.id;
	}

	public void setId(LfsittribId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCSITTRIB", nullable = false, length = 200)
	public String getDescsittrib() {
		return this.descsittrib;
	}

	public void setDescsittrib(String descsittrib) {
		this.descsittrib = descsittrib;
	}

	@Column(name = "OPERACAO", nullable = false, length = 1)
	public char getOperacao() {
		return this.operacao;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitvendafklfsittribipi")
	public Set getLfitvendasForLfitvendafklfsittribipi() {
		return this.lfitvendasForLfitvendafklfsittribipi;
	}

	public void setLfitvendasForLfitvendafklfsittribipi(
			Set lfitvendasForLfitvendafklfsittribipi) {
		this.lfitvendasForLfitvendafklfsittribipi = lfitvendasForLfitvendafklfsittribipi;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitclsfiscalfklfsittribpis")
	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribpis() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribpis;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribpis(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribpis) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribpis = lfitclfiscalsForLfitclsfiscalfklfsittribpis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitvendafklfsittribpis")
	public Set getLfitvendasForLfitvendafklfsittribpis() {
		return this.lfitvendasForLfitvendafklfsittribpis;
	}

	public void setLfitvendasForLfitvendafklfsittribpis(
			Set lfitvendasForLfitvendafklfsittribpis) {
		this.lfitvendasForLfitvendafklfsittribpis = lfitvendasForLfitvendafklfsittribpis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitclsfiscalfklfsittribiss")
	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribiss() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribiss;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribiss(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribiss) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribiss = lfitclfiscalsForLfitclsfiscalfklfsittribiss;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitclsfiscalfklfsittribcof")
	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribcof() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribcof;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribcof(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribcof) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribcof = lfitclfiscalsForLfitclsfiscalfklfsittribcof;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitvendafklfsittribcof")
	public Set getLfitvendasForLfitvendafklfsittribcof() {
		return this.lfitvendasForLfitvendafklfsittribcof;
	}

	public void setLfitvendasForLfitvendafklfsittribcof(
			Set lfitvendasForLfitvendafklfsittribcof) {
		this.lfitvendasForLfitvendafklfsittribcof = lfitvendasForLfitvendafklfsittribcof;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfsittribByLfitclsfiscalfklfsittribipi")
	public Set getLfitclfiscalsForLfitclsfiscalfklfsittribipi() {
		return this.lfitclfiscalsForLfitclsfiscalfklfsittribipi;
	}

	public void setLfitclfiscalsForLfitclsfiscalfklfsittribipi(
			Set lfitclfiscalsForLfitclsfiscalfklfsittribipi) {
		this.lfitclfiscalsForLfitclsfiscalfklfsittribipi = lfitclfiscalsForLfitclsfiscalfklfsittribipi;
	}
*/
}
