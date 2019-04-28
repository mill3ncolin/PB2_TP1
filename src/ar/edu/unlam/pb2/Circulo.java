package ar.edu.unlam.pb2;

public class Circulo {
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	private Double resultadoInterior;
	

	
	
	public Circulo (Double radioInterior, Double radioExterior) {
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;		
	}
	
	public Double calcularPerimetroInterior() {
		perimetroInterior= 2*Math.PI*radioInterior;
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExterior() {
		perimetroExterior= 2*Math.PI*radioExterior;
		return perimetroExterior;
	}
	
	public Double calcularSuperficie() {
		superficie=Math.PI*radioExterior*2;
		return superficie;
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double getPerimetroInterior() {
		return perimetroInterior;
	}

	public Double getPerimetroExterior() {
		return perimetroExterior;
	}

	public Double getSuperficie() {
		return superficie;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perimetroExterior == null) ? 0 : perimetroExterior.hashCode());
		result = prime * result + ((perimetroInterior == null) ? 0 : perimetroInterior.hashCode());
		result = prime * result + ((radioExterior == null) ? 0 : radioExterior.hashCode());
		result = prime * result + ((radioInterior == null) ? 0 : radioInterior.hashCode());
		result = prime * result + ((resultadoInterior == null) ? 0 : resultadoInterior.hashCode());
		result = prime * result + ((superficie == null) ? 0 : superficie.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (perimetroExterior == null) {
			if (other.perimetroExterior != null)
				return false;
		} else if (!perimetroExterior.equals(other.perimetroExterior))
			return false;
		if (perimetroInterior == null) {
			if (other.perimetroInterior != null)
				return false;
		} else if (!perimetroInterior.equals(other.perimetroInterior))
			return false;
		if (radioExterior == null) {
			if (other.radioExterior != null)
				return false;
		} else if (!radioExterior.equals(other.radioExterior))
			return false;
		if (radioInterior == null) {
			if (other.radioInterior != null)
				return false;
		} else if (!radioInterior.equals(other.radioInterior))
			return false;
		if (resultadoInterior == null) {
			if (other.resultadoInterior != null)
				return false;
		} else if (!resultadoInterior.equals(other.resultadoInterior))
			return false;
		if (superficie == null) {
			if (other.superficie != null)
				return false;
		} else if (!superficie.equals(other.superficie))
			return false;
		return true;
	}





	public Double getResultadoInterior() {
		return resultadoInterior;
	}





	public void setResultadoInterior(Double resultadoInterior) {
		this.resultadoInterior = resultadoInterior;
	}





	public void setPerimetroInterior(Double perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}





	public void setPerimetroExterior(Double perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}





	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}
	
	



}


