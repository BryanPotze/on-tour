public class TicketService
{
    private TourManager tourManager;

    public TicketService(TourManager tourManager)
    {
        this.tourManager = tourManager;
    }

    public TourManager getTourManager()
    {
        return this.tourManager;
    }

    public void setTourManager(TourManager tourManager)
    {
        this.tourManager = tourManager;
    }

    public int getTotalRevenueInEuro(String artistName)
    {
        int totalRevenueByArtist = 0;
        for (Concert concert : tourManager.getConcerts())
        {
            if (concert.getArtist().equals(artistName))
            {
                totalRevenueByArtist =+ concert.getRevenueInEuros();
            }
        }

        return totalRevenueByArtist;
    }

    public boolean isSoldOut(int amountOfTickets, Concert concert)
    {
        int amountOfSoldTickets = 0;
        for (Concert concert1 : getTourManager().getConcerts())
        {
           if (concert1.getSoldTickets().equals(concert1.getVenue().getMINIMUM_CAPACITY()))
           {
               return true;
           }
        }

        return false;
    }

    private void reserveTickets(int amountOfTickets, Concert consert)
    {
        for (Concert concert : getTourManager().getConcerts())
        {
        }
    }

    private int getTotalAmountOfRevenueInEuros(String artistName)
    {
        int amountInEuros =  tourManager.getTotalRevenueInEuros(artistName);

        return amountInEuros;
    }
}
