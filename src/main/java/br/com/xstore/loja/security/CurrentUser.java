package br.com.xstore.loja.security;

import java.security.Principal;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.xstore.loja.daos.SecurityDao;
import br.com.xstore.loja.models.SystemUser;

@Model
public class CurrentUser {

	@Inject
	private HttpServletRequest request;

	@Inject
	private SecurityDao securityDao;

	private SystemUser systemUser;

	@PostConstruct
	private void loadSystemUser() {

		Principal principal = request.getUserPrincipal();
		if (principal != null) {
			String email = principal.getName();
			systemUser = securityDao.findByEmail(email);
		}
	}

	public SystemUser get() {
		return systemUser;
	}

	public boolean hasRole(String name) {
		return request.isUserInRole(name);
	}

	public String logout() {
		request.getSession().invalidate();

		return "/livros/lista.xhtml?faces-redirect=true";
	}
}
