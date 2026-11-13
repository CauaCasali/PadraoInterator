package padraoIterator;

import java.util.Iterator;

public class RelatorioFila {
    public static Integer contarTicketsResolvidosFila(Fila fila) {
        int quantidade = 0;
        for (Ticket ticket : fila) {
            if (ticket.isResolvido()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalTicketsFila(Fila fila) {
        int quantidade = 0;
        for (Iterator<Ticket> a = fila.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
