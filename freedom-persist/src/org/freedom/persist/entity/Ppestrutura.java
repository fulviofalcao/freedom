package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Ppestrutura generated by hbm2java
 */
@Entity
@Table(name = "PPESTRUTURA")
public class Ppestrutura implements java.io.Serializable {

	private PpestruturaId id;
	private Eqproduto eqproduto;
	private Eqmodlote eqmodlote;
	private String descest;
	private BigDecimal qtdest;
	private String refprod;
	private char ativoest;
	private Short nrodiasvalid;
	private char gloteopp;
	private char usadensidadeop;
	private String observacao;
	private Character estdinamica;
	private char despauto;
	private char bloqqtdprod;
	private char expedirrma;
	private char gerarop;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Eqfatconv> eqfatconvs = new HashSet<Eqfatconv>(0);
	private Set<Ppestrufase> ppestrufases = new HashSet<Ppestrufase>(0);
	private Set<Ppop> ppops = new HashSet<Ppop>(0);
	private Set<Ppestrufase> ppestrufases_1 = new HashSet<Ppestrufase>(0);
	private Set<Ppdistrib> ppdistribs = new HashSet<Ppdistrib>(0);

	public Ppestrutura() {
	}

	public Ppestrutura(PpestruturaId id, Eqproduto eqproduto, String descest,
			BigDecimal qtdest, String refprod, char ativoest, char gloteopp,
			char usadensidadeop, char despauto, char bloqqtdprod,
			char expedirrma, char gerarop, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.descest = descest;
		this.qtdest = qtdest;
		this.refprod = refprod;
		this.ativoest = ativoest;
		this.gloteopp = gloteopp;
		this.usadensidadeop = usadensidadeop;
		this.despauto = despauto;
		this.bloqqtdprod = bloqqtdprod;
		this.expedirrma = expedirrma;
		this.gerarop = gerarop;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppestrutura(PpestruturaId id, Eqproduto eqproduto,
			Eqmodlote eqmodlote, String descest, BigDecimal qtdest,
			String refprod, char ativoest, Short nrodiasvalid, char gloteopp,
			char usadensidadeop, String observacao, Character estdinamica,
			char despauto, char bloqqtdprod, char expedirrma, char gerarop,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Eqfatconv> eqfatconvs,
			Set<Ppestrufase> ppestrufases, Set<Ppop> ppops,
			Set<Ppestrufase> ppestrufases_1, Set<Ppdistrib> ppdistribs) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqmodlote = eqmodlote;
		this.descest = descest;
		this.qtdest = qtdest;
		this.refprod = refprod;
		this.ativoest = ativoest;
		this.nrodiasvalid = nrodiasvalid;
		this.gloteopp = gloteopp;
		this.usadensidadeop = usadensidadeop;
		this.observacao = observacao;
		this.estdinamica = estdinamica;
		this.despauto = despauto;
		this.bloqqtdprod = bloqqtdprod;
		this.expedirrma = expedirrma;
		this.gerarop = gerarop;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqfatconvs = eqfatconvs;
		this.ppestrufases = ppestrufases;
		this.ppops = ppops;
		this.ppestrufases_1 = ppestrufases_1;
		this.ppdistribs = ppdistribs;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "seqest", column = @Column(name = "SEQEST", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public PpestruturaId getId() {
		return this.id;
	}

	public void setId(PpestruturaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODMODLOTE", referencedColumnName = "CODMODLOTE"),
			@JoinColumn(name = "CODFILIALML", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPML", referencedColumnName = "CODEMP") })
	public Eqmodlote getEqmodlote() {
		return this.eqmodlote;
	}

	public void setEqmodlote(Eqmodlote eqmodlote) {
		this.eqmodlote = eqmodlote;
	}

	@Column(name = "DESCEST", nullable = false, length = 50)
	public String getDescest() {
		return this.descest;
	}

	public void setDescest(String descest) {
		this.descest = descest;
	}

	@Column(name = "QTDEST", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdest() {
		return this.qtdest;
	}

	public void setQtdest(BigDecimal qtdest) {
		this.qtdest = qtdest;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "ATIVOEST", nullable = false, length = 1)
	public char getAtivoest() {
		return this.ativoest;
	}

	public void setAtivoest(char ativoest) {
		this.ativoest = ativoest;
	}

	@Column(name = "NRODIASVALID")
	public Short getNrodiasvalid() {
		return this.nrodiasvalid;
	}

	public void setNrodiasvalid(Short nrodiasvalid) {
		this.nrodiasvalid = nrodiasvalid;
	}

	@Column(name = "GLOTEOPP", nullable = false, length = 1)
	public char getGloteopp() {
		return this.gloteopp;
	}

	public void setGloteopp(char gloteopp) {
		this.gloteopp = gloteopp;
	}

	@Column(name = "USADENSIDADEOP", nullable = false, length = 1)
	public char getUsadensidadeop() {
		return this.usadensidadeop;
	}

	public void setUsadensidadeop(char usadensidadeop) {
		this.usadensidadeop = usadensidadeop;
	}

	@Column(name = "OBSERVACAO", length = 1000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "ESTDINAMICA", length = 1)
	public Character getEstdinamica() {
		return this.estdinamica;
	}

	public void setEstdinamica(Character estdinamica) {
		this.estdinamica = estdinamica;
	}

	@Column(name = "DESPAUTO", nullable = false, length = 1)
	public char getDespauto() {
		return this.despauto;
	}

	public void setDespauto(char despauto) {
		this.despauto = despauto;
	}

	@Column(name = "BLOQQTDPROD", nullable = false, length = 1)
	public char getBloqqtdprod() {
		return this.bloqqtdprod;
	}

	public void setBloqqtdprod(char bloqqtdprod) {
		this.bloqqtdprod = bloqqtdprod;
	}

	@Column(name = "EXPEDIRRMA", nullable = false, length = 1)
	public char getExpedirrma() {
		return this.expedirrma;
	}

	public void setExpedirrma(char expedirrma) {
		this.expedirrma = expedirrma;
	}

	@Column(name = "GERAROP", nullable = false, length = 1)
	public char getGerarop() {
		return this.gerarop;
	}

	public void setGerarop(char gerarop) {
		this.gerarop = gerarop;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppestrutura")
	public Set<Eqfatconv> getEqfatconvs() {
		return this.eqfatconvs;
	}

	public void setEqfatconvs(Set<Eqfatconv> eqfatconvs) {
		this.eqfatconvs = eqfatconvs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppestrutura")
	public Set<Ppestrufase> getPpestrufases() {
		return this.ppestrufases;
	}

	public void setPpestrufases(Set<Ppestrufase> ppestrufases) {
		this.ppestrufases = ppestrufases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppestrutura")
	public Set<Ppop> getPpops() {
		return this.ppops;
	}

	public void setPpops(Set<Ppop> ppops) {
		this.ppops = ppops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppestrutura")
	public Set<Ppestrufase> getPpestrufases_1() {
		return this.ppestrufases_1;
	}

	public void setPpestrufases_1(Set<Ppestrufase> ppestrufases_1) {
		this.ppestrufases_1 = ppestrufases_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppestrutura")
	public Set<Ppdistrib> getPpdistribs() {
		return this.ppdistribs;
	}

	public void setPpdistribs(Set<Ppdistrib> ppdistribs) {
		this.ppdistribs = ppdistribs;
	}

}
