package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Atatendimentovw04 generated by hbm2java
 */
@Entity
@Table(name = "ATATENDIMENTOVW04")
public class Atatendimentovw04 implements java.io.Serializable {

	private Atatendimentovw04Id id;

	public Atatendimentovw04() {
	}

	public Atatendimentovw04(Atatendimentovw04Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dataatendo", column = @Column(name = "DATAATENDO", length = 10)),
			@AttributeOverride(name = "codempct", column = @Column(name = "CODEMPCT")),
			@AttributeOverride(name = "codfilialct", column = @Column(name = "CODFILIALCT")),
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR")),
			@AttributeOverride(name = "coditcontr", column = @Column(name = "CODITCONTR")),
			@AttributeOverride(name = "anoatendo", column = @Column(name = "ANOATENDO")),
			@AttributeOverride(name = "mesatendo", column = @Column(name = "MESATENDO")),
			@AttributeOverride(name = "totalhorastrab", column = @Column(name = "TOTALHORASTRAB", precision = 0, scale = 4)),
			@AttributeOverride(name = "codempoc", column = @Column(name = "CODEMPOC")),
			@AttributeOverride(name = "codfilialoc", column = @Column(name = "CODFILIALOC")),
			@AttributeOverride(name = "tipoorc", column = @Column(name = "TIPOORC", length = 1)),
			@AttributeOverride(name = "codorc", column = @Column(name = "CODORC")) })
	public Atatendimentovw04Id getId() {
		return this.id;
	}

	public void setId(Atatendimentovw04Id id) {
		this.id = id;
	}

}
