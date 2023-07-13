package com.sysmap.backend.redesocialbakcend.services.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateUserRequest(
        @NotBlank(message = "Campo requerido") @Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres") String name,
        @NotBlank(message = "Campo requerido") @Size(min = 6, message = "A senha deve ter no minimo 6 caracteres") String password
) {
}
