import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class ConexionUDP extends Thread{

	public static int PUERTO = 5000;
	public static String IP = "192.168.0.14";

	public static InetAddress address;
	public static DatagramSocket socket;
	public static ConexionUDP servidorActual;

	public Observer observador;

	public ConexionUDP() {
		start();
	}
	// aquí es donde se incia el hilo por eso el system "esperando"
	@Override
	public void run() {
		inicializar();
		while(true) {
		System.out.println("Esperando");
			recibir();
			
		}
	}
	//Ip y puerto que se usan que estan definidos como variables globales
	private void inicializar() {
		try {
			address = InetAddress.getByName(IP);
			socket = new DatagramSocket(PUERTO);
			
			
	
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		}
	}

	static public ConexionUDP getInicializar() {

		if (servidorActual == null) {
			servidorActual = new ConexionUDP();
		}

		return servidorActual;
	}

	private void recibir() {
		//hilo para recibir 
//---------UDP-------
		byte[] loqueRecibo = new byte[30];

		try {
			DatagramPacket paquete = new DatagramPacket(loqueRecibo, loqueRecibo.length);
			socket.receive(paquete);
			String mensaje = new String(paquete.getData()).trim();
			mensajeRecibido(mensaje);

			address = paquete.getAddress();
			PUERTO = paquete.getPort();

			if (observador != null) {
				observador.recibirMensaje(mensaje);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void mensajeRecibido(String mensajeRec) {
	

	}
//hilo donde se envia 
	public void enviar(final String mensaje) {
		new Thread(new Runnable() {
//--------UDP-------
			@Override
			public void run() {
//envio a eclipse la IP y el puerto
				DatagramPacket paquete = new DatagramPacket(mensaje.getBytes(), mensaje.length(), address, PUERTO);

				try {

					socket.send(paquete);
		

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}).start();
	}
	
	public void setObservador(Observer observador) {
		this.observador = observador;
	}
	
	public void setPuerto(int PUERTOP){
		PUERTO = PUERTOP;
	}
	
	public void setAdress(String direccion){
		try {
			address = InetAddress.getByName(direccion);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

