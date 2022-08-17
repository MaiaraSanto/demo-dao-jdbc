package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Clicad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer Clicod;
	private String Clinome;
	private String Cliend;
	private String Clicep;
	private String Clidata;
	private String Cligenero;
	
	public Clicad() {
		
	}

	public Clicad(Integer clicod, String clinome, String cliend, String clicep, String clidata, String cligenero) {		
		Clicod = clicod;
		Clinome = clinome;
		Cliend = cliend;
		Clicep = clicep;
		Clidata = clidata;
		Cligenero = cligenero;

	}

	public Integer getClicod() {
		return Clicod;
	}

	public void setClicod(Integer clicod) {
		Clicod = clicod;
	}

	public String getClinome() {
		return Clinome;
	}

	public void setClinome(String clinome) {
		Clinome = clinome;
	}

	public String getCliend() {
		return Cliend;
	}

	public void setCliend(String cliend) {
		Cliend = cliend;
	}

	public String getClicep() {
		return Clicep;
	}

	public void setClicep(String clicep) {
		Clicep = clicep;
	}

	public String getClidata() {
		return Clidata;
	}

	public void setClidata(String clidata) {
		Clidata = clidata;
	}

	public String getCligenero() {
		return Cligenero;
	}

	public void setCligenero(String cligenero) {
		Cligenero = cligenero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Clicod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clicad other = (Clicad) obj;
		return Objects.equals(Clicod, other.Clicod);
	}

	@Override
	public String toString() {
		return "Clicad [Clicod=" + Clicod + ", Clinome=" + Clinome + ", Cliend=" + Cliend + ", Clicep=" + Clicep
				+ ", Clidata=" + Clidata + ", Cligenero=" + Cligenero + "]";
	}
				
}
