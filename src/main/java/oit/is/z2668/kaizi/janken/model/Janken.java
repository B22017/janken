package oit.is.z2668.kaizi.janken.model;

public class Janken {
  String name;
  String userHand;
  String cpuHand = "Gu";
  String result;

  public Janken(String userHand) {
    this.userHand = userHand;
    this.cpuHand   = "Gu";
    if (userHand.equals("Gu")) {
      this.result = "Draw";
    } else if (userHand.equals("Tyoki")) {
      this.result = "You Lose";
    } else {
      this.result = "You Win!";
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserHand() {
    return userHand;
  }

  public void setUserHand(String userHand) {
    this.userHand = userHand;
  }

  public String getCpuHand() {
    return cpuHand;
  }

  public void setCpuHand(String cpuHand) {
    this.cpuHand = cpuHand;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
