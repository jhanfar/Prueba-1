// default package
// Generated 10-may-2014 11:58:30 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbMicVersionpensum generated by hbm2java
 */
public class TbMicVersionpensum implements java.io.Serializable {

	private long nbVpeIdn;
	private Set tbMicCursosxpensums = new HashSet(0);

	public TbMicVersionpensum() {
	}

	public TbMicVersionpensum(long nbVpeIdn) {
		this.nbVpeIdn = nbVpeIdn;
	}

	public TbMicVersionpensum(long nbVpeIdn, Set tbMicCursosxpensums) {
		this.nbVpeIdn = nbVpeIdn;
		this.tbMicCursosxpensums = tbMicCursosxpensums;
	}

	public long getNbVpeIdn() {
		return this.nbVpeIdn;
	}

	public void setNbVpeIdn(long nbVpeIdn) {
		this.nbVpeIdn = nbVpeIdn;
	}

	public Set getTbMicCursosxpensums() {
		return this.tbMicCursosxpensums;
	}

	public void setTbMicCursosxpensums(Set tbMicCursosxpensums) {
		this.tbMicCursosxpensums = tbMicCursosxpensums;
	}

}
