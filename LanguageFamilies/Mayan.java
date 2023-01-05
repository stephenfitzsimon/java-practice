class Mayan extends Language {
    
    Mayan(String langName, int speakers) {
        super(langName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        String info = this.name + " is spoken by " 
            + this.numSpeakers+ " people mainly in " 
            + this.regionSpoken + ".\n"
            + "The language follows the word order: "
            + this.wordOrder + ".\n"
            + "Fun fact: " + this.name + " is an ergative language.";
        System.out.println(info);
    }
}
