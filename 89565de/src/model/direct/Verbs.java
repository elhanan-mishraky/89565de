package model.direct;

// Generated 18:12:01 17/08/2011 by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;

/**
 * Verbs generated by hbm2java
 */
public class Verbs implements java.io.Serializable {

	private VerbsId id;
	private BigDecimal score;

	public Verbs() {
	}

	public Verbs(VerbsId id, BigDecimal score) {
		this.id = id;
		this.score = score;
	}

	public VerbsId getId() {
		return this.id;
	}

	public void setId(VerbsId id) {
		this.id = id;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

}
