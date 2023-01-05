class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String region, String order) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = region;
        this.wordOrder = order;
    }

    public void getInfo() {
        String info = this.name + " is spoken by " 
            + this.numSpeakers+ " people mainly in " 
            + this.regionSpoken + ".\n"
            + "The language follows the word order: "
            + this.wordOrder + ".";
        System.out.println(info);
    }
    public static void main(String[] args) {
        Language french = new Language("French", 20000000, "Europe", "subject-verb-object");
        french.getInfo();
        Mayan chontal = new Mayan("Chontal", 37000);
        chontal.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920000000);
        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        mandarin.getInfo();
        burmese.getInfo();
    }
}
