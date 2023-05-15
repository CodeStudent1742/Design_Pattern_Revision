package example1.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCareTaker {

    private List<SmartAppMemento> mementos = new ArrayList<>();

   public void addMemento(SmartAppMemento smartAppMemento){
       mementos.add(smartAppMemento);
       System.out.println("Zapisana wersja: " + smartAppMemento.getVersion() + " znajduje się pod indeksem: " + (mementos.size()-1));
   }
   public SmartAppMemento getMemento(int index){
       System.out.println("Wczytana wersja: ");
       return mementos.get(index);
   }
}
