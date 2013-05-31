package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Fnhistpad generated by hbm2java
 */
@Entity
@Table(name = "FNHISTPAD")
public class Fnhistpad implements java.io.Serializable {

	private FnhistpadId id;
	private String deschist;
	private String txahistpad;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Cpforneced> cpforneceds = new HashSet<Cpforneced>(0);
	private Set<Vdcliente> vdclientes = new HashSet<Vdcliente>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkfnhistp = new HashSet<Sgprefere1>(
			0);
	private Set<Fnconta> fncontas = new HashSet<Fnconta>(0);
	private Set<Sgprefere1> sgprefere1sForSgprefere1fkfnhistr = new HashSet<Sgprefere1>(
			0);
	private Set<Fnplanejamento> fnplanejamentos = new HashSet<Fnplanejamento>(0);

	public Fnhistpad() {
	}

	public Fnhistpad(FnhistpadId id, String deschist, String txahistpad,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.deschist = deschist;
		this.txahistpad = txahistpad;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Fnhistpad(FnhistpadId id, String deschist, String txahistpad,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Cpforneced> cpforneceds,
			Set<Vdcliente> vdclientes,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkfnhistp,
			Set<Fnconta> fncontas,
			Set<Sgprefere1> sgprefere1sForSgprefere1fkfnhistr,
			Set<Fnplanejamento> fnplanejamentos) {
		this.id = id;
		this.deschist = deschist;
		this.txahistpad = txahistpad;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpforneceds = cpforneceds;
		this.vdclientes = vdclientes;
		this.sgprefere1sForSgprefere1fkfnhistp = sgprefere1sForSgprefere1fkfnhistp;
		this.fncontas = fncontas;
		this.sgprefere1sForSgprefere1fkfnhistr = sgprefere1sForSgprefere1fkfnhistr;
		this.fnplanejamentos = fnplanejamentos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codhist", column = @Column(name = "CODHIST", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public FnhistpadId getId() {
		return this.id;
	}

	public void setId(FnhistpadId id) {
		this.id = id;
	}

	@Column(name = "DESCHIST", nullable = false, length = 80)
	public String getDeschist() {
		return this.deschist;
	}

	public void setDeschist(String deschist) {
		this.deschist = deschist;
	}

	@Column(name = "TXAHISTPAD", nullable = false, length = 500)
	public String getTxahistpad() {
		return this.txahistpad;
	}

	public void setTxahistpad(String txahistpad) {
		this.txahistpad = txahistpad;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnhistpad")
	public Set<Cpforneced> getCpforneceds() {
		return this.cpforneceds;
	}

	public void setCpforneceds(Set<Cpforneced> cpforneceds) {
		this.cpforneceds = cpforneceds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnhistpad")
	public Set<Vdcliente> getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set<Vdcliente> vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnhistpadBySgprefere1fkfnhistp")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkfnhistp() {
		return this.sgprefere1sForSgprefere1fkfnhistp;
	}

	public void setSgprefere1sForSgprefere1fkfnhistp(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkfnhistp) {
		this.sgprefere1sForSgprefere1fkfnhistp = sgprefere1sForSgprefere1fkfnhistp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnhistpad")
	public Set<Fnconta> getFncontas() {
		return this.fncontas;
	}

	public void setFncontas(Set<Fnconta> fncontas) {
		this.fncontas = fncontas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnhistpadBySgprefere1fkfnhistr")
	public Set<Sgprefere1> getSgprefere1sForSgprefere1fkfnhistr() {
		return this.sgprefere1sForSgprefere1fkfnhistr;
	}

	public void setSgprefere1sForSgprefere1fkfnhistr(
			Set<Sgprefere1> sgprefere1sForSgprefere1fkfnhistr) {
		this.sgprefere1sForSgprefere1fkfnhistr = sgprefere1sForSgprefere1fkfnhistr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fnhistpad")
	public Set<Fnplanejamento> getFnplanejamentos() {
		return this.fnplanejamentos;
	}

	public void setFnplanejamentos(Set<Fnplanejamento> fnplanejamentos) {
		this.fnplanejamentos = fnplanejamentos;
	}

}
