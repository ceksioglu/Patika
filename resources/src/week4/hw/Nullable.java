package week4.hw;

public class Nullable
{
    private final String value;

    public Nullable(String value)
    {
        this.value = value;
    }
    public String getValue()
    {
        return value;
    }
    public boolean isNull()
    {
        return value == null;
    }
    @Override
    public String toString()
    {
        return isNull() ? "null" : value;
    }
}