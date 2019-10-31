package br.com.contmatic.estudos.etapa2.jodatime;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.junit.Test;

public class OperacaoDataTest {

	@Test
	public void testIsAfterPayDay() {
		DateTime dt = new DateTime();
		dt.withDate(2019, 10, 23);
//		OperacaoData
	}
	
	@Test
	public void testMillis() {
		// Configurando a data referência
        DateTimeZone timeZone = DateTimeZone.forID("GMT");
        DateTime dateTime1 = new DateTime(1970, 01, 01, 00, 00, 00, timeZone);
        // Deve ser 0
        System.out.println("Diferença em milisegundos = " + dateTime1.getMillis());
         
        // Configurando uma hora de diferença
        DateTime dateTime2 = dateTime1.plusHours(1);
        // Deve ser de 1 hora = 3600000 milisegundos
        System.out.println("Diferença em milisegundos = " + dateTime2.getMillis());
        System.out.println("Diferença em horas = " + Hours.hoursBetween(dateTime1, 
        dateTime2).getHours());
	}
	
	@Test
	public void testDateTimeToString() {
		DateTime dateTime = new DateTime(1970, 01, 01, 00, 00, 00);
        // Imprimindo a data no formato YYYY-MM-dd
        System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd"));
        // Imprimindo a data no formato YYYY-MM-dd HH:mm:ss
        System.out.println("dateTime.toString() = " + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
        // Imprimindo o mês: Janeiro
        System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText());
        // Imprimindo o mês: Jan
        System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());         
        // Imprimindo o mês em Inglês
        System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
        DateTime dt = new DateTime(1997, new Integer(03), 26, 00, 03, 55);
        System.out.println(dt.toString("dd-MM-YYYY"));
        System.out.println(dt.toString("dd-MM-YYYY HH:mm:ss"));
        //Retorna o mês em forma de número
        System.out.println(dt.getMonthOfYear());
        //Retorna o mês em texto, no idioma do sistema
        System.out.println(dt.monthOfYear().getAsText());
    }	
}
