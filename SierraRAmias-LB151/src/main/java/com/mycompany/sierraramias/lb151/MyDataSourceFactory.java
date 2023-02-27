/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sierraramias.lb151;

/**
 *
 * @author nutze
 */
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyDataSourceFactory {
    
  public static DataSource getDataSource() throws NamingException {
    InitialContext ic = new InitialContext();
    return (DataSource) ic.lookup("java:/comp/env/jdbc/gluecksrad");
  }
}

