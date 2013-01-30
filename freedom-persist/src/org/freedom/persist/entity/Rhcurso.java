package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

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
 * Rhcurso generated by hbm2java
 */
@Entity
@Table(name = "RHCURSO")
public class Rhcurso implements java.io.Serializable {

	private RhcursoId id;
	private Sgfilial sgfilial;
	private Rharea rharea;
	private Rhnivelcurso rhnivelcurso;
	private String desccurso;
	private String contprogcurso;
	private String instituicaocurso;
	private Short duracaocurso;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Rhvagacurso> rhvagacursos = new HashSet<Rhvagacurso>(0);
	private Set<Rhcandidatocurso> rhcandidatocursos = new HashSet<Rhcandidatocurso>(
			0);

	public Rhcurso() {
	}

	public Rhcurso(RhcursoId id, Sgfilial sgfilial, Rhnivelcurso rhnivelcurso,
			String desccurso, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.rhnivelcurso = rhnivelcurso;
		this.desccurso = desccurso;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcurso(RhcursoId id, Sgfilial sgfilial, Rharea rharea,
			Rhnivelcurso rhnivelcurso, String desccurso, String contprogcurso,
			String instituicaocurso, Short duracaocurso, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set<Rhvagacurso> rhvagacursos,
			Set<Rhcandidatocurso> rhcandidatocursos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.rharea = rharea;
		this.rhnivelcurso = rhnivelcurso;
		this.desccurso = desccurso;
		this.contprogcurso = contprogcurso;
		this.instituicaocurso = instituicaocurso;
		this.duracaocurso = duracaocurso;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhvagacursos = rhvagacursos;
		this.rhcandidatocursos = rhcandidatocursos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcurso", column = @Column(name = "CODCURSO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public RhcursoId getId() {
		return this.id;
	}

	public void setId(RhcursoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODAREA", referencedColumnName = "CODAREA"),
			@JoinColumn(name = "CODFILIALAR", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAR", referencedColumnName = "CODEMP") })
	public Rharea getRharea() {
		return this.rharea;
	}

	public void setRharea(Rharea rharea) {
		this.rharea = rharea;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODNIVELCURSO", referencedColumnName = "CODNIVELCURSO", nullable = false),
			@JoinColumn(name = "CODFILIALNC", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPNC", referencedColumnName = "CODEMP", nullable = false) })
	public Rhnivelcurso getRhnivelcurso() {
		return this.rhnivelcurso;
	}

	public void setRhnivelcurso(Rhnivelcurso rhnivelcurso) {
		this.rhnivelcurso = rhnivelcurso;
	}

	@Column(name = "DESCCURSO", nullable = false, length = 60)
	public String getDesccurso() {
		return this.desccurso;
	}

	public void setDesccurso(String desccurso) {
		this.desccurso = desccurso;
	}

	@Column(name = "CONTPROGCURSO", length = 1000)
	public String getContprogcurso() {
		return this.contprogcurso;
	}

	public void setContprogcurso(String contprogcurso) {
		this.contprogcurso = contprogcurso;
	}

	@Column(name = "INSTITUICAOCURSO", length = 80)
	public String getInstituicaocurso() {
		return this.instituicaocurso;
	}

	public void setInstituicaocurso(String instituicaocurso) {
		this.instituicaocurso = instituicaocurso;
	}

	@Column(name = "DURACAOCURSO")
	public Short getDuracaocurso() {
		return this.duracaocurso;
	}

	public void setDuracaocurso(Short duracaocurso) {
		this.duracaocurso = duracaocurso;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcurso")
	public Set<Rhvagacurso> getRhvagacursos() {
		return this.rhvagacursos;
	}

	public void setRhvagacursos(Set<Rhvagacurso> rhvagacursos) {
		this.rhvagacursos = rhvagacursos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rhcurso")
	public Set<Rhcandidatocurso> getRhcandidatocursos() {
		return this.rhcandidatocursos;
	}

	public void setRhcandidatocursos(Set<Rhcandidatocurso> rhcandidatocursos) {
		this.rhcandidatocursos = rhcandidatocursos;
	}

}
