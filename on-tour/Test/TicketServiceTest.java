import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceTest
{
    private TicketService ticketService;
    private TourManager tourManager;
    private Concert conert1;
    private Concert concert2;
    private Artist artist1;
    private Artist artist2;
    private Venue venue1;
    private LocalDate date;

    @BeforeEach
    void setUp()
    {
        this.ticketService = new TicketService(tourManager);
        this.tourManager = new TourManager("klaas", 2);
        this.conert1 = new Concert(artist1, venue1, date);
        this.concert2 = new Concert(artist2, venue1 , date);
        this.artist1 = new Artist("test", "sang");
        this.artist2 = new Artist("test2" , "meer gezang");
    }

    @Test
    void getTotalAmountOfRevenueInEuros()
    {
    }
}