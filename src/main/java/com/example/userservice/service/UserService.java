package com.example.userservice.service;


import com.example.userservice.dto.RegiDto;

import java.util.Map;

public interface UserService {
    public RegiDto regiUser(RegiDto userDto);

    public RegiDto login(RegiDto userDto);


    public boolean checkId(String userId);

    Map<String, String> getBankAccount(int id);

}
