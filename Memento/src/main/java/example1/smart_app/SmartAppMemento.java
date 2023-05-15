package example1.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppMemento {

  private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    public Double getVersion() {
        return version;
    }
}
