package com.jeya.springboothibernate.springboothibernaterest.login;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class DefaultLoginService implements LoginService
{
  @Autowired
  private LoginRepository loginRepository;
  @Autowired
  private LoginMapper loginMapper;

  @Override
  public LoginData saveLogin(LoginData loginData)
  {
    Login loginModel = loginMapper.toEntity(loginData);
    return loginMapper.toDataObject(loginRepository.save(loginModel));
  }

  @Override
  public boolean deleteLogin(Long loginId)
  {
    loginRepository.deleteById(loginId);
    return true;
  }

  @Override
  public LoginData getLoginById(Long customerId)
  {
    return loginMapper.toDataObject(loginRepository.findById(customerId)
                                      .orElseThrow(() -> new EntityNotFoundException("Login not found")));
  }
}
