package DragosT.AccessModifiers;

public class PrivateNoAccessEx {

  public void decarepetrecere() {
    PrivateAccessExample eventprivat = new PrivateAccessExample();
    // eventprivat.tippetrecere(); // nu il poate ajunge pt ca este private si nu este in aceeasi
    // clasa
    // System.out.println(eventprivat.stringprivat); // la fel aceasta variabila este private

  }
}
