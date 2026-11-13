package padraoIterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFilaTest {

    @Test
    void deveContarTicketsResolvidosFila() {
        Fila fila = new Fila(
                new Ticket("Erro ao fazer login", true),
                new Ticket("Sistema lento", true),
                new Ticket("Falha no pagamento", false),
                new Ticket("Erro de conexão", true)
        );
        assertEquals(3, RelatorioFila.contarTicketsResolvidosFila(fila));
    }

    @Test
    void deveContarTotalTicketsFila() {
        Fila fila = new Fila(
                new Ticket("Erro ao fazer login", true),
                new Ticket("Sistema lento", true),
                new Ticket("Falha no pagamento", false),
                new Ticket("Erro de conexão", true)
        );
        assertEquals(4, RelatorioFila.contarTotalTicketsFila(fila));
    }

}
