package com.jeya.springboothibernate.springboothibernaterest.login;

public interface LoginService
{
  LoginData saveLogin(LoginData loginData);

  boolean deleteLogin(Long loginId);

  LoginData getLoginById(Long loginId);
}
