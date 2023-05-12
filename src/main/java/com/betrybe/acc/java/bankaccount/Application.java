package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    AccountNumberFormatter accountFormater = new AccountNumberFormatter();
    Scanner scn = new Scanner(System.in);

    System.out.println("Informe o número da conta:");

    System.out.println("Numero da conta: " + accountFormater.formatAccountNumber(scn.nextInt()));

    scn.close();
  }

}
