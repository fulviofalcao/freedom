package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgvariavel generated by hbm2java
 */
@Entity
@Table(name = "SGVARIAVEL")
public class Sgvariavel implements java.io.Serializable {

	private SgvariavelId id;
	private Integer vlrinteger;
	private String vlrchar1;
	private String vlrchar2;
	private BigDecimal vlrdecimal;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgvariavel() {
	}

	public Sgvariavel(SgvariavelId id, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgvariavel(SgvariavelId id, Integer vlrinteger, String vlrchar1,
			String vlrchar2, BigDecimal vlrdecimal, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.vlrinteger = vlrinteger;
		this.vlrchar1 = vlrchar1;
		this.vlrchar2 = vlrchar2;
		this.vlrdecimal = vlrdecimal;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idvar", column = @Column(name = "IDVAR", nullable = false, length = 18)),
			@AttributeOverride(name = "idcon", column = @Column(name = "IDCON", nullable = false)) })
	public SgvariavelId getId() {
		return this.id;
	}

	public void setId(SgvariavelId id) {
		this.id = id;
	}

	@Column(name = "VLRINTEGER")
	public Integer getVlrinteger() {
		return this.vlrinteger;
	}

	public void setVlrinteger(Integer vlrinteger) {
		this.vlrinteger = vlrinteger;
	}

	@Column(name = "VLRCHAR1", length = 20)
	public String getVlrchar1() {
		return this.vlrchar1;
	}

	public void setVlrchar1(String vlrchar1) {
		this.vlrchar1 = vlrchar1;
	}

	@Column(name = "VLRCHAR2", length = 50)
	public String getVlrchar2() {
		return this.vlrchar2;
	}

	public void setVlrchar2(String vlrchar2) {
		this.vlrchar2 = vlrchar2;
	}

	@Column(name = "VLRDECIMAL", precision = 15, scale = 5)
	public BigDecimal getVlrdecimal() {
		return this.vlrdecimal;
	}

	public void setVlrdecimal(BigDecimal vlrdecimal) {
		this.vlrdecimal = vlrdecimal;
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
