package ups.edu.ec.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.modelo.Comida;
import ups.edu.ec.modelo.Pedido;
import ups.edu.ec.modelo.TarjetaCredito;

/**
 * Servlet implementation class CreacionPedido
 */
@WebServlet("/CreacionPedido")
public class CreacionPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreacionPedido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PedidoDAO pedidoDAO = DAOFactory.getFactory().getPedidoDAO();
		ComidaDAO comidaDAO = DAOFactory.getFactory().getComidaDAO();
		TarjetaDAO tarjetaDAO = DAOFactory.getFactory().getTarjetaDAO();
		 EntityManager em =Persistence.createEntityManagerFactory("jpa").createEntityManager();
		
		String fecha =request.getParameter("fecha");
		String cliente =request.getParameter("cliente");
		String observaciones =request.getParameter("observaciones");
		
		
		String nombre =request.getParameter("nombre");
		String precioUnitario =request.getParameter("precio");
		double pre=Double.parseDouble(precioUnitario);
		String numerotar =request.getParameter("numero");
		String nom =request.getParameter("nom");
		String fechcadu =request.getParameter("fechcadu");
		String cvv =request.getParameter("cvv");
		
		Pedido pe=new Pedido();
		pe.setFecha(fecha);
		pe.setCliente(cliente);
		pe.setObservaciones(observaciones);
		
		Comida co=new Comida();
		co.setNombre(nombre);
		co.setPreciouni(pre);
		
		TarjetaCredito tar=new TarjetaCredito();
		tar.setNumero(numerotar);
		tar.setNombre(nom);
		tar.setFechacadu(fechcadu);
		tar.setCvv(cvv);
		
		
		
		System.out.println("Creando entidades");
	    em.getTransaction().begin();
	    em.persist(pe);
	    em.getTransaction().commit();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
