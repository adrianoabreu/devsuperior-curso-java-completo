package curso_programacao_orientacao_a_objetos_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TratandoDate {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("01/01/2022");
		Date y2 = sdf2.parse("01/01/2022 20:10:11");
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		//Obtendo data e horário atual
		Date x1 = new Date();
		System.out.println("x1: " + sdf2.format(x1));
		
		//Obtendo data e horário atual
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println("x2: " + sdf2.format(x2));
		
		//Passando milisegundos qualquer
		Date x3 = new Date(0L);
		System.out.println("x3: " + sdf2.format(x3));
	
		Date x4 = new Date(1000L * 60L * 60L * 5L); //1 segundo * 1 minuto * 1 hora * 5 horas
		System.out.println("x4: " + sdf2.format(x4));
		
		//ISO 8601 padrão UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("y3: " + sdf2.format(y3));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("----------------------");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y3: " + sdf3.format(y3));
		
	}

}
