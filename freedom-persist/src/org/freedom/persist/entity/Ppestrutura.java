package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppestrutura generated by hbm2java
 */
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
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqfatconvs = new HashSet(0);
	private Set ppestrufases = new HashSet(0);
	private Set ppops = new HashSet(0);
	private Set ppestrufases_1 = new HashSet(0);
	private Set ppdistribs = new HashSet(0);

	public Ppestrutura() {
	}

	public Ppestrutura(PpestruturaId id, Eqproduto eqproduto, String descest,
			BigDecimal qtdest, String refprod, char ativoest, char gloteopp,
			char usadensidadeop, char despauto, char bloqqtdprod,
			char expedirrma, char gerarop, char emmanut, Date dtins, Date hins,
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
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppestrutura(PpestruturaId id, Eqproduto eqproduto,
			Eqmodlote eqmodlote, String descest, BigDecimal qtdest,
			String refprod, char ativoest, Short nrodiasvalid, char gloteopp,
			char usadensidadeop, String observacao, Character estdinamica,
			char despauto, char bloqqtdprod, char expedirrma, char gerarop,
			char emmanut, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set eqfatconvs, Set ppestrufases,
			Set ppops, Set ppestrufases_1, Set ppdistribs) {
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
		this.emmanut = emmanut;
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

	public PpestruturaId getId() {
		return this.id;
	}

	public void setId(PpestruturaId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Eqmodlote getEqmodlote() {
		return this.eqmodlote;
	}

	public void setEqmodlote(Eqmodlote eqmodlote) {
		this.eqmodlote = eqmodlote;
	}

	public String getDescest() {
		return this.descest;
	}

	public void setDescest(String descest) {
		this.descest = descest;
	}

	public BigDecimal getQtdest() {
		return this.qtdest;
	}

	public void setQtdest(BigDecimal qtdest) {
		this.qtdest = qtdest;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public char getAtivoest() {
		return this.ativoest;
	}

	public void setAtivoest(char ativoest) {
		this.ativoest = ativoest;
	}

	public Short getNrodiasvalid() {
		return this.nrodiasvalid;
	}

	public void setNrodiasvalid(Short nrodiasvalid) {
		this.nrodiasvalid = nrodiasvalid;
	}

	public char getGloteopp() {
		return this.gloteopp;
	}

	public void setGloteopp(char gloteopp) {
		this.gloteopp = gloteopp;
	}

	public char getUsadensidadeop() {
		return this.usadensidadeop;
	}

	public void setUsadensidadeop(char usadensidadeop) {
		this.usadensidadeop = usadensidadeop;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Character getEstdinamica() {
		return this.estdinamica;
	}

	public void setEstdinamica(Character estdinamica) {
		this.estdinamica = estdinamica;
	}

	public char getDespauto() {
		return this.despauto;
	}

	public void setDespauto(char despauto) {
		this.despauto = despauto;
	}

	public char getBloqqtdprod() {
		return this.bloqqtdprod;
	}

	public void setBloqqtdprod(char bloqqtdprod) {
		this.bloqqtdprod = bloqqtdprod;
	}

	public char getExpedirrma() {
		return this.expedirrma;
	}

	public void setExpedirrma(char expedirrma) {
		this.expedirrma = expedirrma;
	}

	public char getGerarop() {
		return this.gerarop;
	}

	public void setGerarop(char gerarop) {
		this.gerarop = gerarop;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getEqfatconvs() {
		return this.eqfatconvs;
	}

	public void setEqfatconvs(Set eqfatconvs) {
		this.eqfatconvs = eqfatconvs;
	}

	public Set getPpestrufases() {
		return this.ppestrufases;
	}

	public void setPpestrufases(Set ppestrufases) {
		this.ppestrufases = ppestrufases;
	}

	public Set getPpops() {
		return this.ppops;
	}

	public void setPpops(Set ppops) {
		this.ppops = ppops;
	}

	public Set getPpestrufases_1() {
		return this.ppestrufases_1;
	}

	public void setPpestrufases_1(Set ppestrufases_1) {
		this.ppestrufases_1 = ppestrufases_1;
	}

	public Set getPpdistribs() {
		return this.ppdistribs;
	}

	public void setPpdistribs(Set ppdistribs) {
		this.ppdistribs = ppdistribs;
	}

}
