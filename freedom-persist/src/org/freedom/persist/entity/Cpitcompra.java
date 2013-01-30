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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpitcompra generated by hbm2java
 */
@Entity
@Table(name = "CPITCOMPRA")
public class Cpitcompra implements java.io.Serializable {

	private CpitcompraId id;
	private Eqproduto eqproduto;
	private Cpcompra cpcompra;
	private Lfnatoper lfnatoper;
	private Eqalmox eqalmox;
	private Eqlote eqlote;
	private Lfitclfiscal lfitclfiscal;
	private Eqserie eqserie;
	private BigDecimal qtditcompra;
	private BigDecimal qtditcompracanc;
	private BigDecimal precoitcompra;
	private BigDecimal percdescitcompra;
	private BigDecimal vlrdescitcompra;
	private BigDecimal percicmsitcompra;
	private BigDecimal vlrbaseicmsitcompra;
	private BigDecimal vlricmsitcompra;
	private BigDecimal percicmsstitcompra;
	private BigDecimal vlrbaseicmsstitcompra;
	private BigDecimal vlricmsstitcompra;
	private BigDecimal percipiitcompra;
	private BigDecimal vlrbaseipiitcompra;
	private BigDecimal vlripiitcompra;
	private BigDecimal vlrbasefunruralitcompra;
	private BigDecimal aliqfunruralitcompra;
	private BigDecimal vlrfunruralitcompra;
	private BigDecimal vlrliqitcompra;
	private BigDecimal vlradicitcompra;
	private BigDecimal vlrfreteitcompra;
	private BigDecimal vlrisentasitcompra;
	private BigDecimal vlroutrasitcompra;
	private BigDecimal vlrproditcompra;
	private BigDecimal custoitcompra;
	private BigDecimal custovditcompra;
	private String refprod;
	private String obsitcompra;
	private char emmanut;
	private Short nadicao;
	private Short seqadic;
	private BigDecimal descdi;
	private Character aprovpreco;
	private Character emititcompra;
	private BigDecimal aliqissitcompra;
	private BigDecimal vlrissitcompra;
	private BigDecimal vlriiitcompra;
	private BigDecimal vlritoutrasdespitcompra;
	private char calccusto;
	private char adicicmstotnota;
	private BigDecimal vlrtxsiscomexitcompra;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Ppop> ppops = new HashSet<Ppop>(0);
	private Set<Cpcompraped> cpcomprapedsForCpcomprapedfkcpcompraped = new HashSet<Cpcompraped>(
			0);
	private Set<Cpitcompraitcompra> cpitcompraitcomprasForCpitcompitcfkitcp1 = new HashSet<Cpitcompraitcompra>(
			0);
	private Set<Cpdevolucao> cpdevolucaos = new HashSet<Cpdevolucao>(0);
	private Lfitcompra lfitcompra;
	private Cpcompravenda cpcompravenda;
	private Set<Cpitcompraitcompra> cpitcompraitcomprasForCpitcompitcfkitcp2 = new HashSet<Cpitcompraitcompra>(
			0);
	private Set<Vditvenda> vditvendas = new HashSet<Vditvenda>(0);
	private Set<Eqmovprod> eqmovprods = new HashSet<Eqmovprod>(0);
	private Set<Cpcompraped> cpcomprapedsForCpcomprapedfkcpcompra = new HashSet<Cpcompraped>(
			0);
	private Set<Eqitrecmercitcp> eqitrecmercitcps = new HashSet<Eqitrecmercitcp>(
			0);
	private Set<Eqmovserie> eqmovseries = new HashSet<Eqmovserie>(0);

	public Cpitcompra() {
	}

	public Cpitcompra(CpitcompraId id, Eqproduto eqproduto, Cpcompra cpcompra,
			Lfnatoper lfnatoper, Eqalmox eqalmox, Eqlote eqlote,
			Eqserie eqserie, BigDecimal qtditcompra, BigDecimal precoitcompra,
			BigDecimal percicmsstitcompra, BigDecimal vlrbaseicmsstitcompra,
			BigDecimal vlricmsstitcompra, BigDecimal vlrbasefunruralitcompra,
			BigDecimal aliqfunruralitcompra, BigDecimal vlrfunruralitcompra,
			BigDecimal custovditcompra, char emmanut, char calccusto,
			char adicicmstotnota, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpcompra = cpcompra;
		this.lfnatoper = lfnatoper;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.eqserie = eqserie;
		this.qtditcompra = qtditcompra;
		this.precoitcompra = precoitcompra;
		this.percicmsstitcompra = percicmsstitcompra;
		this.vlrbaseicmsstitcompra = vlrbaseicmsstitcompra;
		this.vlricmsstitcompra = vlricmsstitcompra;
		this.vlrbasefunruralitcompra = vlrbasefunruralitcompra;
		this.aliqfunruralitcompra = aliqfunruralitcompra;
		this.vlrfunruralitcompra = vlrfunruralitcompra;
		this.custovditcompra = custovditcompra;
		this.emmanut = emmanut;
		this.calccusto = calccusto;
		this.adicicmstotnota = adicicmstotnota;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpitcompra(CpitcompraId id, Eqproduto eqproduto, Cpcompra cpcompra,
			Lfnatoper lfnatoper, Eqalmox eqalmox, Eqlote eqlote,
			Lfitclfiscal lfitclfiscal, Eqserie eqserie, BigDecimal qtditcompra,
			BigDecimal qtditcompracanc, BigDecimal precoitcompra,
			BigDecimal percdescitcompra, BigDecimal vlrdescitcompra,
			BigDecimal percicmsitcompra, BigDecimal vlrbaseicmsitcompra,
			BigDecimal vlricmsitcompra, BigDecimal percicmsstitcompra,
			BigDecimal vlrbaseicmsstitcompra, BigDecimal vlricmsstitcompra,
			BigDecimal percipiitcompra, BigDecimal vlrbaseipiitcompra,
			BigDecimal vlripiitcompra, BigDecimal vlrbasefunruralitcompra,
			BigDecimal aliqfunruralitcompra, BigDecimal vlrfunruralitcompra,
			BigDecimal vlrliqitcompra, BigDecimal vlradicitcompra,
			BigDecimal vlrfreteitcompra, BigDecimal vlrisentasitcompra,
			BigDecimal vlroutrasitcompra, BigDecimal vlrproditcompra,
			BigDecimal custoitcompra, BigDecimal custovditcompra,
			String refprod, String obsitcompra, char emmanut, Short nadicao,
			Short seqadic, BigDecimal descdi, Character aprovpreco,
			Character emititcompra, BigDecimal aliqissitcompra,
			BigDecimal vlrissitcompra, BigDecimal vlriiitcompra,
			BigDecimal vlritoutrasdespitcompra, char calccusto,
			char adicicmstotnota, BigDecimal vlrtxsiscomexitcompra, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Ppop> ppops,
			Set<Cpcompraped> cpcomprapedsForCpcomprapedfkcpcompraped,
			Set<Cpitcompraitcompra> cpitcompraitcomprasForCpitcompitcfkitcp1,
			Set<Cpdevolucao> cpdevolucaos, Lfitcompra lfitcompra,
			Cpcompravenda cpcompravenda,
			Set<Cpitcompraitcompra> cpitcompraitcomprasForCpitcompitcfkitcp2,
			Set<Vditvenda> vditvendas, Set<Eqmovprod> eqmovprods,
			Set<Cpcompraped> cpcomprapedsForCpcomprapedfkcpcompra,
			Set<Eqitrecmercitcp> eqitrecmercitcps, Set<Eqmovserie> eqmovseries) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.cpcompra = cpcompra;
		this.lfnatoper = lfnatoper;
		this.eqalmox = eqalmox;
		this.eqlote = eqlote;
		this.lfitclfiscal = lfitclfiscal;
		this.eqserie = eqserie;
		this.qtditcompra = qtditcompra;
		this.qtditcompracanc = qtditcompracanc;
		this.precoitcompra = precoitcompra;
		this.percdescitcompra = percdescitcompra;
		this.vlrdescitcompra = vlrdescitcompra;
		this.percicmsitcompra = percicmsitcompra;
		this.vlrbaseicmsitcompra = vlrbaseicmsitcompra;
		this.vlricmsitcompra = vlricmsitcompra;
		this.percicmsstitcompra = percicmsstitcompra;
		this.vlrbaseicmsstitcompra = vlrbaseicmsstitcompra;
		this.vlricmsstitcompra = vlricmsstitcompra;
		this.percipiitcompra = percipiitcompra;
		this.vlrbaseipiitcompra = vlrbaseipiitcompra;
		this.vlripiitcompra = vlripiitcompra;
		this.vlrbasefunruralitcompra = vlrbasefunruralitcompra;
		this.aliqfunruralitcompra = aliqfunruralitcompra;
		this.vlrfunruralitcompra = vlrfunruralitcompra;
		this.vlrliqitcompra = vlrliqitcompra;
		this.vlradicitcompra = vlradicitcompra;
		this.vlrfreteitcompra = vlrfreteitcompra;
		this.vlrisentasitcompra = vlrisentasitcompra;
		this.vlroutrasitcompra = vlroutrasitcompra;
		this.vlrproditcompra = vlrproditcompra;
		this.custoitcompra = custoitcompra;
		this.custovditcompra = custovditcompra;
		this.refprod = refprod;
		this.obsitcompra = obsitcompra;
		this.emmanut = emmanut;
		this.nadicao = nadicao;
		this.seqadic = seqadic;
		this.descdi = descdi;
		this.aprovpreco = aprovpreco;
		this.emititcompra = emititcompra;
		this.aliqissitcompra = aliqissitcompra;
		this.vlrissitcompra = vlrissitcompra;
		this.vlriiitcompra = vlriiitcompra;
		this.vlritoutrasdespitcompra = vlritoutrasdespitcompra;
		this.calccusto = calccusto;
		this.adicicmstotnota = adicicmstotnota;
		this.vlrtxsiscomexitcompra = vlrtxsiscomexitcompra;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppops = ppops;
		this.cpcomprapedsForCpcomprapedfkcpcompraped = cpcomprapedsForCpcomprapedfkcpcompraped;
		this.cpitcompraitcomprasForCpitcompitcfkitcp1 = cpitcompraitcomprasForCpitcompitcfkitcp1;
		this.cpdevolucaos = cpdevolucaos;
		this.lfitcompra = lfitcompra;
		this.cpcompravenda = cpcompravenda;
		this.cpitcompraitcomprasForCpitcompitcfkitcp2 = cpitcompraitcomprasForCpitcompitcfkitcp2;
		this.vditvendas = vditvendas;
		this.eqmovprods = eqmovprods;
		this.cpcomprapedsForCpcomprapedfkcpcompra = cpcomprapedsForCpcomprapedfkcpcompra;
		this.eqitrecmercitcps = eqitrecmercitcps;
		this.eqmovseries = eqmovseries;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "coditcompra", column = @Column(name = "CODITCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpitcompraId getId() {
		return this.id;
	}

	public void setId(CpitcompraId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCOMPRA", referencedColumnName = "CODCOMPRA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Cpcompra getCpcompra() {
		return this.cpcompra;
	}

	public void setCpcompra(Cpcompra cpcompra) {
		this.cpcompra = cpcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODNAT", referencedColumnName = "CODNAT", nullable = false),
			@JoinColumn(name = "CODFILIALNT", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPNT", referencedColumnName = "CODEMP", nullable = false) })
	public Lfnatoper getLfnatoper() {
		return this.lfnatoper;
	}

	public void setLfnatoper(Lfnatoper lfnatoper) {
		this.lfnatoper = lfnatoper;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODALMOX", referencedColumnName = "CODALMOX", nullable = false),
			@JoinColumn(name = "CODFILIALAX", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPAX", referencedColumnName = "CODEMP", nullable = false) })
	public Eqalmox getEqalmox() {
		return this.eqalmox;
	}

	public void setEqalmox(Eqalmox eqalmox) {
		this.eqalmox = eqalmox;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODLOTE", referencedColumnName = "CODLOTE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALLE", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPLE", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Eqlote getEqlote() {
		return this.eqlote;
	}

	public void setEqlote(Eqlote eqlote) {
		this.eqlote = eqlote;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMPIF", referencedColumnName = "CODEMP"),
			@JoinColumn(name = "CODFILIALIF", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODFISC", referencedColumnName = "CODFISC"),
			@JoinColumn(name = "CODITFISC", referencedColumnName = "CODITFISC") })
	public Lfitclfiscal getLfitclfiscal() {
		return this.lfitclfiscal;
	}

	public void setLfitclfiscal(Lfitclfiscal lfitclfiscal) {
		this.lfitclfiscal = lfitclfiscal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMSERIETMP", referencedColumnName = "NUMSERIE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALNS", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPNS", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Eqserie getEqserie() {
		return this.eqserie;
	}

	public void setEqserie(Eqserie eqserie) {
		this.eqserie = eqserie;
	}

	@Column(name = "QTDITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditcompra() {
		return this.qtditcompra;
	}

	public void setQtditcompra(BigDecimal qtditcompra) {
		this.qtditcompra = qtditcompra;
	}

	@Column(name = "QTDITCOMPRACANC", precision = 15, scale = 5)
	public BigDecimal getQtditcompracanc() {
		return this.qtditcompracanc;
	}

	public void setQtditcompracanc(BigDecimal qtditcompracanc) {
		this.qtditcompracanc = qtditcompracanc;
	}

	@Column(name = "PRECOITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPrecoitcompra() {
		return this.precoitcompra;
	}

	public void setPrecoitcompra(BigDecimal precoitcompra) {
		this.precoitcompra = precoitcompra;
	}

	@Column(name = "PERCDESCITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getPercdescitcompra() {
		return this.percdescitcompra;
	}

	public void setPercdescitcompra(BigDecimal percdescitcompra) {
		this.percdescitcompra = percdescitcompra;
	}

	@Column(name = "VLRDESCITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrdescitcompra() {
		return this.vlrdescitcompra;
	}

	public void setVlrdescitcompra(BigDecimal vlrdescitcompra) {
		this.vlrdescitcompra = vlrdescitcompra;
	}

	@Column(name = "PERCICMSITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getPercicmsitcompra() {
		return this.percicmsitcompra;
	}

	public void setPercicmsitcompra(BigDecimal percicmsitcompra) {
		this.percicmsitcompra = percicmsitcompra;
	}

	@Column(name = "VLRBASEICMSITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsitcompra() {
		return this.vlrbaseicmsitcompra;
	}

	public void setVlrbaseicmsitcompra(BigDecimal vlrbaseicmsitcompra) {
		this.vlrbaseicmsitcompra = vlrbaseicmsitcompra;
	}

	@Column(name = "VLRICMSITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlricmsitcompra() {
		return this.vlricmsitcompra;
	}

	public void setVlricmsitcompra(BigDecimal vlricmsitcompra) {
		this.vlricmsitcompra = vlricmsitcompra;
	}

	@Column(name = "PERCICMSSTITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getPercicmsstitcompra() {
		return this.percicmsstitcompra;
	}

	public void setPercicmsstitcompra(BigDecimal percicmsstitcompra) {
		this.percicmsstitcompra = percicmsstitcompra;
	}

	@Column(name = "VLRBASEICMSSTITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsstitcompra() {
		return this.vlrbaseicmsstitcompra;
	}

	public void setVlrbaseicmsstitcompra(BigDecimal vlrbaseicmsstitcompra) {
		this.vlrbaseicmsstitcompra = vlrbaseicmsstitcompra;
	}

	@Column(name = "VLRICMSSTITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlricmsstitcompra() {
		return this.vlricmsstitcompra;
	}

	public void setVlricmsstitcompra(BigDecimal vlricmsstitcompra) {
		this.vlricmsstitcompra = vlricmsstitcompra;
	}

	@Column(name = "PERCIPIITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getPercipiitcompra() {
		return this.percipiitcompra;
	}

	public void setPercipiitcompra(BigDecimal percipiitcompra) {
		this.percipiitcompra = percipiitcompra;
	}

	@Column(name = "VLRBASEIPIITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseipiitcompra() {
		return this.vlrbaseipiitcompra;
	}

	public void setVlrbaseipiitcompra(BigDecimal vlrbaseipiitcompra) {
		this.vlrbaseipiitcompra = vlrbaseipiitcompra;
	}

	@Column(name = "VLRIPIITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlripiitcompra() {
		return this.vlripiitcompra;
	}

	public void setVlripiitcompra(BigDecimal vlripiitcompra) {
		this.vlripiitcompra = vlripiitcompra;
	}

	@Column(name = "VLRBASEFUNRURALITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrbasefunruralitcompra() {
		return this.vlrbasefunruralitcompra;
	}

	public void setVlrbasefunruralitcompra(BigDecimal vlrbasefunruralitcompra) {
		this.vlrbasefunruralitcompra = vlrbasefunruralitcompra;
	}

	@Column(name = "ALIQFUNRURALITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getAliqfunruralitcompra() {
		return this.aliqfunruralitcompra;
	}

	public void setAliqfunruralitcompra(BigDecimal aliqfunruralitcompra) {
		this.aliqfunruralitcompra = aliqfunruralitcompra;
	}

	@Column(name = "VLRFUNRURALITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getVlrfunruralitcompra() {
		return this.vlrfunruralitcompra;
	}

	public void setVlrfunruralitcompra(BigDecimal vlrfunruralitcompra) {
		this.vlrfunruralitcompra = vlrfunruralitcompra;
	}

	@Column(name = "VLRLIQITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrliqitcompra() {
		return this.vlrliqitcompra;
	}

	public void setVlrliqitcompra(BigDecimal vlrliqitcompra) {
		this.vlrliqitcompra = vlrliqitcompra;
	}

	@Column(name = "VLRADICITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlradicitcompra() {
		return this.vlradicitcompra;
	}

	public void setVlradicitcompra(BigDecimal vlradicitcompra) {
		this.vlradicitcompra = vlradicitcompra;
	}

	@Column(name = "VLRFRETEITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrfreteitcompra() {
		return this.vlrfreteitcompra;
	}

	public void setVlrfreteitcompra(BigDecimal vlrfreteitcompra) {
		this.vlrfreteitcompra = vlrfreteitcompra;
	}

	@Column(name = "VLRISENTASITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrisentasitcompra() {
		return this.vlrisentasitcompra;
	}

	public void setVlrisentasitcompra(BigDecimal vlrisentasitcompra) {
		this.vlrisentasitcompra = vlrisentasitcompra;
	}

	@Column(name = "VLROUTRASITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlroutrasitcompra() {
		return this.vlroutrasitcompra;
	}

	public void setVlroutrasitcompra(BigDecimal vlroutrasitcompra) {
		this.vlroutrasitcompra = vlroutrasitcompra;
	}

	@Column(name = "VLRPRODITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrproditcompra() {
		return this.vlrproditcompra;
	}

	public void setVlrproditcompra(BigDecimal vlrproditcompra) {
		this.vlrproditcompra = vlrproditcompra;
	}

	@Column(name = "CUSTOITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getCustoitcompra() {
		return this.custoitcompra;
	}

	public void setCustoitcompra(BigDecimal custoitcompra) {
		this.custoitcompra = custoitcompra;
	}

	@Column(name = "CUSTOVDITCOMPRA", nullable = false, precision = 15, scale = 5)
	public BigDecimal getCustovditcompra() {
		return this.custovditcompra;
	}

	public void setCustovditcompra(BigDecimal custovditcompra) {
		this.custovditcompra = custovditcompra;
	}

	@Column(name = "REFPROD", length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "OBSITCOMPRA", length = 10000)
	public String getObsitcompra() {
		return this.obsitcompra;
	}

	public void setObsitcompra(String obsitcompra) {
		this.obsitcompra = obsitcompra;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	@Column(name = "NADICAO")
	public Short getNadicao() {
		return this.nadicao;
	}

	public void setNadicao(Short nadicao) {
		this.nadicao = nadicao;
	}

	@Column(name = "SEQADIC")
	public Short getSeqadic() {
		return this.seqadic;
	}

	public void setSeqadic(Short seqadic) {
		this.seqadic = seqadic;
	}

	@Column(name = "DESCDI", precision = 15, scale = 5)
	public BigDecimal getDescdi() {
		return this.descdi;
	}

	public void setDescdi(BigDecimal descdi) {
		this.descdi = descdi;
	}

	@Column(name = "APROVPRECO", length = 1)
	public Character getAprovpreco() {
		return this.aprovpreco;
	}

	public void setAprovpreco(Character aprovpreco) {
		this.aprovpreco = aprovpreco;
	}

	@Column(name = "EMITITCOMPRA", length = 1)
	public Character getEmititcompra() {
		return this.emititcompra;
	}

	public void setEmititcompra(Character emititcompra) {
		this.emititcompra = emititcompra;
	}

	@Column(name = "ALIQISSITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getAliqissitcompra() {
		return this.aliqissitcompra;
	}

	public void setAliqissitcompra(BigDecimal aliqissitcompra) {
		this.aliqissitcompra = aliqissitcompra;
	}

	@Column(name = "VLRISSITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrissitcompra() {
		return this.vlrissitcompra;
	}

	public void setVlrissitcompra(BigDecimal vlrissitcompra) {
		this.vlrissitcompra = vlrissitcompra;
	}

	@Column(name = "VLRIIITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlriiitcompra() {
		return this.vlriiitcompra;
	}

	public void setVlriiitcompra(BigDecimal vlriiitcompra) {
		this.vlriiitcompra = vlriiitcompra;
	}

	@Column(name = "VLRITOUTRASDESPITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlritoutrasdespitcompra() {
		return this.vlritoutrasdespitcompra;
	}

	public void setVlritoutrasdespitcompra(BigDecimal vlritoutrasdespitcompra) {
		this.vlritoutrasdespitcompra = vlritoutrasdespitcompra;
	}

	@Column(name = "CALCCUSTO", nullable = false, length = 1)
	public char getCalccusto() {
		return this.calccusto;
	}

	public void setCalccusto(char calccusto) {
		this.calccusto = calccusto;
	}

	@Column(name = "ADICICMSTOTNOTA", nullable = false, length = 1)
	public char getAdicicmstotnota() {
		return this.adicicmstotnota;
	}

	public void setAdicicmstotnota(char adicicmstotnota) {
		this.adicicmstotnota = adicicmstotnota;
	}

	@Column(name = "VLRTXSISCOMEXITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrtxsiscomexitcompra() {
		return this.vlrtxsiscomexitcompra;
	}

	public void setVlrtxsiscomexitcompra(BigDecimal vlrtxsiscomexitcompra) {
		this.vlrtxsiscomexitcompra = vlrtxsiscomexitcompra;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Set<Ppop> getPpops() {
		return this.ppops;
	}

	public void setPpops(Set<Ppop> ppops) {
		this.ppops = ppops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompraByCpcomprapedfkcpcompraped")
	public Set<Cpcompraped> getCpcomprapedsForCpcomprapedfkcpcompraped() {
		return this.cpcomprapedsForCpcomprapedfkcpcompraped;
	}

	public void setCpcomprapedsForCpcomprapedfkcpcompraped(
			Set<Cpcompraped> cpcomprapedsForCpcomprapedfkcpcompraped) {
		this.cpcomprapedsForCpcomprapedfkcpcompraped = cpcomprapedsForCpcomprapedfkcpcompraped;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompraByCpitcompitcfkitcp1")
	public Set<Cpitcompraitcompra> getCpitcompraitcomprasForCpitcompitcfkitcp1() {
		return this.cpitcompraitcomprasForCpitcompitcfkitcp1;
	}

	public void setCpitcompraitcomprasForCpitcompitcfkitcp1(
			Set<Cpitcompraitcompra> cpitcompraitcomprasForCpitcompitcfkitcp1) {
		this.cpitcompraitcomprasForCpitcompitcfkitcp1 = cpitcompraitcomprasForCpitcompitcfkitcp1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Set<Cpdevolucao> getCpdevolucaos() {
		return this.cpdevolucaos;
	}

	public void setCpdevolucaos(Set<Cpdevolucao> cpdevolucaos) {
		this.cpdevolucaos = cpdevolucaos;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Lfitcompra getLfitcompra() {
		return this.lfitcompra;
	}

	public void setLfitcompra(Lfitcompra lfitcompra) {
		this.lfitcompra = lfitcompra;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Cpcompravenda getCpcompravenda() {
		return this.cpcompravenda;
	}

	public void setCpcompravenda(Cpcompravenda cpcompravenda) {
		this.cpcompravenda = cpcompravenda;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompraByCpitcompitcfkitcp2")
	public Set<Cpitcompraitcompra> getCpitcompraitcomprasForCpitcompitcfkitcp2() {
		return this.cpitcompraitcomprasForCpitcompitcfkitcp2;
	}

	public void setCpitcompraitcomprasForCpitcompitcfkitcp2(
			Set<Cpitcompraitcompra> cpitcompraitcomprasForCpitcompitcfkitcp2) {
		this.cpitcompraitcomprasForCpitcompitcfkitcp2 = cpitcompraitcomprasForCpitcompitcfkitcp2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Set<Vditvenda> getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set<Vditvenda> vditvendas) {
		this.vditvendas = vditvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Set<Eqmovprod> getEqmovprods() {
		return this.eqmovprods;
	}

	public void setEqmovprods(Set<Eqmovprod> eqmovprods) {
		this.eqmovprods = eqmovprods;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompraByCpcomprapedfkcpcompra")
	public Set<Cpcompraped> getCpcomprapedsForCpcomprapedfkcpcompra() {
		return this.cpcomprapedsForCpcomprapedfkcpcompra;
	}

	public void setCpcomprapedsForCpcomprapedfkcpcompra(
			Set<Cpcompraped> cpcomprapedsForCpcomprapedfkcpcompra) {
		this.cpcomprapedsForCpcomprapedfkcpcompra = cpcomprapedsForCpcomprapedfkcpcompra;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Set<Eqitrecmercitcp> getEqitrecmercitcps() {
		return this.eqitrecmercitcps;
	}

	public void setEqitrecmercitcps(Set<Eqitrecmercitcp> eqitrecmercitcps) {
		this.eqitrecmercitcps = eqitrecmercitcps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpitcompra")
	public Set<Eqmovserie> getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set<Eqmovserie> eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

}
