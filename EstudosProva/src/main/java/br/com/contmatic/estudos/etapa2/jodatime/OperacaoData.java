package br.com.contmatic.estudos.etapa2.jodatime;

import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Period;

public class OperacaoData {
	
	private OperacaoData() {}
	
	public boolean isAfterPayDay(DateTime dt) {
		if (dt.getMonthOfYear() == 2) {
			return dt.getDayOfMonth() > 26;
		}
		return dt.getDayOfMonth() > 28;
	}
	
	public Days daysToNewYear(LocalDate fromDate) {
		LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
		return Days.daysBetween(fromDate, newYear);
	}
	
	public boolean isRentalOverdue(DateTime dateTimeRented) {
		Period rentalPeriod = new Period().withDays(2).withHours(12);
		return dateTimeRented.plus(rentalPeriod).isBeforeNow();
	}
	
	public String getBirthMonthText(LocalDate dateOfBirth) {
		return dateOfBirth.monthOfYear().getAsText(Locale.FRANCE);
	}
}
