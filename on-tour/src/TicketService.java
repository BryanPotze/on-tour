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

    public int getTotalAmountOfRevenueInEuros(String artistName)
    {
        int amountInEuros =  tourManager.getTotalRevenueInEuros(artistName);

        return amountInEuros;
    }
}
