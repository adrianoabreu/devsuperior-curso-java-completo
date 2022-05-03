package curso_programacao_orientacao_a_objetos_main;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TratandoCalendar {

	public static void main(String[] args) {
		
		//Somando uma unidade de tempo:
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //o horário 12:42:07 se dá por conta do fuso horário de 3h com o horario dos Estados Unidos.
		
		System.out.println(sdf.format(d));
		
		//Para adicionar anos, meses, dias, horas, minutos e segundos, usamos a classe Calendar.
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); //nesse momento está adicionando 4 horas.
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//------------------------------------------------------------------------------
		
		//Obtendo uma unidade de tempo:
		int minutos = cal.get(Calendar.MINUTE);   //Obtendo os minutos de um determinado horário.
		int mes     = 1 + cal.get(Calendar.MONTH);//Obtendo o mês de uma determinada data. Acrescenta-se + 1 por que Janeiro começa com valor 0. 
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Mês:     " + mes);
		
	}

}
