package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistics")
public class Player {

    @Id
    @Column(name = "player_name", unique = true)
    private String playerName;
    private String nation;
    private String position;
    private Integer age;
    private Integer matches_played;
    private Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    private Double penalties_scored;
    private Double yellow_cards;
    private Double red_cards;
    private Double expected_goals;
    private Double expected_assists;
    private String team_name;

    public Player() {
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player(String name, String nation, String position, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.playerName = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_played = mp;
        this.starts = starts;
        this.minutes_played = min;
        this.goals = gls;
        this.assists = ast;
        this.penalties_scored = pk;
        this.yellow_cards = crdy;
        this.red_cards = crdr;
        this.expected_goals = xg;
        this.expected_assists = xag;
        this.team_name = team;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return matches_played;
    }

    public void setMp(Integer mp) {
        this.matches_played = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return minutes_played;
    }

    public void setMin(Double min) {
        this.minutes_played = min;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double gls) {
        this.goals = gls;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double ast) {
        this.assists = ast;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public void setPenalties_scored(Double pk) {
        this.penalties_scored = pk;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double crdy) {
        this.yellow_cards = crdy;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double crdr) {
        this.red_cards = crdr;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public void setExpected_goals(Double xg) {
        this.expected_goals = xg;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public void setExpected_assists(Double xag) {
        this.expected_assists = xag;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team) {
        this.team_name = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matches_played=" + matches_played +
                ", starts=" + starts +
                ", minutes_played=" + minutes_played +
                ", goals=" + goals +
                ", assists=" + assists +
                ", penalties_scored=" + penalties_scored +
                ", yellow_cards=" + yellow_cards +
                ", red_cards=" + red_cards +
                ", expected_goals=" + expected_goals +
                ", expected_assists=" + expected_assists +
                ", team_name='" + team_name + '\'' +
                '}';
    }
}
