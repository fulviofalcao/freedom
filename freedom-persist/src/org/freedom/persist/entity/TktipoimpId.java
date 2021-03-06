package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TktipoimpId generated by hbm2java
 */
@Embeddable
public class TktipoimpId implements java.io.Serializable {

	private int codtpimp;
	private short codfilial;
	private int codemp;

	public TktipoimpId() {
	}

	public TktipoimpId(int codtpimp, short codfilial, int codemp) {
		this.codtpimp = codtpimp;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODTPIMP", nullable = false)
	public int getCodtpimp() {
		return this.codtpimp;
	}

	public void setCodtpimp(int codtpimp) {
		this.codtpimp = codtpimp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TktipoimpId))
			return false;
		TktipoimpId castOther = (TktipoimpId) other;

		return (this.getCodtpimp() == castOther.getCodtpimp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodtpimp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
