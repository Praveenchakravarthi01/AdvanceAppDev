package com.pramoth.college_admission_portal.service.impl;

import com.pramoth.college_admission_portal.dto.request.AuthenticationRequest;
import com.pramoth.college_admission_portal.dto.request.RegisterRequest;

public interface AuthService {

    boolean userRegistration(RegisterRequest request);

    Object userAuthentication(AuthenticationRequest request);
}
