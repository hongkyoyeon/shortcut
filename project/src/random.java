import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

	public class random {

			public static void main(String[] args) {

					Runnable runnable = new Runnable() {

		

						public void run() {

							Random random = new Random();
							double aaa = Math.random();
					
							System.out.println(Math.round(aaa*100)/100.0);
							}	

						};

					ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

service.scheduleAtFixedRate(runnable, 0, 2, TimeUnit.SECONDS);

}

}
