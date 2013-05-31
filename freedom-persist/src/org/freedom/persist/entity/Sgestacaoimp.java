package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

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
 * Sgestacaoimp generated by hbm2java
 */
@Entity
@Table(name = "SGESTACAOIMP")
public class Sgestacaoimp implements java.io.Serializable {

	private SgestacaoimpId id;
	private Sgestacao sgestacao;
	private Sgimpressora sgimpressora;
	private Sgpapel sgpapel;
	private int codemppp;
	private short codfilialpp;
	private String portawin;
	private String portalin;
	private char imppad;
	private String tipousoimp;
	private char impgrafica;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgestacaoimp() {
	}

	public Sgestacaoimp(SgestacaoimpId id, Sgestacao sgestacao,
			Sgimpressora sgimpressora, Sgpapel sgpapel, int codemppp,
			short codfilialpp, String portawin, String portalin, char imppad,
			String tipousoimp, char impgrafica, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.sgestacao = sgestacao;
		this.sgimpressora = sgimpressora;
		this.sgpapel = sgpapel;
		this.codemppp = codemppp;
		this.codfilialpp = codfilialpp;
		this.portawin = portawin;
		this.portalin = portalin;
		this.imppad = imppad;
		this.tipousoimp = tipousoimp;
		this.impgrafica = impgrafica;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgestacaoimp(SgestacaoimpId id, Sgestacao sgestacao,
			Sgimpressora sgimpressora, Sgpapel sgpapel, int codemppp,
			short codfilialpp, String portawin, String portalin, char imppad,
			String tipousoimp, char impgrafica, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.sgestacao = sgestacao;
		this.sgimpressora = sgimpressora;
		this.sgpapel = sgpapel;
		this.codemppp = codemppp;
		this.codfilialpp = codfilialpp;
		this.portawin = portawin;
		this.portalin = portalin;
		this.imppad = imppad;
		this.tipousoimp = tipousoimp;
		this.impgrafica = impgrafica;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codest", column = @Column(name = "CODEST", nullable = false)),
			@AttributeOverride(name = "nroimp", column = @Column(name = "NROIMP", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgestacaoimpId getId() {
		return this.id;
	}

	public void setId(SgestacaoimpId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEST", referencedColumnName = "CODEST", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgestacao getSgestacao() {
		return this.sgestacao;
	}

	public void setSgestacao(Sgestacao sgestacao) {
		this.sgestacao = sgestacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODIMP", referencedColumnName = "CODIMP", nullable = false),
			@JoinColumn(name = "CODFILIALIP", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPIP", referencedColumnName = "CODEMP", nullable = false) })
	public Sgimpressora getSgimpressora() {
		return this.sgimpressora;
	}

	public void setSgimpressora(Sgimpressora sgimpressora) {
		this.sgimpressora = sgimpressora;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPAPEL", referencedColumnName = "CODPAPEL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgpapel getSgpapel() {
		return this.sgpapel;
	}

	public void setSgpapel(Sgpapel sgpapel) {
		this.sgpapel = sgpapel;
	}

	@Column(name = "CODEMPPP", nullable = false)
	public int getCodemppp() {
		return this.codemppp;
	}

	public void setCodemppp(int codemppp) {
		this.codemppp = codemppp;
	}

	@Column(name = "CODFILIALPP", nullable = false)
	public short getCodfilialpp() {
		return this.codfilialpp;
	}

	public void setCodfilialpp(short codfilialpp) {
		this.codfilialpp = codfilialpp;
	}

	@Column(name = "PORTAWIN", nullable = false, length = 50)
	public String getPortawin() {
		return this.portawin;
	}

	public void setPortawin(String portawin) {
		this.portawin = portawin;
	}

	@Column(name = "PORTALIN", nullable = false, length = 50)
	public String getPortalin() {
		return this.portalin;
	}

	public void setPortalin(String portalin) {
		this.portalin = portalin;
	}

	@Column(name = "IMPPAD", nullable = false, length = 1)
	public char getImppad() {
		return this.imppad;
	}

	public void setImppad(char imppad) {
		this.imppad = imppad;
	}

	@Column(name = "TIPOUSOIMP", nullable = false, length = 2)
	public String getTipousoimp() {
		return this.tipousoimp;
	}

	public void setTipousoimp(String tipousoimp) {
		this.tipousoimp = tipousoimp;
	}

	@Column(name = "IMPGRAFICA", nullable = false, length = 1)
	public char getImpgrafica() {
		return this.impgrafica;
	}

	public void setImpgrafica(char impgrafica) {
		this.impgrafica = impgrafica;
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
