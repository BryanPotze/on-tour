import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourManager
{
    private String name;
    private int maxAmountOfArtist;
    private List<Artist> artists;
    private List<Venue> venues;
    private List<Concert> concerts;

    public TourManager(String name, int maxAmountOfArtist)
    {
        this.name = name;
        this.maxAmountOfArtist = maxAmountOfArtist;
        this.artists = new ArrayList<>();
        this.venues = new ArrayList<>();
        this.concerts = new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if (name.isEmpty())
        {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;
    }

    public int getMaxAmountOfArtist()
    {
        return this.maxAmountOfArtist;
    }

    public void setMaxAmountOfArtist(int maxAmountOfArtist)
    {
        if (maxAmountOfArtist <= 0)
        {
            throw new IllegalArgumentException("Max amount of artist can't be 0 or below");
        }
        this.maxAmountOfArtist = maxAmountOfArtist;
    }

    public List<Artist> getArtists()
    {
        return this.artists;
    }

    public void setArtists(List<Artist> artists)
    {
        this.artists = artists;
    }

    public List<Venue> getVenues()
    {
        return this.venues;
    }

    public void setVenues(List<Venue> venues)
    {
        this.venues = venues;
    }

    public List<Concert> getConcerts()
    {
        return this.concerts;
    }

    public void setConcerts(List<Concert> concerts)
    {
        this.concerts = concerts;
    }

    public void addArtist(Artist artist)
    {
        if (artist.equals(maxAmountOfArtist))
        {
            throw new IllegalArgumentException("max amount of artist has been reached");
        }
        artists.add(artist);
    }

    public void addVenue(Venue venue)
    {
        venues.add(venue);
    }

    public void addConcert(Concert concert)
    {
        concerts.add(concert);
    }

    public Concert getConcert(Artist artist, Venue venue, LocalDate localDate)
    {
        Concert filteredConcert = null;

        for (Artist artist1 : artists)
        {
            if (artist1.equals(artist))
            {
                for (Venue venue1 : venues)
                {
                    if (venue1.equals(venue))
                    {
                       filteredConcert.getDate().equals(localDate);
                    }
                }
            }
        }
        return filteredConcert;
    }

    public Artist getArtistByName(String name)
    {
        for (Artist artist : artists)
        {
            if (artist.equals(name))
            {
                return artist;
            }
        }
        return null;
    }

    public Venue getVenueByName(String name)
    {
        for (Venue venue : venues)
        {
            if (venue.equals(name))
            {
                return venue;
            }
        }
        return null;
    }

    public int getTotalRevenueInEuros(String artistName)
    {
        int totalRevenueAmount = 0;
        for (Concert concert : concerts)
        {
            if (artists.equals(artistName))
            {
                totalRevenueAmount += concert.getPriceInEuros();
            }
        }

        return totalRevenueAmount;
    }
}
