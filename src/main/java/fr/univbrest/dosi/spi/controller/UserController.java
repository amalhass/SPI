package fr.univbrest.dosi.spi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.univbrest.dosi.spi.business.UserService;
import fr.univbrest.dosi.spi.entites.User;
import fr.univbrest.dosi.spi.exception.SPIException;

public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/auth", method = RequestMethod.POST, headers = "Accept=Application/json")
	public void authentifier(final HttpServletRequest request,
			@RequestBody final User user) {
		final User users = userService.authentifier(user.getUserName(),
				user.getPwd());

		if (users != null) {
			request.getSession().setAttribute("user", users);
		} else {
			request.getSession().removeAttribute("user");
			throw new SPIException("Impossible de s'authentifier");
		}

	}

	@RequestMapping(value = "/user")
	public User users(final HttpServletRequest request,
			final HttpServletResponse response) {
		final User user = (User) request.getSession().getAttribute("user");
		return user;

	}

	@RequestMapping(value = "/deconnexion", method = RequestMethod.GET)
	public void authentifier(final HttpServletRequest request) {
		request.getSession().removeAttribute("user");

	}

}
