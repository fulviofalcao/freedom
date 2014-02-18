package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Ppitretcp generated by hbm2java
 */
public class Ppitretcp implements java.io.Serializable {

	private PpitretcpId id;
	private Eqproduto eqproduto;
	private Ppretcp ppretcp;
	private BigDecimal qtditret;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppitretcp() {
	}

	public Ppitretcp(PpitretcpId id, Eqproduto eqproduto, Ppretcp ppretcp,
			BigDecimal qtditret, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.ppretcp = ppretcp;
		this.qtditret = qtditret;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppitretcp(PpitretcpId id, Eqproduto eqproduto, Ppretcp ppretcp,
			BigDecimal qtditret, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.ppretcp = ppretcp;
		this.qtditret = qtditret;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PpitretcpId getId() {
		return this.id;
	}

	public void setId(PpitretcpId id) {
		this.id = id;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public Ppretcp getPpretcp() {
		return this.ppretcp;
	}

	public void setPpretcp(Ppretcp ppretcp) {
		this.ppretcp = ppretcp;
	}

	public BigDecimal getQtditret() {
		return this.qtditret;
	}

	public void setQtditret(BigDecimal qtditret) {
		this.qtditret = qtditret;
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

}
