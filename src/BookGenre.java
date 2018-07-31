public enum BookGenre {

        THRILLER("Stuff like James Bond"),
        CRIME("Stories about drug dealers and murderers"),
        ROMANCE("Nice love stories"),
        NONFICTION("This stuff really happened"),
        OTHER("Weird stuff you don't even want to know about");

        private final String description;

        BookGenre(String description){
            this.description = description;
        }

        public String getDescription(){
            return description;
        }
}
