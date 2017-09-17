package Chapter10Exercise3;

public class DemoItemsAndPets {

    public static void main(String args[]){
        ItemSold item1 = new ItemSold();
        item1.setInvoiceNumber(36);
        item1.setDescription("Cat scratching post");
        item1.setPrice(24.50);
        display(item1);

        ItemSold item2 = new ItemSold();
        item2.setInvoiceNumber(37);
        item2.setDescription("Dog bed - Large");
        item2.setPrice(35.85);
        display(item2);

        PetSold pet1 = new PetSold();
        pet1.setInvoiceNumber(156);
        pet1.setDescription("Golden Retriever");
        pet1.setHousebroken(true);
        pet1.setNeutered(false);
        pet1.setVaccinated(true);
        pet1.setPrice(460.75);
        display(pet1);
        displayPet(pet1);

        PetSold pet2 = new PetSold();
        pet2.setInvoiceNumber(1442);
        pet2.setDescription("Guinea Pig");
        pet2.setHousebroken(false);
        pet2.setNeutered(true);
        pet2.setVaccinated(false);
        pet2.setPrice(125);
        display(pet2);
        displayPet(pet2);

    }
    public static void display(ItemSold item){
        System.out.println("\nInvoice #"+item.getInvoiceNumber());
        System.out.println("Description: "+item.getDescription());
        System.out.println("Total price: $"+item.getPrice());
    }
    public static void displayPet(PetSold pet){
        System.out.println("Vaccinated: "+pet.getIsVaccinated());
        System.out.println("Housebroken: "+pet.getIsHousebroken());
        System.out.println("Neutered: "+pet.getIsNeutered()+"\n");
    }


}
