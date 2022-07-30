package com.jeya.springboothibernate.springboothibernaterest.login;

import com.jeya.springboothibernate.springboothibernaterest.Mapper;
import org.springframework.stereotype.Component;

@Component("loginMapper")
public class LoginMapper implements Mapper<LoginData, Login>
{
  @Override
  public Login toEntity(LoginData loginData)
  {
    Login login = new Login();
    login.setCustomer(loginData.getCustomer());
    login.setUsername(loginData.getUsername());
    login.setPassword(loginData.getPassword());
    return login;
  }

  @Override
  public LoginData toDataObject(Login login)
  {
    LoginData loginData = new LoginData();
    loginData.setCustomer(login.getCustomer());
    loginData.setUsername(login.getUsername());
    loginData.setPassword(login.getPassword());
    return loginData;
  }
}
