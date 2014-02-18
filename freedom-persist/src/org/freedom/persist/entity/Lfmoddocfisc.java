package org.freedom.persist.entity;

// Generated 18/02/2014 15:53:28 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lfmoddocfisc generated by hbm2java
 */
public class Lfmoddocfisc implements java.io.Serializable {

	private LfmoddocfiscId id;
	private Sgfilial sgfilial;
	private String descmoddocfisc;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set eqtipomovs = new HashSet(0);

	public Lfmoddocfisc() {
	}

	public Lfmoddocfisc(LfmoddocfiscId id, Sgfilial sgfilial,
			String descmoddocfisc, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmoddocfisc = descmoddocfisc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfmoddocfisc(LfmoddocfiscId id, Sgfilial sgfilial,
			String descmoddocfisc, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set eqtipomovs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descmoddocfisc = descmoddocfisc;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqtipomovs = eqtipomovs;
	}

	public LfmoddocfiscId getId() {
		return this.id;
	}

	public void setId(LfmoddocfiscId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescmoddocfisc() {
		return this.descmoddocfisc;
	}

	public void setDescmoddocfisc(String descmoddocfisc) {
		this.descmoddocfisc = descmoddocfisc;
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

	public Set getEqtipomovs() {
		return this.eqtipomovs;
	}

	public void setEqtipomovs(Set eqtipomovs) {
		this.eqtipomovs = eqtipomovs;
	}

}
