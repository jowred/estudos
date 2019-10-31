package br.com.contmatic.estudos.etapa2.jodatime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class DateCalendarTest {
	
	private Calendar calendario;
	
	@Before
	public void setUp() {
		calendario = Calendar.getInstance();
	}
	
	@After
	public void tearDown() {
		calendario = null;
	}
	
	@Test
	public void testDate() {
		Date data = new Date();
		dataHoraAgora(data);
	}
	
	@Test
	public void testCalendar() {
		dataHoraAgora(calendario);
	}
	
	@Test
	public void testGetDiaMesAno() {
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendario.get(Calendar.MONTH));
		System.out.println(calendario.get(Calendar.YEAR));
	}
	
	@Test
	public void testSetDiaMesAno() {
		calendario.set(Calendar.DAY_OF_MONTH, 1);
		calendario.set(Calendar.MONTH, 1);
		calendario.set(Calendar.YEAR, 2030);
		System.out.println(calendario.getTime());
	}
	
	@Test
	public void testDateFormat() {
		Date data = new Date();
		System.out.println("Data atual sem formatação: " + data);
		DateFormat dateFormat = DateFormat.getDateInstance(); //Data, apenas
		System.out.println("Data atual com formatação: " + dateFormat.format(data));
		dateFormat = DateFormat.getTimeInstance(); //Hora, apenas
		System.out.println("Hora atual com formatação: " + dateFormat.format(data));
		dateFormat = DateFormat.getDateTimeInstance(); //Ambas
		System.out.println("Hora e data com formatação: " + dateFormat.format(data));
	}
	
	@Test
	public void testConversaoDeDataComDateFormat() throws Exception {
		Date data = new Date();
		DateFormat df = DateFormat.getDateInstance();
		data = df.parse("15/04/2008");
		System.out.println(data);
		System.out.println(df.format(data));
	}
	
	@Test
	public void testConversaoDeDataComSimpleDateFormat() {
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(sdf.format(data));
	}
	
	private void dataHoraAgora(Date data) {
		if (data != null) {
			System.out.println("Data e hora atuais: " + data);
		} else {
			System.out.println("Objeto nulo");
		}
	}
	
	private void dataHoraAgora(Calendar calendario) {
		if (calendario != null) {
			System.out.println("Data e hora atuais: " + calendario.getTime());
		} else {
			System.out.println("Objeto nulo");
		}
	}
}
