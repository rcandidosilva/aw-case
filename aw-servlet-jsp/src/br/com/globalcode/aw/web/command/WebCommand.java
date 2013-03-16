package br.com.globalcode.aw.web.command;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface WebCommand {
  public void doAction(HttpServletRequest request, HttpServletResponse response) throws WebCommandException;
}
