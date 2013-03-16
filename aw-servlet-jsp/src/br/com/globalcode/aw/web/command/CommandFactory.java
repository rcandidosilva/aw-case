package br.com.globalcode.aw.web.command;

import br.com.globalcode.aw.util.Debug;
import javax.servlet.http.HttpServletRequest;

public class CommandFactory {
           
  public static String prefixoClasse = "br.com.globalcode.aw.business.command.";

  public static WebCommand createWebCommand(HttpServletRequest request) throws WebCommandException {
    //Regra de analise de request para criação de Command
    //Neste caso estamos utilizando o nome do Command no Request
    String command = request.getParameter("command");
    Debug.log("Criando command " + command,9);
    if(command == null || command.equals("")) {
      throw new WebCommandException("Command não foi informado ou é nulo");
    }
    //Temos certeza que haverá uma Classe com o nome do command + Command
    Class classe = null;
    try {
        // command = Listar
        // br.com.globalcode.aw.business.command.admin.categoria.ListarCommand
      classe = Class.forName(prefixoClasse + command + "Command");
    }
    catch(ClassNotFoundException e) {
      throw new WebCommandException("Classe " + command + " não encontrada ou inconsistente.", e);
    }
    Object objetoCommand = null;
    try {
      objetoCommand = classe.newInstance();
    }
    catch(Exception e) {
      throw new WebCommandException("Erro ao criar objeto do command " + command +".", e);
    }
    return (WebCommand) objetoCommand;
  }
}
