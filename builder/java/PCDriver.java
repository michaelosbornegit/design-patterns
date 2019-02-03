public class PCDriver {
  public static void main(String[] args) {
    // Example of using builder.
    PersonalComputer pc1 = new PersonalComputer.Builder(
      "Intel 8700k",
      "Asus z370")
      .addGPU("GTX 1080 ti")
      .build();

  }
}
