package com.labodega.app.oauth.security.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessErrorHandler implements AuthenticationEventPublisher {

    private Logger log = LoggerFactory.getLogger(AuthenticationSuccessErrorHandler.class);
    
    @Override
    public void publishAuthenticationSuccess(Authentication authentication) {

	UserDetails user = (UserDetails)authentication.getPrincipal();
	System.out.println("success login " + user.getUsername());
	log.info("success login " + user.getUsername());
    }

    @Override
    public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
	
	log.error("Error login " + exception.getMessage());
	System.out.println("Error login " + exception.getMessage());
    }

}
