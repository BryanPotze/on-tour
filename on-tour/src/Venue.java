public class Venue
{
    private int MINIMUM_CAPACITY;
    private String name;
    private String city;
    private int maxCapacity;

    public Venue(String name, String city, int maxCapacity)
    {
        this.name = name;
        this.city = city;
        this.maxCapacity = maxCapacity;
        this.MINIMUM_CAPACITY = 0;
    }

    public int getMINIMUM_CAPACITY()
    {
        return this.MINIMUM_CAPACITY;
    }

    public void setMINIMUM_CAPACITY(int MINIMUM_CAPACITY)
    {
        this.MINIMUM_CAPACITY = MINIMUM_CAPACITY;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if (name.isEmpty())
        {
            throw new IllegalArgumentException("Name is empty");
        }
        this.name = name;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        if (city.isEmpty())
        {
            throw new IllegalArgumentException("City is empty");
        }
        this.city = city;
    }

    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity)
    {
        if (maxCapacity <= 0)
        {
            throw new IllegalArgumentException("Max capacity can't be smaller or equal to 0");
        }
        this.maxCapacity = maxCapacity;
    }
}
