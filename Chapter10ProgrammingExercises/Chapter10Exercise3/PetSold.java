package Chapter10Exercise3;

public class PetSold extends ItemSold {

    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    public boolean getIsHousebroken() {
        return housebroken;
    }
    public boolean getIsVaccinated(){
        return vaccinated;
    }
    public boolean getIsNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
