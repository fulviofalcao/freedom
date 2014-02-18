package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sgprocesso generated by hbm2java
 */
public class Sgprocesso implements java.io.Serializable {

	private SgprocessoId id;
	private String descproc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgitprocessos = new HashSet(0);
	private Set sgitfluxos = new HashSet(0);

	public Sgprocesso() {
	}

	public Sgprocesso(SgprocessoId id, String descproc, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descproc = descproc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgprocesso(SgprocessoId id, String descproc, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgitprocessos, Set sgitfluxos) {
		this.id = id;
		this.descproc = descproc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgitprocessos = sgitprocessos;
		this.sgitfluxos = sgitfluxos;
	}

	public SgprocessoId getId() {
		return this.id;
	}

	public void setId(SgprocessoId id) {
		this.id = id;
	}

	public String getDescproc() {
		return this.descproc;
	}

	public void setDescproc(String descproc) {
		this.descproc = descproc;
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

	public Set getSgitprocessos() {
		return this.sgitprocessos;
	}

	public void setSgitprocessos(Set sgitprocessos) {
		this.sgitprocessos = sgitprocessos;
	}

	public Set getSgitfluxos() {
		return this.sgitfluxos;
	}

	public void setSgitfluxos(Set sgitfluxos) {
		this.sgitfluxos = sgitfluxos;
	}

}
