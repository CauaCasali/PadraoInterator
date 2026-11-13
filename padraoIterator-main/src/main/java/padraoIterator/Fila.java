package padraoIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Fila implements Iterable<Ticket>{

    private List<Ticket> tickets = new ArrayList<Ticket>();

    public Fila(Ticket... tickets) {
        this.tickets = Arrays.asList(tickets);
    }

    @Override
    public Iterator<Ticket> iterator() {
        return tickets.iterator();
    }

}
