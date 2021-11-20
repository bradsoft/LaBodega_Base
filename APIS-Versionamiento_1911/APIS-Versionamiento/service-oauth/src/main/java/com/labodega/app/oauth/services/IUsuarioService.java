package com.labodega.app.oauth.services;

import com.labodega.app.oauth.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
