/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sierraramias.lb151;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbcScoreDao implements ScoreDao {
  private final DataSource dataSource; // a DataSource object for connecting to the database

  public JdbcScoreDao(DataSource dataSource) {
    this.dataSource = dataSource;
  }

    JdbcScoreDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  @Override
  public void addScore(Score score) {
    try (Connection conn = dataSource.getConnection()) {
      String sql = "INSERT INTO scoreliste (name, amount, tries, date) VALUES (?, ?, ?, ?)";
      try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, score.getName());
        stmt.setInt(2, score.getAmount());
        stmt.setInt(3, score.getTries());
        stmt.setDate(4, new java.sql.Date(score.getDate().getTime()));
        stmt.executeUpdate();
      }
    } catch (SQLException e) {
      // handle exception
    }
  }

  @Override
  public List<Score> getHighscores() {
    List<Score> highscores = new ArrayList<>();
    try (Connection conn = dataSource.getConnection()) {
      String sql = "SELECT name, amount, tries, date FROM scoreliste ORDER BY amount DESC";
      try (Statement stmt = conn.createStatement()) {
        try (ResultSet rs = stmt.executeQuery(sql)) {
          while (rs.next()) {
            String name = rs.getString("name");
            int amount = rs.getInt("amount");
            int tries = rs.getInt("tries");
            Date date = rs.getDate("date");
            Score score = new Score(name, amount, tries, date);
            highscores.add(score);
          }
        }
      }
    } catch (SQLException e) {
      // handle exception
    }
    return highscores;
  }

  // getters and setters for dataSource
}

