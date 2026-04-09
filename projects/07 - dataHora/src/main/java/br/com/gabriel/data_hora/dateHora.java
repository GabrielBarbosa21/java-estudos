package br.com.gabriel.data_hora.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dateHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime  date = LocalDateTime.now();
		Instant agora = Instant.now();
		
		ZoneId.getAvailableZoneIds();
		
		System.out.println(date.format(fmt));

	}

}
