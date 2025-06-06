/**
 * @author falvesmac
 */

package br.com.falves.PadroesDeProjeto1;

public class ConfiguracoesApp {
  private String nomeApp, versaoApp;
  private boolean modoDebug;

  public String getNomeApp() {
    return nomeApp;
  }

  public String getVersaoApp() {
    return versaoApp;
  }

  public boolean isModoDebug() {
    return modoDebug;
  }

  private ConfiguracoesApp() {
    this.nomeApp = "App Contábil";
    this.versaoApp = "1.0.0";
    this.modoDebug = true;
  };

  private static ConfiguracoesApp instancia;

  public static ConfiguracoesApp getInstancia() {
    if (instancia == null) {
      instancia = new ConfiguracoesApp();
    }
      return instancia;
  }
}