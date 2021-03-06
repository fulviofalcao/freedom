package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhvagacandidatoId generated by hbm2java
 */
@Embeddable
public class RhvagacandidatoId implements java.io.Serializable {

	private int codvaga;
	private short codfilial;
	private int codemp;
	private int codcand;
	private short codfilialca;
	private int codempca;

	public RhvagacandidatoId() {
	}

	public RhvagacandidatoId(int codvaga, short codfilial, int codemp,
			int codcand, short codfilialca, int codempca) {
		this.codvaga = codvaga;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codcand = codcand;
		this.codfilialca = codfilialca;
		this.codempca = codempca;
	}

	@Column(name = "CODVAGA", nullable = false)
	public int getCodvaga() {
		return this.codvaga;
	}

	public void setCodvaga(int codvaga) {
		this.codvaga = codvaga;
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

	@Column(name = "CODCAND", nullable = false)
	public int getCodcand() {
		return this.codcand;
	}

	public void setCodcand(int codcand) {
		this.codcand = codcand;
	}

	@Column(name = "CODFILIALCA", nullable = false)
	public short getCodfilialca() {
		return this.codfilialca;
	}

	public void setCodfilialca(short codfilialca) {
		this.codfilialca = codfilialca;
	}

	@Column(name = "CODEMPCA", nullable = false)
	public int getCodempca() {
		return this.codempca;
	}

	public void setCodempca(int codempca) {
		this.codempca = codempca;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RhvagacandidatoId))
			return false;
		RhvagacandidatoId castOther = (RhvagacandidatoId) other;

		return (this.getCodvaga() == castOther.getCodvaga())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodcand() == castOther.getCodcand())
				&& (this.getCodfilialca() == castOther.getCodfilialca())
				&& (this.getCodempca() == castOther.getCodempca());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodvaga();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodcand();
		result = 37 * result + this.getCodfilialca();
		result = 37 * result + this.getCodempca();
		return result;
	}

}
