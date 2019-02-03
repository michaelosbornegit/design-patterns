/**
  A class that represents the components inside a PC
*/
public class PersonalComputer {

  private final String myCPU;
  private final String myMotherBoard;

  private String myGPU;
  private String mySoundCard;


  public static class Builder {

    // Required parameters
    private final String builderCPU;
    private final String builderMotherBoard;

    // Initialize optional fields with default values
    private String builderGPU = "No GPU";
    private String builderSoundCard = "No Sound Card";

    // Put required fields in the builder's constructor
    // e.g. in this simplified example, a computer at minimum needs a cpu and
    // a motherboard
    public Builder(final String theCPU, final String theMotherBoard) {
      builderCPU = theCPU;
      builderMotherBoard = theMotherBoard;
    }

    public Builder addGPU(final String theGPU) {
      builderGPU = theGPU;
      return this;
    }

    public Builder addSoundCard(final String theSoundCard) {
      builderSoundCard = theSoundCard;
      return this;
    }

    public PersonalComputer build() {
      return new PersonalComputer(this);
    }
  }

  // Construct a PersonalComputer internally from the builder
  private PersonalComputer(final Builder builder) {
    myCPU = builder.builderCPU;
    myMotherBoard = builder.builderMotherBoard;
    myGPU = builder.builderGPU;
    mySoundCard = builder.builderSoundCard;
  }

  @Override
  public String toString() {
    return "CPU: " + myCPU
         + "Motherboard: " + myMotherBoard
         + "GPU: " + myGPU
         + "SoundCard: " + mySoundCard;
  }
}
