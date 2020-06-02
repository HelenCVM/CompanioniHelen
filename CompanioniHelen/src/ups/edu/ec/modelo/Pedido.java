package ups.edu.ec.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity

public class Pedido implements Serializable {

	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    private String fecha;
    private String cliente;
    private double total;
    private String observaciones;
    @OneToMany(cascade =CascadeType.ALL,mappedBy ="pedidos")
    private Set<Comida>comidas=new HashSet<Comida>();
    @ManyToOne
    @JoinColumn
    private TarjetaCredito tarjeta;
    
	
    
	public Pedido() {
		super();
	}



	public Pedido(int numero, String fecha, String cliente, double total, String observaciones) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.observaciones = observaciones;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public Set<Comida> getComidas() {
		return comidas;
	}



	public void setComidas(Set<Comida> comidas) {
		this.comidas = comidas;
	}



	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}



	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((comidas == null) ? 0 : comidas.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + numero;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((tarjeta == null) ? 0 : tarjeta.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (comidas == null) {
			if (other.comidas != null)
				return false;
		} else if (!comidas.equals(other.comidas))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (numero != other.numero)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (tarjeta == null) {
			if (other.tarjeta != null)
				return false;
		} else if (!tarjeta.equals(other.tarjeta))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total
				+ ", observaciones=" + observaciones + "]";
	}
	
	
	
	
   
}
