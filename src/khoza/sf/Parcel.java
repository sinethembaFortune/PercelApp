package khoza.sf;
import java.util.Random;

/**
 *
 * @author Mr
 */
public class Parcel {
    private String sName;
    private String sid;
    private String smobile;
    private String ssenderCity;
    private String ssenderCounty;
    private String rFullNameT;
    private String recCityT;
    private Double price;
    private String choice;
    private int randomPin;
    
    public Parcel(String sName, String sid, String smobile, String ssenderCity, String ssenderCounty, String rFullNameT, String recCityT, String choice, Integer randomPin) {
        this.sName = sName;
        this.sid = sid;
        this.smobile = smobile;
        this.ssenderCity = ssenderCity;
        this.ssenderCounty = ssenderCounty;
        this.rFullNameT = rFullNameT;
        this.recCityT = recCityT;
        this.choice = choice;
        getRandomPinNumber();
        calParcelPrice();
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSmobile() {
        return smobile;
    }
    public void setSmobile(String smobile) {
        this.smobile = smobile;
    }
    public String getSsenderCity() {
        return ssenderCity;
    }
    public void setSsenderCity(String ssenderCity) {
        this.ssenderCity = ssenderCity;
    }
    public String getSsenderCounty() {
        return ssenderCounty;
    }
    public void setSsenderCounty(String ssenderCounty) {
        this.ssenderCounty = ssenderCounty;
    }
    public String getrFullNameT() {
        return rFullNameT;
    }
    public void setrFullNameT(String rFullNameT) {
        this.rFullNameT = rFullNameT;
    }
    public String getRecCityT() {
        return recCityT;
    }
    public void setRecCityT(String recCityT) {
        this.recCityT = recCityT;
    }
    public Double getPrice() {

        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getChoice() {
        return choice;
    }
    public void setChoice(String choice) {
        this.choice = choice;
    }
    //This is the helper method to give us the amount of the package the use choose.
    public void calParcelPrice() {
        if (choice.equalsIgnoreCase("Standard Bag(R59.00)")) {
            price = 59.00;
        } else {
            price = 100.00;
        }
    }
    //helper mehod to help us to generate the pin.
    public void getRandomPinNumber() {
        Random rand = new Random();
        int min = 1000, max = 9999;
        randomPin = rand.nextInt(max - min) + min;
    }
    public int getRandomPin() {

        return randomPin;
    }
    public void setRandomPin(int randomPin) {
        this.randomPin = randomPin;
    }
    //helper method to concatinate the string
    public String concatinatingDetails() {
        return "Name: " + sName + "\nID: " + sid + "\nPhone Number: " + smobile + "\nSender City: "
                + ssenderCity + "\nSender County: " + ssenderCounty + "\nFull Name: " + rFullNameT
                + "\nReciever City: " + recCityT + "\nChoice: " + choice + "\nPrice: " + price + "\nGetting parcel Pin: " + randomPin + "\n";
    }
    
}
