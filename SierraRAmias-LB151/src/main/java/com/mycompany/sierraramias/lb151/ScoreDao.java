/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sierraramias.lb151;

import java.util.List;

/**
 *
 * @author nutze
 */
public interface ScoreDao {
  void addScore(Score score);
  List<Score> getHighscores();
}
