import com.sun.source.tree.BreakTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concert
{
    private int DEFAULT_TICKET_PRICE_IN_EUROS;
    private int MINIMUM_PRICE;
    private Artist artist;
    private Venue venue;
    private LocalDate date;
    private List<Ticket> soldTickets;
    private int priceInEuros;

    public Concert(Artist artist, Venue venue, LocalDate date)
    {
        this.artist = artist;
        this.venue = venue;
        this.date = date;
        this.DEFAULT_TICKET_PRICE_IN_EUROS = 50;
        this.MINIMUM_PRICE = 1;
        this.soldTickets = new ArrayList<>();
    }

    public int getDEFAULT_TICKET_PRICE_IN_EUROS()
    {
        return this.DEFAULT_TICKET_PRICE_IN_EUROS;
    }

    public void setDEFAULT_TICKET_PRICE_IN_EUROS(int DEFAULT_TICKET_PRICE_IN_EUROS)
    {
        this.DEFAULT_TICKET_PRICE_IN_EUROS = DEFAULT_TICKET_PRICE_IN_EUROS;
    }

    public int getMINIMUM_PRICE()
    {
        return this.MINIMUM_PRICE;
    }

    public void setMINIMUM_PRICE(int MINIMUM_PRICE)
    {
        this.MINIMUM_PRICE = MINIMUM_PRICE;
    }

    public Artist getArtist()
    {
        return this.artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    public Venue getVenue()
    {
        return this.venue;
    }

    public void setVenue(Venue venue)
    {
        this.venue = venue;
    }

    public LocalDate getDate()
    {
        return this.date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public List<Ticket> getSoldTickets()
    {
        return this.soldTickets;
    }

    public void setSoldTickets(List<Ticket> soldTickets)
    {
        this.soldTickets = soldTickets;
    }

    public int getPriceInEuros()
    {
        return this.priceInEuros;
    }

    public void setPriceInEuros(int priceInEuros)
    {
        if (priceInEuros <= 0)
        {
            throw new IllegalArgumentException("Price can't be 0 or below");
        }
        this.priceInEuros = priceInEuros;
    }

    public boolean hasOccured()
    {
        if (getDate().isAfter(LocalDate.now()))
        {
            return true;
        }

        return false;
    }

    public void addTicket(Ticket ticket)
    {
        soldTickets.add(ticket);
    }

    public void removeTicket(Ticket ticket)
    {
        soldTickets.remove(ticket);
    }

    public int getAmountOfTickets()
    {
        int amountOfTickets = 0;
        for (Ticket ticket : soldTickets)
        {
            amountOfTickets++;
        }

        return amountOfTickets;
    }

    public int getRevenueInEuros()
    {
        int amountOfTickets = 0;
        int totalPrice = 0;
        for (Ticket ticket : soldTickets)
        {
            amountOfTickets++;
        }
        totalPrice = amountOfTickets * getPriceInEuros();

        return totalPrice;
    }

    public boolean isSoldOut()
    {
        int amountOfTickets = 0;
        for (Ticket ticket : soldTickets)
        {
            amountOfTickets++;
        }

        if (amountOfTickets == venue.getMaxCapacity())
        {
            return true;
        }

        return false;
    }
}
