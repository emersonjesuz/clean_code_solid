package elimine_numeros_palavras_magicas;

public class exemplo {

  // FORMA INCORRETA
  public boolean ullDayElapsedError(int seconds) {
    return seconds >= 86400;
  }

  // FORMA CORRETA
  public boolean fullDayElapsedCORRECT(int seconds) {
    int SECONDS_IN_DAY = 86400;
    return seconds >= SECONDS_IN_DAY;
  }
}
