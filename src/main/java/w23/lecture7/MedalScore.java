package w23.lecture7;

public class MedalScore {
    private String country;
    private int medalCount;


    public MedalScore(String country, int medalCount) {
        this.country = country;
        this.medalCount = medalCount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
