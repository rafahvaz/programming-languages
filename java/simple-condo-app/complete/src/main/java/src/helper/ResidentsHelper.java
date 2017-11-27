package src.helper;

import src.models.Resident;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class ResidentsHelper {
    private static ResidentsHelper ourInstance = new ResidentsHelper();
    private ArrayList<Resident> residents = new ArrayList<Resident>();
    private String[] names = new String[10];
    private AtomicLong counter = new AtomicLong();
    private AtomicLong aptCounter = new AtomicLong();

    public static ResidentsHelper getInstance() {
        return ourInstance;
    }

    private ResidentsHelper() {
        residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "José da Silva",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));
        residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Francisco Uchoa",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));
        residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Luis Carvalho",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));;
        residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Paulo Castro",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));;
         residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Maria Costa",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));;
        residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Fernanda Oliveira",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));;
         residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Olívia Soares",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));;
        residents.add(new Resident(
                Math.toIntExact(this.counter.incrementAndGet()),
               "Mauro Coelho",
               "33383577457",
                Math.toIntExact(this.aptCounter.incrementAndGet())
        ));;
    }

    public ArrayList<Resident> getResidentsList() {
        return this.residents;
    }

}