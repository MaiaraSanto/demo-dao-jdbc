package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer Codcli;
	private String Nomecli;
	
	public Department( ) {	
	}

	public Department(Integer codcli, String nomecli) {
		Codcli = codcli;
		Nomecli = nomecli;
	}

	public Integer getCodcli() {
		return Codcli;
	}

	public void setCodcli(Integer codcli) {
		Codcli = codcli;
	}

	public String getNomecli() {
		return Nomecli;
	}

	public void setNomecli(String nomecli) {
		Nomecli = nomecli;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Codcli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Codcli, other.Codcli);
	}

	@Override
	public String toString() {
		return "Department [Codcli=" + Codcli + ", Nomecli=" + Nomecli + "]";
	}
			
}
